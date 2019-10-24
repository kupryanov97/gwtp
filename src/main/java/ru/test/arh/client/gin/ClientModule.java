package ru.test.arh.client.gin;



import com.gwtplatform.dispatch.rpc.client.gin.RpcDispatchAsyncModule;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.gin.DefaultModule;
import ru.test.arh.client.application.ApplicationModule;
import ru.test.arh.client.place.NameTokens;
import ru.test.arh.client.resources.ResourceLoader;
import ru.test.arh.client.pojo.TableTestPojo;

import java.util.ArrayList;

public class ClientModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        install(new DefaultModule
                .Builder()
                .defaultPlace(NameTokens.HOME)
                .errorPlace(NameTokens.HOME)
                .unauthorizedPlace(NameTokens.HOME)
                .build());
        install(new ApplicationModule());


        install(new RpcDispatchAsyncModule());
        install(new ApplicationModule());

        bind(ResourceLoader.class).asEagerSingleton();
        bind(TableTestPojo.class).asEagerSingleton();

    }
}
