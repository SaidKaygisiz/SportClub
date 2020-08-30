/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.branchDao;
import Entity.branch;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;

import javax.inject.Named;

/**
 *
 * @author s_a-i_d
 */
 @Named("br")
 @SessionScoped
public class branchController implements Serializable {
     private branch branch;
     private List<branch>branchList;
     private branchDao branchDao;

    public branch getBranch() {
        if(this.branch==null){
            this.branch=new branch();
        }
        return branch;
    }

    public void setBranch(branch branch) {
        this.branch = branch;
    }

    public List<branch> getBranchList() {
        this.branchList=this.getBranchDao().getList();
        return branchList;
    }

    public void setBranchList(List<branch> branchList) {
        this.branchList = branchList;
    }

    public branchDao getBranchDao() {
        if(this.branchDao==null){
            this.branchDao=new branchDao();
        }
        return branchDao;
    }

    public void setBranchDao(branchDao branchDao) {
        this.branchDao = branchDao;
    }
     
     public void updateForm(branch b){
         this.branch=b;
     }
     public void save(){
         this.getBranchDao().save(this.branch);
         clearForm();
     }
     public void update(){
         this.getBranchDao().update(this.branch);
         clearForm();
     }
     public void delete(branch b){
         this.getBranchDao().delete(b);
     }
     public void clearForm(){
         this.branch=new branch();
     }
    
}
