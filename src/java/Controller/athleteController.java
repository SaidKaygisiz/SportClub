/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.athleteDao;
import Entity.athlete;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author s_a-i_d
 */
@Named("ath")
@SessionScoped
public class athleteController implements Serializable {
    
    private athlete athlete;
    private List<athlete>athleteList;
    private athleteDao athleteDao;

    public athlete getAthlete() {
        if(this.athlete==null){
            this.athlete=new athlete();
        }
        return athlete;
    }

    public void setAthlete(athlete athlete) {
        this.athlete = athlete;
    }

    public List<athlete> getAthleteList() {
        this.athleteList=this.getAthleteDao().getList();
        return athleteList;
    }

    public void setAthleteList(List<athlete> athleteList) {
        this.athleteList = athleteList;
    }

    public athleteDao getAthleteDao() {
        if(this.athleteDao==null){
            this.athleteDao=new athleteDao();
        }
        return athleteDao;
    }

    public void setAthleteDao(athleteDao athleteDao) {
        this.athleteDao = athleteDao;
    }
    
    public void save(){
        
        this.getAthleteDao().save(this.athlete);
        clearForm();
    }
    public void update(){
        this.getAthleteDao().update(this.athlete);
        clearForm();
    }
    public void clearForm(){
        this.athlete=new athlete();
    }
    public void updateForm(athlete a){
        this.athlete=a;
    }
    public void delete(athlete a){
        this.getAthleteDao().delete(a);
    }
    
    
    
}
