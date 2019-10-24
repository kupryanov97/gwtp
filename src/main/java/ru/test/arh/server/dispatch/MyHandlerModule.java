package ru.test.arh.server.dispatch;


import com.gwtplatform.dispatch.rpc.server.guice.HandlerModule;
import ru.test.arh.server.dispatch.common.AddTaskHandller;
import ru.test.arh.shared.dispatch.AddTaskAction;


public class MyHandlerModule extends HandlerModule {
    @Override
    protected void configureHandlers() {

        bindHandler(AddTaskAction.class, AddTaskHandller.class);
    }
}
