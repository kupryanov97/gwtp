package ru.test.arh.server.dao.objectify;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.googlecode.objectify.ObjectifyFactory;
import ru.test.arh.shared.dto.TableTestPojo1;

public class OfyFactory extends ObjectifyFactory{
    private Injector injector;

    @Inject
    public OfyFactory(Injector injector) {
        this.injector = injector;
        this.register(TableTestPojo1.class);
    }

    @Override
    public <T> T construct(Class<T> type) {
        return injector.getInstance(type);
    }
}
