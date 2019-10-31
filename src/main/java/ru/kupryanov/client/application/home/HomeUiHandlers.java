package ru.kupryanov.client.application.home;

import com.gwtplatform.mvp.client.UiHandlers;
import ru.kupryanov.shared.dto.Task;

import java.util.Date;

interface HomeUiHandlers extends UiHandlers {
    void updateTable();
    void saveTask(String taskString, Date due);
    void addTaskInTable(long id);
    void delTask(Task task);
    void onDeleteTaskEvent(Task task);
    void regButton();
    void GoogleButton();

}
