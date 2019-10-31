package ru.kupryanov.server.auth;

import ru.kupryanov.domain.AppUser;
import ru.kupryanov.server.dao.AppUserDao;
import com.google.inject.Inject;
import com.google.inject.Provider;

import javax.servlet.http.HttpSession;
import java.io.Serializable;

public class CurrentAppUserProvider implements Provider<Long>, Serializable{
    private static final long serialVersionUID = 1L;

    private static final String currentUserIdKey = "CUIDK";

    private final Provider<HttpSession> sessionProvider;

    @Inject
    public CurrentAppUserProvider(Provider<HttpSession> sessionProvider) {
        this.sessionProvider = sessionProvider;
    }

    @Override
    public Long get() {
        HttpSession session = sessionProvider.get();
        Long id = (Long) session.getAttribute(currentUserIdKey);
        Long appUser = (id != null) ? (new AppUserDao().get1(id)) : null;
        return appUser;
    }

    public void set(AppUser appUser) {
        HttpSession session = sessionProvider.get();
        session.setAttribute(currentUserIdKey, (appUser != null ? appUser.getId() : null));
    }
}
