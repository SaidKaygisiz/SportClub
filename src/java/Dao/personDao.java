/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entity.person;
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
public class personDao {

    DBConnection db = new DBConnection();
    Connection con = db.connect();

    public List<person> getList(int page,int lic) {
        List<person>pl=new ArrayList();
        int start = 0;
        start = (page - 1) * lic;
        try{
            PreparedStatement pst=con.prepareStatement("select * from person order by person_id limit "+lic+" OFFSET "+start);
            ResultSet rs=pst.executeQuery();
            while(rs.next()){
                person person=new person();
                person.setPerson_id(rs.getInt("person_id"));
                person.setFirst_name(rs.getString("first_name"));
                person.setLast_name(rs.getString("last_name"));
                person.setE_mail(rs.getString("e_mail"));
                person.setBirth_date(rs.getDate("birth_date"));
                char a = rs.getString("gender").toUpperCase().charAt(0);
                person.setGender(a);
                pl.add(person);
            }
            
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return pl;
    }
    
    public int kullaniciSayisi() {
        int ks = 0;
        try {
            PreparedStatement pst = con.prepareStatement("select * from person");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                ks++;
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return ks;
    }

}
