/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author s_a-i_d
 */
public class branch {
    private int branch_id;
    private String branch_name;

    public int getBranch_id() {
        return branch_id;
    }

    public void setBranch_id(int branch_id) {
        this.branch_id = branch_id;
    }

    public String getBranch_name() {
        return branch_name;
    }

    public void setBranch_name(String branch_name) {
        this.branch_name = branch_name;
    }

    public branch() {
    }

    public branch(int branch_id, String branch_name) {
        this.branch_id = branch_id;
        this.branch_name = branch_name;
    }
    
}
