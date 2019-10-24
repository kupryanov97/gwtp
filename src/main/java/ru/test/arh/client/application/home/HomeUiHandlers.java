package ru.test.arh.client.application.home;

import com.gwtplatform.mvp.client.UiHandlers;
import ru.test.arh.client.pojo.TableTestPojo;

import java.util.Date;

interface HomeUiHandlers extends UiHandlers {
    void saveTask(String taskString, Date due);

}
