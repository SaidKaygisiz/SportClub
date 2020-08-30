/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.sql.Date;











public class task {
    
    private int task_id;
    private String task_name;
    private Date starting_date;

    public int getTask_id() {
        return task_id;
    }

    public void setTask_id(int task_id) {
        this.task_id = task_id;
    }

    public String getTask_name() {
        return task_name;
    }

    public void setTask_name(String task_name) {
        this.task_name = task_name;
    }

    public Date getStarting_date() {
        return starting_date;
    }

    public void setStarting_date(Date starting_date) {
        this.starting_date = starting_date;
    }

    public task() {
    }

    public task(int task_id, String task_name, Date starting_date) {
        this.task_id = task_id;
        this.task_name = task_name;
        this.starting_date = starting_date;
    }
    
}
