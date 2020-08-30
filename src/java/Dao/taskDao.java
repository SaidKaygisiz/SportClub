/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entity.task;
import Util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author s_a-i_d
 */
public class taskDao {

    DBConnection db = new DBConnection();
    Connection con = db.connect();

    public List<task> getList() {
        List<task> bl = new ArrayList();
        try {
            PreparedStatement pst = con.prepareStatement("select * from task");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                task b = new task();
                b.setTask_id(rs.getInt("task_id"));
                b.setTask_name(rs.getString("task_name"));
                b.setStarting_date(rs.getDate("starting_date"));
                bl.add(b);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return bl;

    }

    public void save(task task) throws ParseException {
        try {
            PreparedStatement pst = con.prepareStatement("insert into task(task_name,starting_date) values(?,?)");
            pst.setString(1, task.getTask_name().toUpperCase());
            java.util.Date uDate = new java.util.Date();
            java.sql.Date sDate = convertUtilToSql(uDate);
            pst.setDate(2, sDate);
            pst.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public java.sql.Date convertUtilToSql(java.util.Date uDate) {

        java.sql.Date sDate = new java.sql.Date(uDate.getTime());

        return sDate;
    }

    public void delete(task task) {
        try {
            PreparedStatement pst = con.prepareStatement("delete from task where task_id=" + task.getTask_id());
            pst.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public void update(task task) {
        try {
            PreparedStatement pst = con.prepareStatement("update task set task_name=? , starting_date=? where task_id=? ");
            pst.setString(1, task.getTask_name().toUpperCase());
            java.util.Date uDate = new java.util.Date();
            java.sql.Date sDate = convertUtilToSql(uDate);
            pst.setDate(2, sDate);
            pst.setInt(3, task.getTask_id());
            pst.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
