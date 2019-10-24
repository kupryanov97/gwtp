package ru.test.arh.server.dispatch.common;

import com.google.inject.Inject;
import com.gwtplatform.dispatch.rpc.server.ExecutionContext;
import com.gwtplatform.dispatch.shared.ActionException;
import ru.test.arh.server.dao.TableTestPojo;
import ru.test.arh.server.dispatch.MyAbstractActionHandler;
import ru.test.arh.shared.dispatch.AddTaskAction;
import ru.test.arh.shared.dispatch.AddTaskResult;
import ru.test.arh.shared.dto.TableTestPojo1;

public class AddTaskHandller extends MyAbstractActionHandler<AddTaskAction, AddTaskResult> {

    @Inject
    public AddTaskHandller() {
        super(AddTaskAction.class);
    }

    @Override
    public AddTaskResult execute(AddTaskAction action, ExecutionContext context) throws ActionException {

        TableTestPojo1 task = new TableTestPojo().saveTaskAndReturn(action.getTask());
        return new AddTaskResult(task);
    }
}
