/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entity.authority;
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
public class authorityDao {

    DBConnection db = new DBConnection();
    Connection con = db.connect();

    public List<authority> getList() {

        List<authority> al = new ArrayList();
        try {
            PreparedStatement pst = con.prepareStatement("select * from authority");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                authority a = new authority();
                a.setAuthority_id(rs.getInt("authority_id"));
                a.setAuthority_name(rs.getString("authority_name"));
                al.add(a);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return al;

    }

    public void save(authority authority) {

        try {
            PreparedStatement pst = con.prepareStatement("insert into authority (authority_name) values (?)");
            pst.setString(1, authority.getAuthority_name());
            pst.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void delete(authority a) {

        try {
            PreparedStatement pst = con.prepareStatement("delete from authority where authority_id=" + a.getAuthority_id());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public void update(authority authority) {

        try {
            PreparedStatement pst = con.prepareStatement("update authority set authority_name=? where authority_id=?");
            pst.setString(1, authority.getAuthority_name());
            pst.setInt(2, authority.getAuthority_id());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
