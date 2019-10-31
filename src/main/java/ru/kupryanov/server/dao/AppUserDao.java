package ru.kupryanov.server.dao;

import ru.kupryanov.domain.AppUser;
import com.google.appengine.api.datastore.PreparedQuery;

public class AppUserDao extends BaseDAO<AppUser> {

    public AppUserDao() {
        super(AppUser.class);
    }

    protected AppUserDao(Class<AppUser> clazz) {
        super(clazz);
    }

    public void delete(Long id) {
        // TODO temporary, until I have only one user per customer
        // user will be deleted along with the Customer
        new AppUserDao().delete(get1(id));
        // TODO am I also have to delete User StoredCredential?
    }

    public AppUser findByGoogleId(String googleId) throws PreparedQuery.TooManyResultsException {
        return getByProperty("googleId", googleId);
    }


    public AppUser findByEmail(String email) throws PreparedQuery.TooManyResultsException {
        return getByProperty("email", email);
    }

    public AppUser findByToken(String token) throws PreparedQuery.TooManyResultsException {
        return getByProperty("oauth_token", token);
    }

}
