/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.supporterDao;
import Entity.supporter;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author s_a-i_d
 */
@Named("sup")
@SessionScoped
public class supporterController implements Serializable {

    private supporter supporter;
    private List<supporter> supporterList;
    private supporterDao supporterDao;

    public supporter getSupporter() {
        if(this.supporter==null){
            this.supporter=new supporter();
        }
        return supporter;
    }

    public void setSupporter(supporter supporter) {
        this.supporter = supporter;
    }

    public List<supporter> getSupporterList() {
        this.supporterList = this.getSupporterDao().getList();
        return supporterList;
    }

    public void setSupporterList(List<supporter> supporterList) {
        this.supporterList = supporterList;
    }

    public supporterDao getSupporterDao() {
        if (this.supporterDao == null) {
            this.supporterDao = new supporterDao();
        }
        return supporterDao;
    }

    public void setSupporterDao(supporterDao supporterDao) {
        this.supporterDao = supporterDao;
    }

    public void updateForm(supporter s) {
        this.supporter = s;
    }

    public void clearForm() {
        this.supporter = new supporter();
    }

    public void save() {
        this.getSupporterDao().save(this.supporter);
        clearForm();
    }

    public void update() {
        this.getSupporterDao().update(this.supporter);
        clearForm();
    }

    public void delete(supporter s) {

        this.getSupporterDao().delete(s);
    }

}
