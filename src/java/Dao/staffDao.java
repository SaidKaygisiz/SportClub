/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entity.staff;
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
public class staffDao {

    DBConnection db = new DBConnection();
    Connection con = db.connect();

    public List<staff> getList() {
        List<staff> sl = new ArrayList();
        try {
            PreparedStatement pst = con.prepareStatement("select * from staff");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                int s_id = rs.getInt("staff_id");
                int p_id = rs.getInt("person_id");
                String f_name = rs.getString("first_name").toUpperCase();
                String l_name = rs.getString("last_name").toUpperCase();
                String email = rs.getString("e_mail").toLowerCase();
                Date birth = rs.getDate("birth_date");
                char a = rs.getString("gender").toUpperCase().charAt(0);
                String degree = rs.getString("degree");
                staff staff = new staff(s_id, degree, p_id, f_name, l_name, email, birth, a);
                sl.add(staff);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return sl;

    }

    public void save(staff a) {

        try {
            PreparedStatement pst = con.prepareStatement("insert into staff(first_name,last_name,e_mail,birth_date,gender,degree) values(?,?,?,?,?,?)");
            pst.setString(1, a.getFirst_name());
            pst.setString(2, a.getLast_name());
            pst.setString(3, a.getE_mail());
            pst.setDate(4, a.getBirth_date());
            String gnd = String.valueOf(a.getGender());
            pst.setString(5, gnd);
            pst.setString(6, a.getDegree());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }
    }

    public void update(staff a) {
        try {
            PreparedStatement pst = con.prepareStatement("update staff set first_name=?,last_name=?,e_mail=?,birth_date=?,gender=?,degree=? where staff_id=?");
            pst.setString(1, a.getFirst_name());
            pst.setString(2, a.getLast_name());
            pst.setString(3, a.getE_mail());
            pst.setDate(4, a.getBirth_date());
            String gnd = String.valueOf(a.getGender());
            pst.setString(5, gnd);
            pst.setString(6, a.getDegree());
            pst.setInt(7, a.getStaff_id());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }

    }

    public void delete(staff s) {
        try {
            PreparedStatement pst = con.prepareStatement("delete from staff where staff_id=" + s.getStaff_id());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }
    }

}
