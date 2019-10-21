package ru.test.arh.client.application;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import ru.test.arh.client.application.home.HomeModule;
import ru.test.arh.client.application.images.ImagesModule;

public class ApplicationModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        install(new ImagesModule());
        install(new HomeModule());

        bindPresenter(ApplicationPresenter.class, ApplicationPresenter.MyView.class, ApplicationView.class,
                ApplicationPresenter.MyProxy.class);
    }
}
