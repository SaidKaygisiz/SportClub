/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author s_a-i_d
 */
public class ticket {
    private int ticket_id;
    private int ticket_number;
    private String ticket_type;
    private int sup_id;

    public int getTicket_id() {
        return ticket_id;
    }

    public void setTicket_id(int ticket_id) {
        this.ticket_id = ticket_id;
    }

    public int getTicket_number() {
        return ticket_number;
    }

    public void setTicket_number(int ticket_number) {
        this.ticket_number = ticket_number;
    }

    public String getTicket_type() {
        return ticket_type;
    }

    public void setTicket_type(String ticket_type) {
        this.ticket_type = ticket_type;
    }

    public int getSup_id() {
        return sup_id;
    }

    public void setSup_id(int sup_id) {
        this.sup_id = sup_id;
    }

    public ticket(int ticket_id, int ticket_number, String ticket_type, int sup_id) {
        this.ticket_id = ticket_id;
        this.ticket_number = ticket_number;
        this.ticket_type = ticket_type;
        this.sup_id = sup_id;
    }

    

    public ticket() {
    }
    
}
