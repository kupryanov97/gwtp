package ru.kupryanov.client.application.images;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.HasUiHandlers;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.annotations.ProxyEvent;
import com.gwtplatform.mvp.client.presenter.slots.NestedSlot;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import ru.kupryanov.client.application.ApplicationPresenter;
import ru.kupryanov.client.event.DelTaskEvent;
import ru.kupryanov.client.event.ReturnTaskEvent;
import ru.kupryanov.client.place.NameTokens;
import ru.kupryanov.shared.dto.Task;

import java.util.ArrayList;

public class ImagesPresenter extends Presenter<ImagesPresenter.MyView, ImagesPresenter.MyProxy> implements ImagesUiHandlers {

    interface MyView extends View, HasUiHandlers<ImagesUiHandlers> {
        void UpdateTable(ArrayList<Task> list);
        void addTaskInTable(Task task);
    }

    @ProxyCodeSplit
    @NameToken(NameTokens.IMAGES)
    interface MyProxy extends ProxyPlace<ImagesPresenter> {
    }
    private PlaceManager placeManager;

    @Inject
    ImagesPresenter(EventBus eventBus, MyView view, MyProxy proxy, PlaceManager placeManager, Task task) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_APPLICATION);
        this.placeManager = placeManager;
        getView().setUiHandlers(this);
    }

    @ProxyEvent
    public void onComplexEvent(DelTaskEvent event) {
        getView().addTaskInTable(event.getTask());
    }

    @Override
    public void returnTask(Task task) {
        ReturnTaskEvent.fire(this, task);
    }

    @Override
    protected void onReset() {
        super.onReset();
    }
}