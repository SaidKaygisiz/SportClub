/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.authorityDao;
import Entity.authority;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author s_a-i_d
 */
@Named("aut")
@SessionScoped
public class authorityController implements Serializable {

    private authority authority;
    private List<authority> authorityList;
    private authorityDao authorityDao;

    public authority getAuthority() {
        if (this.authority == null) {
            this.authority = new authority();
        }
        return authority;
    }

    public void setAuthority(authority authority) {
        this.authority = authority;
    }

    public List<authority> getAuthorityList() {
        this.authorityList = this.getAuthorityDao().getList();
        return authorityList;
    }

    public void setAuthorityList(List<authority> authorityList) {
        this.authorityList = authorityList;
    }

    public authorityDao getAuthorityDao() {
        if (this.authorityDao == null) {
            this.authorityDao = new authorityDao();
        }
        return authorityDao;
    }

    public void setAuthorityDao(authorityDao authorityDao) {
        this.authorityDao = authorityDao;
    }

    public void save() {
        this.getAuthorityDao().save(this.authority);
        clearForm();
    }

    public void delete(authority a) {
        this.getAuthorityDao().delete(a);
        
    }

    public void update() {
        this.getAuthorityDao().update(this.authority);
        clearForm();
    }

    public void clearForm() {
        this.authority = new authority();

    }

    public void updateForm(authority a) {
        this.authority = a;
    }

}
