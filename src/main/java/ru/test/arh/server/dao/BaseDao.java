package ru.test.arh.server.dao;

import com.google.appengine.api.datastore.PreparedQuery;
import com.googlecode.objectify.Key;
import com.googlecode.objectify.cmd.LoadType;
import com.googlecode.objectify.cmd.Query;

import static com.googlecode.objectify.ObjectifyService.ofy;

import java.util.*;
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

        private T get(Key<T> key) {
            return ofy().load().key(key).now();
        }

        private Key<T> saveNow(T entity) {
            return ofy().save().entity(entity).now();
        }

        T saveAndReturn(T entity) {
            return get(saveNow(entity));
        }

        public void deleteById(long id){
            ofy().delete().entity(get(id));
        }

    }
