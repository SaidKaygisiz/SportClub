/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entity.athlete;
import Util.DBConnection;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author s_a-i_d
 */
public class athleteDao {

    DBConnection db = new DBConnection();
    Connection con = db.connect();

    public List<athlete> getList() {
        List<athlete> al = new ArrayList();
        try {
            PreparedStatement pst = con.prepareStatement("select * from athlete");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                int a_id = rs.getInt("athlete_id");
                int p_id = rs.getInt("person_id");
                String f_name = rs.getString("first_name");
                String l_name = rs.getString("last_name");
                String email = rs.getString("e_mail");
                Date birth = rs.getDate("birth_date");
                char a = rs.getString("gender").toUpperCase().charAt(0);
                int height = rs.getInt("height");
                int weight = rs.getInt("weight");
                int testimonial = rs.getInt("testimonial");
                athlete athlete = new athlete(a_id, height, weight, testimonial, p_id, f_name, l_name, email, birth, a);
                al.add(athlete);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return al;
    }

    public void save(athlete a) {

        try {
            PreparedStatement pst = con.prepareStatement("insert into athlete(first_name,last_name,e_mail,birth_date,gender,height,weight,testimonial) values(?,?,?,?,?,?,?,?)");
            pst.setString(1, a.getFirst_name());
            pst.setString(2, a.getLast_name());
            pst.setString(3, a.getE_mail());
            pst.setDate(4, a.getBirth_date());
            String gnd = String.valueOf(a.getGender());
            pst.setString(5, gnd);
            pst.setInt(6, a.getHeight());
            pst.setInt(7, a.getWeight());
            pst.setInt(8, a.getTestimonial());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }

    }

    public java.sql.Date convertUtilToSql(java.util.Date uDate) {

        java.sql.Date sDate = new java.sql.Date(uDate.getTime());

        return sDate;
    }

    public void update(athlete a) {
        
        try {
            PreparedStatement pst = con.prepareStatement("update athlete set first_name=?,last_name=?,e_mail=?,birth_date=?,gender=?,height=?,weight=?,testimonial=? where athlete_id=?");
            pst.setString(1, a.getFirst_name());
            pst.setString(2, a.getLast_name());
            pst.setString(3, a.getE_mail());
            pst.setDate(4, a.getBirth_date());
            String gnd = String.valueOf(a.getGender());
            pst.setString(5, gnd);
            pst.setInt(6, a.getHeight());
            pst.setInt(7, a.getWeight());
            pst.setInt(8, a.getTestimonial());
            pst.setInt(9, a.getAthlete_id());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }
        
    }

    public void delete(athlete a) {
        try {
            PreparedStatement pst = con.prepareStatement("delete from athlete where athlete_id=" + a.getAthlete_id());
            pst.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
