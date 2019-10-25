package ru.kupryanov.server.dispatch.common;

import com.google.inject.Inject;
import com.gwtplatform.dispatch.rpc.server.ExecutionContext;
import com.gwtplatform.dispatch.shared.ActionException;
import ru.kupryanov.server.dao.TaskDAO;
import ru.kupryanov.server.dispatch.MyAbstractActionHandler;
import ru.kupryanov.shared.dispatch.GetTasksAction;
import ru.kupryanov.shared.dispatch.GetTasksResult;
import ru.kupryanov.shared.dto.Task;

import java.util.ArrayList;


public class GetTasksHandller extends MyAbstractActionHandler<GetTasksAction, GetTasksResult> {

    @Inject
    public GetTasksHandller() {
        super(GetTasksAction.class);
    }


    @Override
    public GetTasksResult execute(GetTasksAction action, ExecutionContext context) throws ActionException {
        ArrayList<Task> list =  new TaskDAO().getAll();
        return new GetTasksResult(list);
    }
}
