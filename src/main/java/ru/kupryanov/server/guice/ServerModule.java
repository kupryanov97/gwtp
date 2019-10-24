package ru.kupryanov.server.guice;

import com.google.inject.AbstractModule;
import ru.kupryanov.server.dao.objectify.OfyService;
import ru.kupryanov.server.dispatch.MyHandlerModule;

public class ServerModule extends AbstractModule {
    @Override
    protected void configure() {
        requestStaticInjection(OfyService.class);
        install(new MyHandlerModule());
    }
}
