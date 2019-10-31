package ru.kupryanov.client.event;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HasHandlers;
import ru.kupryanov.shared.dto.Task;

public class LoginAuthenticatedEvent extends GwtEvent<LoginAuthenticatedEvent.LoginAuthenticatedHandler> {

    public static Type<LoginAuthenticatedHandler> TYPE = new Type<LoginAuthenticatedHandler>();

    private final Task userDto;

    public interface LoginAuthenticatedHandler extends EventHandler {
        void onLoginAuthenticated(LoginAuthenticatedEvent event);
    }

    public LoginAuthenticatedEvent(Task userDto) {
        this.userDto = userDto;
    }

    @Override
    protected void dispatch(LoginAuthenticatedHandler handler) {
        handler.onLoginAuthenticated(this);
    }

    @Override
    public Type<LoginAuthenticatedHandler> getAssociatedType() {
        return TYPE;
    }

    public static Type<LoginAuthenticatedHandler> getType() {
        return TYPE;
    }

    public static void fire(HasHandlers source, Task userDto) {
        source.fireEvent(new LoginAuthenticatedEvent(userDto));
    }

    public Task getCurrentUser() {
        return userDto;
    }
}