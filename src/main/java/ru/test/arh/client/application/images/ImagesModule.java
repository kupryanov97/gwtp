package ru.test.arh.client.application.images;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class ImagesModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(ImagesPresenter.class, ImagesPresenter.MyView.class, ImagesView.class, ImagesPresenter.MyProxy.class);
    }
}
