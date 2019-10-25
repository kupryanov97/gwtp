package ru.kupryanov.client.gin;



import com.gwtplatform.dispatch.rpc.client.gin.RpcDispatchAsyncModule;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.gin.DefaultModule;
import ru.kupryanov.client.application.ApplicationModule;
import ru.kupryanov.client.place.NameTokens;
import ru.kupryanov.client.resources.ResourceLoader;
import ru.kupryanov.shared.dto.Task;

import java.util.ArrayList;

public class ClientModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        install(new DefaultModule.Builder()
                .defaultPlace(NameTokens.HOME)
                .errorPlace(NameTokens.HOME)
                .unauthorizedPlace(NameTokens.HOME)
                .build());

        install(new RpcDispatchAsyncModule());
        install(new ApplicationModule());

        bind(ResourceLoader.class).asEagerSingleton();
        bind(Task.class).asEagerSingleton();
        bind(ArrayList.class).asEagerSingleton();

    }
}
