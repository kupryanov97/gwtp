package ru.kupryanov.client.application.home;

import com.gwtplatform.mvp.client.UiHandlers;

import java.util.Date;

interface HomeUiHandlers extends UiHandlers {
    void updateTable();
    void saveTask(String taskString, Date due);
    void addTaskInTable(long id);

}
