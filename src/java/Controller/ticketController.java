/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.ticketDao;
import Entity.ticket;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author s_a-i_d
 */
@Named
@SessionScoped
public class ticketController implements Serializable {
    
    private ticket ticket;
    private List<ticket>ticketList;
    private ticketDao ticketDao;

    public ticket getTicket() {
        if(this.ticket==null){
            this.ticket=new ticket();
        }
        return ticket;
    }

    public void setTicket(ticket ticket) {
        this.ticket = ticket;
    }

    public List<ticket> getTicketList() {
        this.ticketList=this.getTicketDao().getList();
        return ticketList;
    }

    public void setTicketList(List<ticket> ticketList) {
        this.ticketList = ticketList;
    }

    public ticketDao getTicketDao() {
        if(this.ticketDao==null){
            this.ticketDao=new ticketDao();
        }
        return ticketDao;
    }

    public void setTicketDao(ticketDao ticketDao) {
        this.ticketDao = ticketDao;
    }
    
    public void updateForm(ticket t)
    {
        this.ticket=t;
    }    
    
    public void clearForm(){
        this.ticket=new ticket();
    }
    
    public void save(){
        this.getTicketDao().save(this.ticket);
        clearForm();
    }
    public void update(){
        this.getTicketDao().update(this.ticket);
        clearForm();
    }
    
    public void delete(ticket t){
        this.getTicketDao().delete(t);
    }
}
