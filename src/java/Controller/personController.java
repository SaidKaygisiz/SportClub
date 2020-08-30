/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.personDao;
import Entity.person;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author s_a-i_d
 */
@Named("per")
@SessionScoped
public class personController implements Serializable {
    private int page = 1;
    private final int lic = 10;
    private person person;
    private List<person>personList;
    private personDao personDao;

    public int getPage() {
        return page;
    }

    public int getLic() {
        return lic;
    }

    public person getPerson() {
        if(this.person==null){
            this.person=new person();
        }
        return person;
    }

    public void setPerson(person person) {
        this.person = person;
    }

    public List<person> getPersonList() {
        this.personList=this.getPersonDao().getList(page, lic);
        return personList;
    }

    public void setPersonList(List<person> personList) {
        this.personList = personList;
    }

    public personDao getPersonDao() {
        if(this.personDao==null){
            this.personDao=new personDao();
        }
        return personDao;
    }

    public void setPersonDao(personDao personDao) {
        this.personDao = personDao;
    }
    
    
    public boolean hasPrev() {
        return this.page > 1;
    }

    public boolean hasNext() {
        return this.page <= (this.getPersonDao().kullaniciSayisi() / lic);
    }

    public void previous() {
        this.page--;
    }

    public void next() {
        this.page++;
    }
    
}
