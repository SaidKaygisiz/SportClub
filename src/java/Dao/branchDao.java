/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entity.branch;
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
public class branchDao {

    DBConnection db = new DBConnection();
    Connection con = db.connect();

    public List<branch> getList() {
        List<branch> bl = new ArrayList();
        try {
            PreparedStatement pst = con.prepareStatement("select * from branch");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                branch b = new branch();
                b.setBranch_id(rs.getInt("branch_id"));
                b.setBranch_name(rs.getString("branch_name"));
                bl.add(b);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return bl;
    }

    public void save(branch branch) {
        try {
            PreparedStatement pst = con.prepareStatement("insert into branch (branch_name) values(?)");
            pst.setString(1, branch.getBranch_name());
            pst.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public void update(branch branch) {

        try {
            PreparedStatement pst = con.prepareStatement("update branch set branch_name=? where branch_id=?");
            pst.setString(1, branch.getBranch_name());
            pst.setInt(2, branch.getBranch_id());
            pst.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public void delete(branch b) {
        try {
            PreparedStatement pst = con.prepareStatement("delete from branch where branch_id=" + b.getBranch_id());
            pst.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
