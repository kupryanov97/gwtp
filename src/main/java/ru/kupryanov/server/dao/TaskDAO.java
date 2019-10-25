package ru.kupryanov.server.dao;

import ru.kupryanov.shared.dto.Task;

import java.util.ArrayList;

public class TaskDAO extends BaseDAO<Task> {
    public TaskDAO() {
        super(Task.class);
    }

}
