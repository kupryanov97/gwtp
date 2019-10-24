package ru.kupryanov.server.dispatch;


import com.gwtplatform.dispatch.rpc.server.guice.HandlerModule;
import ru.kupryanov.server.dispatch.common.AddTaskHandller;
import ru.kupryanov.shared.dispatch.AddTaskAction;


public class MyHandlerModule extends HandlerModule {
    @Override
    protected void configureHandlers() {

        bindHandler(AddTaskAction.class, AddTaskHandller.class);
    }
}
