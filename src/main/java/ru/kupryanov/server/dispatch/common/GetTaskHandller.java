package ru.kupryanov.server.dispatch.common;

import com.google.inject.Inject;
import com.gwtplatform.dispatch.rpc.server.ExecutionContext;
import com.gwtplatform.dispatch.shared.ActionException;
import ru.kupryanov.server.dao.TaskDAO;
import ru.kupryanov.server.dispatch.MyAbstractActionHandler;
import ru.kupryanov.shared.dispatch.GetTaskAction;
import ru.kupryanov.shared.dispatch.GetTaskResult;

public class GetTaskHandller extends MyAbstractActionHandler<GetTaskAction, GetTaskResult> {
    @Inject
    public GetTaskHandller() {
        super(GetTaskAction.class);
    }


    @Override
    public GetTaskResult execute(GetTaskAction action, ExecutionContext context) throws ActionException {
        return new GetTaskResult(new TaskDAO().get(action.getId()));
    }
}
