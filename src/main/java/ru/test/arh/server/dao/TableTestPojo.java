package ru.test.arh.server.dao;

import ru.test.arh.shared.dto.TableTestPojo1;

import java.util.ArrayList;

public class TableTestPojo extends BaseDAO<TableTestPojo1> {
    public TableTestPojo() {
        super(TableTestPojo1.class);
    }

    public void saveTask (TableTestPojo1 task){
        this.save(task);
    }

    public ArrayList<TableTestPojo1> getTasks(){
        return this.getAll();
    }

    public TableTestPojo1 getTaskById(long id){
        return this.get(id);
    }

    public TableTestPojo1 saveTaskAndReturn(TableTestPojo1 task){
        return this.saveAndReturn(task);
    }

    public void deleteTaskById(long id){
        this.deleteById(id);
    }
}
