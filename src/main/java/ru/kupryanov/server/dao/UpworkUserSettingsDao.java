package ru.kupryanov.server.dao;

import ru.kupryanov.domain.UpworkUserSettings;
import com.google.appengine.api.datastore.PreparedQuery;

import java.util.List;

import static com.googlecode.objectify.ObjectifyService.ofy;

public class UpworkUserSettingsDao extends BaseDAO<UpworkUserSettings> {

    public UpworkUserSettingsDao() {
        super(UpworkUserSettings.class);
    }

    protected UpworkUserSettingsDao(Class<UpworkUserSettings> clazz) {
        super(clazz);
    }

    public List<UpworkUserSettings> getAllEntities(){
        return ofy().load().type(UpworkUserSettings.class).list();
    }

    public UpworkUserSettings findByRef(String Id) throws PreparedQuery.TooManyResultsException {
        return getByProperty("userDtoRef", Id);
    }

    public UpworkUserSettings findByRef2(String Id) throws PreparedQuery.TooManyResultsException {
        return getByProperty("id", Id);
    }
}
