/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entity.member;
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
public class memberDao {

    DBConnection db = new DBConnection();
    Connection con = db.connect();

    public List<member> getList() {
        List<member> ml = new ArrayList();

        try {
            PreparedStatement pst = con.prepareStatement("select * from member");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                int m_id = rs.getInt("member_id");
                int p_id = rs.getInt("person_id");
                String f_name = rs.getString("first_name");
                String l_name = rs.getString("last_name");
                String email = rs.getString("e_mail");
                Date birth = rs.getDate("birth_date");
                char a = rs.getString("gender").toUpperCase().charAt(0);
                int donat = rs.getInt("donation_amount");
                member member = new member(m_id, donat, p_id, f_name, l_name, email, birth, a);
                ml.add(member);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return ml;
    }

    public void delete(member m) {
        try {

            PreparedStatement pst = con.prepareStatement("delete from member where member_id=" + m.getMember_id());
            pst.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void update(member m) {
        try {

            PreparedStatement pst = con.prepareStatement("update member set first_name=?,last_name=?,e_mail=?,gender=?,birth_date=?,donation_amount=? where member_id=?");
            pst.setString(1, m.getFirst_name());
            pst.setString(2, m.getLast_name());
            pst.setString(3, m.getE_mail());
            String gnd = String.valueOf(m.getGender());
            pst.setString(4, gnd);
            pst.setDate(5, m.getBirth_date());
            pst.setInt(6, m.getDonation_amount());
            pst.setInt(7, m.getMember_id());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void save(member m) {

        try {
            PreparedStatement pst = con.prepareStatement("insert into member (first_name,last_name,e_mail,gender,birth_date,donation_amount) values(?,?,?,?,?,?)");
            pst.setString(1, m.getFirst_name());
            pst.setString(2, m.getLast_name());
            pst.setString(3, m.getE_mail());
            String gnd = String.valueOf(m.getGender());
            pst.setString(4, gnd);
            pst.setDate(5, m.getBirth_date());
            pst.setInt(6, m.getDonation_amount());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
