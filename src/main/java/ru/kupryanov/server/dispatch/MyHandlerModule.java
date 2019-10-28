package ru.kupryanov.server.dispatch;


import com.gwtplatform.dispatch.rpc.server.guice.HandlerModule;
import ru.kupryanov.server.dispatch.common.AddTaskHandller;
import ru.kupryanov.server.dispatch.common.GetTaskHandller;
import ru.kupryanov.server.dispatch.common.DelTaskHandller;
import ru.kupryanov.server.dispatch.common.GetTasksHandller;
import ru.kupryanov.shared.dispatch.AddTaskAction;
import ru.kupryanov.shared.dispatch.GetTaskAction;
import ru.kupryanov.shared.dispatch.GetTasksAction;
import ru.kupryanov.shared.dispatch.DelTaskAction;


public class MyHandlerModule extends HandlerModule {
    @Override
    protected void configureHandlers() {
        bindHandler(GetTasksAction.class, GetTasksHandller.class);
        bindHandler(GetTaskAction.class, GetTaskHandller.class);
        bindHandler(AddTaskAction.class, AddTaskHandller.class);
        bindHandler(DelTaskAction.class, DelTaskHandller.class);
    }
}
