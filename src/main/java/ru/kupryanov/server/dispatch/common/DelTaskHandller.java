package ru.kupryanov.server.dispatch.common;

import com.google.inject.Inject;
import com.gwtplatform.dispatch.rpc.server.ExecutionContext;
import com.gwtplatform.dispatch.shared.ActionException;
import ru.kupryanov.server.dao.TaskDAO;
import ru.kupryanov.server.dispatch.MyAbstractActionHandler;
import ru.kupryanov.shared.dto.Task;
import ru.kupryanov.shared.dispatch.DelTaskAction;
import ru.kupryanov.shared.dispatch.DelTaskResult;
public class DelTaskHandller extends MyAbstractActionHandler<DelTaskAction, DelTaskResult> {
    @Inject
    public DelTaskHandller() {
        super(DelTaskAction.class);
    }

    @Override
    public DelTaskResult execute(DelTaskAction deleteTaskAction, ExecutionContext executionContext) throws ActionException {
        System.out.println(deleteTaskAction.getId());
        new TaskDAO().deleteById(deleteTaskAction.getId());
        return new DelTaskResult();
    }
}
