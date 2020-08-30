/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entity.address;
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
public class addressDao {

    DBConnection db = new DBConnection();
    Connection con = db.connect();

    public List<address> getList() {
        List<address> al = new ArrayList();
        try {
            PreparedStatement pst = con.prepareStatement("select * from address order by address_id");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                address a = new address();
                a.setAddress_id(rs.getInt("address_id"));
                a.setNeighborhood(rs.getString("neighborhood"));
                a.setStreet(rs.getString("street"));
                a.setNumber(rs.getInt("number"));
                a.setPostal_code(rs.getInt("postal_code"));
                a.setDistrict(rs.getString("district"));
                a.setCountry(rs.getString("country"));
                a.setP_id(rs.getInt("p_id"));
                al.add(a);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return al;
    }

    public void save(address address) {
        try {
            PreparedStatement pst = con.prepareStatement("insert into address (neighborhood,street,number,postal_code,district,country,p_id) values(?,?,?,?,?,?,?) ");
            pst.setString(1, address.getNeighborhood());
            pst.setString(2, address.getStreet());
            pst.setInt(3, address.getNumber());
            pst.setInt(4, address.getPostal_code());
            pst.setString(5, address.getDistrict());
            pst.setString(6, address.getCountry());
            pst.setInt(7, address.getP_id());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void delete(address a) {
        try {
            PreparedStatement pst = con.prepareStatement("delete from address where address_id=" + a.getAddress_id());
            pst.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void update(address address) {
        try{
            PreparedStatement pst=con.prepareStatement("update address set neighborhood=? ,street=?,number=?,postal_code=?,district=?,country=?,p_id=? where address_id = ?");
            pst.setString(1, address.getNeighborhood());
            pst.setString(2, address.getStreet());
            pst.setInt(3, address.getNumber());
            pst.setInt(4, address.getPostal_code());
            pst.setString(5, address.getDistrict());
            pst.setString(6, address.getCountry());
            pst.setInt(7, address.getP_id());
            pst.setInt(8, address.getAddress_id());
            pst.executeUpdate();
        }catch(SQLException ex){
            System.out.println();
        }
    }

}
