package ru.kupryanov.shared.dto;

import com.googlecode.objectify.annotation.Entity;

import java.util.Date;


@Entity
public class Task extends Dto {
    private String task;
    private Date due;



    public Task() {
    }

    public Task(String task, Date due){
        this.task = task;
        this.due = due;
    }

    public String getTask() {
        return task;
    }

    public Date getDue() {
        return due;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public void setDue(Date due) {
        this.due = due;
    }

    @Override
    public String toString() {
        return "TaskDTO{" +
                "task='" + task + '\'' +
                ", due=" + due +
                '}';
    }
}
