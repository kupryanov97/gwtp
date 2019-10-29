package ru.kupryanov.client.event;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HasHandlers;
import ru.kupryanov.shared.dto.Task;
import ru.kupryanov.shared.dto.Task;

public class ReturnTaskEvent extends GwtEvent<ReturnTaskEvent.ReturnTaskHandler> {
    public interface ReturnTaskHandler extends EventHandler {
        void onReturnTaskEvent(ReturnTaskEvent event);
    }

    public static final Type<ReturnTaskHandler> TYPE = new Type<>();

    private final Task task;

    public ReturnTaskEvent(Task task) {
        this.task = task;
    }

    public static void fire(HasHandlers source, Task task) {
        source.fireEvent(new ReturnTaskEvent(task));
    }

    @Override
    public Type<ReturnTaskHandler> getAssociatedType() {
        return TYPE;
    }

    @Override
    protected void dispatch(ReturnTaskHandler handler) {
        handler.onReturnTaskEvent(this);
    }

    public Task getTask() {
        return task;
    }

    public static Type<ReturnTaskHandler> getType() {
        return TYPE;
    }



}
