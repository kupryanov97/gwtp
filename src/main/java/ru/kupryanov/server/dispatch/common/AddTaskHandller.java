package ru.kupryanov.server.dispatch.common;

import com.google.inject.Inject;
import com.gwtplatform.dispatch.rpc.server.ExecutionContext;
import com.gwtplatform.dispatch.shared.ActionException;
import ru.kupryanov.server.dao.TaskDAO;
import ru.kupryanov.server.dispatch.MyAbstractActionHandler;
import ru.kupryanov.shared.dto.Task;
import ru.kupryanov.shared.dispatch.AddTaskAction;
import ru.kupryanov.shared.dispatch.AddTaskResult;

public class AddTaskHandller extends MyAbstractActionHandler<AddTaskAction, AddTaskResult> {

    @Inject
    public AddTaskHandller() {
        super(AddTaskAction.class);
    }

    @Override
    public AddTaskResult execute(AddTaskAction action, ExecutionContext context) throws ActionException {

        Task task = new TaskDAO().saveAndReturn(action.getTask());
        return new AddTaskResult(task);
    }
}
