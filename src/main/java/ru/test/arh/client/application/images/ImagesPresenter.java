package ru.test.arh.client.application.images;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.HasUiHandlers;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.presenter.slots.NestedSlot;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import ru.test.arh.client.place.NameTokens;

public class ImagesPresenter extends Presenter<ImagesPresenter.MyView, ImagesPresenter.MyProxy> implements ImagesUiHandlers {
    interface MyView extends View, HasUiHandlers<ImagesUiHandlers> {
    }

    @NameToken(NameTokens.IMAGES)
    @ProxyCodeSplit
    interface MyProxy extends ProxyPlace<ImagesPresenter> {
    }

    public static final NestedSlot SLOT_IMAGES = new NestedSlot();

    @Inject
    ImagesPresenter(
            EventBus eventBus,
            MyView view,
            MyProxy proxy) {
        super(eventBus, view, proxy, RevealType.Root);

        getView().setUiHandlers(this);
    }

}
