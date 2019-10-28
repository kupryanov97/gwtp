package ru.kupryanov.client.event;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HasHandlers;
import ru.kupryanov.shared.dto.Task;

public class DelTaskEvent extends GwtEvent<DelTaskEvent.ComplexHandler> {
    public interface ComplexHandler extends EventHandler {
        void onComplexEvent(DelTaskEvent event);
    }

    public static final Type<ComplexHandler> TYPE = new Type<>();

    private final Task task;

    public DelTaskEvent(Task task) {
        this.task = task;
    }

    public static void fire(HasHandlers source, Task task) {
        source.fireEvent(new DelTaskEvent(task));
    }

    @Override
    public Type<ComplexHandler> getAssociatedType() {
        return TYPE;
    }

    @Override
    protected void dispatch(ComplexHandler handler) {
        handler.onComplexEvent(this);
    }

    public Task getTask() {
        return task;
    }

    public static Type<ComplexHandler> getType() {
        return TYPE;
    }

}
