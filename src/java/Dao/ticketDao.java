/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entity.ticket;
import Util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author s_a-i_d
 */
public class ticketDao {

    DBConnection db = new DBConnection();
    Connection con = db.connect();

    public List<ticket> getList() {
        List<ticket> bl = new ArrayList();
        try {
            PreparedStatement pst = con.prepareStatement("select * from ticket");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                ticket b = new ticket();
                b.setTicket_id(rs.getInt("ticket_id"));
                b.setTicket_number(rs.getInt("ticket_number"));
                b.setTicket_type(rs.getString("ticket_type"));
                b.setSup_id(rs.getInt("sup_id"));
                bl.add(b);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return bl;

    }

    public void save(ticket ticket) {
        try{
            PreparedStatement pst=con.prepareStatement("insert into ticket (ticket_number,ticket_type,sup_id) values(?,?,?)");
            pst.setInt(1, ticket.getTicket_number());
            pst.setString(2, ticket.getTicket_type());
            pst.setInt(3, ticket.getSup_id());
            pst.executeUpdate();
            
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }

    }

    public void update(ticket ticket) {
        try{
            PreparedStatement pst=con.prepareStatement("update ticket set ticket_number=?,ticket_type=?,sup_id=? where ticket_id=?");
            pst.setInt(1, ticket.getTicket_number());
            pst.setString(2, ticket.getTicket_type());
            pst.setInt(3, ticket.getSup_id());
            pst.setInt(4, ticket.getTicket_id());
            pst.executeUpdate();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        
    }

    public void delete(ticket t) {
        try{
            PreparedStatement pst=con.prepareStatement("delete from ticket where ticket_id="+t.getTicket_id());
            pst.executeUpdate();
            
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }

    }

}
