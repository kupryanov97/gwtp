package ru.test.arh.client.application.home;

import com.gwtplatform.dispatch.rpc.shared.DispatchAsync;
import com.gwtplatform.mvp.client.HasUiHandlers;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import ru.test.arh.client.application.ApplicationPresenter;
import ru.test.arh.client.dispatch.AsyncCallbackImpl;
import ru.test.arh.client.place.NameTokens;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import ru.test.arh.client.pojo.TableTestPojo;
import ru.test.arh.shared.dispatch.AddTaskAction;
import ru.test.arh.shared.dispatch.AddTaskResult;
import ru.test.arh.shared.dto.TableTestPojo1;

import java.util.ArrayList;
import java.util.Date;

public class HomePresenter extends Presenter<HomePresenter.MyView, HomePresenter.MyProxy> implements HomeUiHandlers {
    interface MyView extends View, HasUiHandlers<HomeUiHandlers> {
        void addTaskInTable(TableTestPojo1 task);
        void updateTable(ArrayList<TableTestPojo1> tasks);
    }

    @ProxyCodeSplit
    @NameToken(NameTokens.HOME)
    interface MyProxy extends ProxyPlace<HomePresenter> {
    }
    private final DispatchAsync dispatcher;

    @Inject
    HomePresenter(EventBus eventBus, MyView view,MyProxy proxy,DispatchAsync dispatcher) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_APPLICATION);
        this.dispatcher = dispatcher;
        getView().setUiHandlers(this);
    }
    @Override
    public void saveTask(String taskString, Date due) {
        TableTestPojo1 task = new TableTestPojo1(taskString, due);
        dispatcher.execute(new AddTaskAction(task), new AsyncCallbackImpl<AddTaskResult>() {
            @Override
            public void onSuccess(AddTaskResult addTaskResult) {
            }
        });
    }

}
