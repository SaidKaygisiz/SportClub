/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entity.supporter;
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
public class supporterDao {

    DBConnection db = new DBConnection();
    Connection con = db.connect();

    public List<supporter> getList() {
        List<supporter> sl = new ArrayList();
        try {
            PreparedStatement pst = con.prepareStatement("select * from supporter");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                int s_id = rs.getInt("supporter_id");
                int p_id = rs.getInt("person_id");
                String f_name = rs.getString("first_name");
                String l_name = rs.getString("last_name");
                String email = rs.getString("e_mail");
                Date birth = rs.getDate("birth_date");
                char a = rs.getString("gender").toUpperCase().charAt(0);
                supporter supporter = new supporter(s_id, p_id, f_name, l_name, email, birth, a);
                sl.add(supporter);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return sl;
    }

    public void save(supporter a) {

        try {
            PreparedStatement pst = con.prepareStatement("insert into supporter(first_name,last_name,e_mail,birth_date,gender) values(?,?,?,?,?)");
            pst.setString(1, a.getFirst_name());
            pst.setString(2, a.getLast_name());
            pst.setString(3, a.getE_mail());
            pst.setDate(4, a.getBirth_date());
            String gnd = String.valueOf(a.getGender());
            pst.setString(5, gnd);
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }

    }

    public void update(supporter a) {

        try {
            PreparedStatement pst = con.prepareStatement("update supporter set first_name=?,last_name=?,e_mail=?,birth_date=?,gender=? where supporter_id=?");
            pst.setString(1, a.getFirst_name());
            pst.setString(2, a.getLast_name());
            pst.setString(3, a.getE_mail());
            pst.setDate(4, a.getBirth_date());
            String gnd = String.valueOf(a.getGender());
            pst.setString(5, gnd);
            pst.setInt(6, a.getSupporter_id());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }
    }

    public void delete(supporter s) {

        try {
            PreparedStatement pst = con.prepareStatement("delete from supporter where supporter_id=" + s.getSupporter_id());
            pst.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
