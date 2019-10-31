package ru.kupryanov.client.security;

import ru.kupryanov.client.event.LoginAuthenticatedEvent;
import ru.kupryanov.client.event.LoginResetEvent;
import ru.kupryanov.shared.dto.Task;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.proxy.Gatekeeper;
import ru.kupryanov.client.event.LoginResetEvent;
import ru.kupryanov.shared.dto.Task;

import javax.inject.Inject;

abstract public class IsLoggedInGatekeeper implements Gatekeeper {
    private final EventBus eventBus;
    private Task userDto;

    @Inject
    public IsLoggedInGatekeeper(final EventBus eventBus) {
        this.eventBus = eventBus;

        this.eventBus.addHandler(LoginAuthenticatedEvent.getType(),
                event -> userDto = event.getCurrentUser());

        this.eventBus.addHandler(LoginResetEvent.getType(), event -> userDto = null);

    }

    @Override
    public boolean canReveal() {
        boolean loggedIn = false;

        if (userDto != null) {
            loggedIn = userDto.isLoggedIn();
        }

        return loggedIn;
    }

    public Task getCurrentUser() {
        return userDto;
    }



}