package ru.kupryanov.client.application.home;

import com.google.gwt.user.client.Window;
import com.gwtplatform.dispatch.rpc.shared.DispatchAsync;
import com.gwtplatform.mvp.client.HasUiHandlers;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import ru.kupryanov.client.application.ApplicationPresenter;
import ru.kupryanov.client.dispatch.AsyncCallbackImpl;
import ru.kupryanov.client.event.DelTaskEvent;
import ru.kupryanov.client.place.NameTokens;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import ru.kupryanov.client.security.IsAdminGatekeeper;
import ru.kupryanov.shared.dispatch.*;
import ru.kupryanov.shared.dto.Task;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class HomePresenter extends Presenter<HomePresenter.MyView, HomePresenter.MyProxy> implements HomeUiHandlers {
    interface MyView extends View, HasUiHandlers<HomeUiHandlers> {
        void addTaskInTable(Task task);
        void updateTable(List<Task> tasks);
        void isLogin(boolean a);
    }

    @ProxyCodeSplit
    @NameToken(NameTokens.HOME)
    interface MyProxy extends ProxyPlace<HomePresenter> {
    }
    private final DispatchAsync dispatcher;
    private final PlaceManager placeManager;
    private final IsAdminGatekeeper gatekeeper;


    @Inject
    HomePresenter(EventBus eventBus, MyView view,MyProxy proxy,DispatchAsync dispatcher,PlaceManager placeManager,
                  IsAdminGatekeeper gatekeeper) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_APPLICATION);
        this.dispatcher = dispatcher;
        this.placeManager = placeManager;
        this.gatekeeper = gatekeeper;
        getView().setUiHandlers(this);//для замены страницы которую показываем пользователю
        updateTable();
        System.out.println("");
    }
    @Override
    public void addTaskInTable(long id){
        dispatcher.execute(new GetTaskAction(id), new AsyncCallbackImpl<GetTaskResult>() {
            @Override
            public void onSuccess(GetTaskResult getTaskResult) {
                getView().addTaskInTable(getTaskResult.getTasks());
            }
        });
    }
    @Override
    public void updateTable() {
        dispatcher.execute(new GetTasksAction(), new AsyncCallbackImpl<GetTasksResult>() {
            @Override
            public void onSuccess(GetTasksResult result) {
                List<Task> tasks = result.getTasks();
                Window.alert(""+tasks.size());
                tasks.sort(Comparator.comparing(Task::getDue));//Сортировка по дате
                getView().updateTable(tasks);
            }
        });
    }
    @Override
    public void saveTask(String taskString, Date due) {
        Task task = new Task(taskString, due);
        dispatcher.execute(new AddTaskAction(task), new AsyncCallbackImpl<AddTaskResult>() {
            @Override
            public void onSuccess(AddTaskResult addTaskResult) {
                updateTable();
            }
        });
    }
    @Override
    public void delTask(Task task) {
        System.out.println();
        dispatcher.execute(new DelTaskAction(task.getId()), new AsyncCallbackImpl<DelTaskResult>() {
            @Override
            public void onSuccess(DelTaskResult deleteTaskResult) {
                updateTable();
                onDeleteTaskEvent(task);
            }
        });
    }
    @Override
    public void onDeleteTaskEvent(Task task) {
        DelTaskEvent.fire(this, task);

    }

    @Override
    public void regButton() {

    }

    @Override
    public void GoogleButton(){
        Window.Location.replace("/AuthServlet");
    }

    @Override
    protected void onReveal() {
        getView().isLogin(gatekeeper.canReveal());
        super.onReveal();

    }

}