/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.memberDao;
import Entity.member;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author s_a-i_d
 */
@Named("mem")
@SessionScoped
public class memberController implements Serializable {
    
    private member member;
    private memberDao memberDao;
    private List <member> memberList;

    public member getMember() {
        if(this.member==null){
            this.member=new member();
        }
        return member;
    }

    public void setMember(member member) {
        this.member = member;
    }

    public memberDao getMemberDao() {
        if(this.memberDao==null){
            this.memberDao=new memberDao();
        }
        return memberDao;
    }

    public void setMemberDao(memberDao memberDao) {
        this.memberDao = memberDao;
    }

    public List<member> getMemberList() {
        this.memberList=this.getMemberDao().getList();
        return memberList;
    }

    public void setMemberList(List<member> memberList) {
        this.memberList = memberList;
    }
    
    public void updateForm(member m){
        this.member=m;
    }
    
    public void clearForm(){
        this.member=new member();
    }
    
    public void save(){
        this.getMemberDao().save(this.member);
        clearForm();
    }
    
    public void update(){
        this.getMemberDao().update(this.member);
        clearForm();
    }
    
    public void delete(member m){
        this.getMemberDao().delete(m);
        
    }
    
    
}
