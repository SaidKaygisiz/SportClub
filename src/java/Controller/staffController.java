/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.staffDao;
import Entity.staff;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author s_a-i_d
 */
@Named("stf")
@SessionScoped
public class staffController implements Serializable {

    staff staff;
    private staffDao staffDao;
    private List<staff> staffList;

    public staff getStaff() {
        if(this.staff==null){
            this.staff=new staff();
        }
        return staff;
    }

    public void setStaff(staff staff) {
        this.staff = staff;
    }

    public staffDao getStaffDao() {
        if (this.staffDao == null) {
            this.staffDao = new staffDao();
        }
        return staffDao;
    }

    public void setStaffDao(staffDao staffDao) {
        this.staffDao = staffDao;
    }

    public List<staff> getStaffList() {
        this.staffList = this.getStaffDao().getList();
        return staffList;
    }

    public void setStaffList(List<staff> staffList) {
        this.staffList = staffList;
    }

    public void updateForm(staff s) {
        this.staff = s;
    }

    public void clearForm() {
        this.staff = new staff();
    }

    public void save() {
        this.getStaffDao().save(this.staff);
        clearForm();
    }

    public void update() {
        this.getStaffDao().update(this.staff);
        clearForm();
    }

    public void delete(staff s) {
        this.getStaffDao().delete(s);
    }

}
