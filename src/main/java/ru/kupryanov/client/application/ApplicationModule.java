package ru.kupryanov.client.application;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import ru.kupryanov.client.application.home.HomeModule;
import ru.kupryanov.client.application.images.ImagesModule;

public class ApplicationModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        install(new ImagesModule());
        install(new HomeModule());

        bindPresenter(ApplicationPresenter.class, ApplicationPresenter.MyView.class, ApplicationView.class,
                ApplicationPresenter.MyProxy.class);
    }
}
