/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.taskDao;
import Entity.task;
import java.io.Serializable;
import java.text.ParseException;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author s_a-i_d
 */
@Named
@SessionScoped
public class taskController implements Serializable {

    private task task;
    private List<task> taskList;
    private taskDao taskDao;

    public task getTask() {
        if (this.task == null) {
            this.task = new task();
        }
        return task;
    }

    public void setTask(task task) {
        this.task = task;
    }

    public List<task> getTaskList() {
        this.taskList = this.getTaskDao().getList();
        return taskList;
    }

    public void setTaskList(List<task> taskList) {
        this.taskList = taskList;
    }

    public taskDao getTaskDao() {
        if (this.taskDao == null) {
            this.taskDao = new taskDao();
        }
        return taskDao;
    }

    public void setTaskDao(taskDao taskDao) {
        this.taskDao = taskDao;
    }

    public void save() throws ParseException {
        this.getTaskDao().save(this.task);
        clearForm();
    }

    public void delete(task t) {
        this.getTaskDao().delete(t);

    }
    public void clearForm(){
        this.task=new task();
    }
    
    public void updateForm(task t){
        this.task=t;
    }
    
    public void update(){
        this.getTaskDao().update(this.task);
        clearForm();
    }
}
