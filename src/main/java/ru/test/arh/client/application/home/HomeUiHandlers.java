package ru.test.arh.client.application.home;

import com.gwtplatform.mvp.client.UiHandlers;
import java.util.Date;

interface HomeUiHandlers extends UiHandlers {

    void GoogleButton();
    void addTask(String Task, Date due);
}
