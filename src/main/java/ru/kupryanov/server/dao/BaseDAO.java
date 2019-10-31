package ru.kupryanov.server.dao;

import com.google.appengine.api.datastore.PreparedQuery;
import com.googlecode.objectify.Key;
import com.googlecode.objectify.cmd.Query;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static ru.kupryanov.server.dao.objectify.OfyService.ofy;

public abstract class BaseDAO<T> {
    private final Class<T> clazz;

    BaseDAO(final Class<T> clazz) {
        this.clazz = clazz;
    }

    void save(T entity){
        ofy().save().entity(entity).now();
    }

    public ArrayList<T> getAll() {
        return new ArrayList<T>(ofy().load().type(clazz).list());
    }

    public T get(Long id) {
        return ofy().load().type(clazz).id(id).now();
    }
    public List<T> listAll() {
        return ofy().load().type(clazz).list();
    }
    public Long get1(Long id) {
        // TODO probably it could be fixed by parameters of
        // work around for objectify cacheing and new query not having the
        // latest
        // data
        // ofy().clear();

        return (Long) ofy().load().type(clazz).id(id).now();
    }
    public T getByProperty(String propName, Object propValue) throws PreparedQuery.TooManyResultsException {
        Query<T> q = ofy().load().type(clazz);
        q = q.filter(propName, propValue);
        Iterator<T> fetch = q.limit(2).list().iterator();
        if (!fetch.hasNext()) {
            return null;
        }
        T obj = fetch.next();
        if (fetch.hasNext()) {
            throw new PreparedQuery.TooManyResultsException();
        }
        return obj;
    }

    private T get(Key<T> key) {
        return ofy().load().key(key).now();
    }

    private Key<T> saveNow(T entity) {
        return ofy().save().entity(entity).now();
    }

    public T saveAndReturn(T entity) {
        return get(saveNow(entity));
    }

    public void deleteById(long id){
        ofy().delete().entity(get(id));
    }

}
