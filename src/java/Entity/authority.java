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
public class authority {
    private int authority_id;
    private String authority_name;

    public int getAuthority_id() {
        return authority_id;
    }

    public void setAuthority_id(int authority_id) {
        this.authority_id = authority_id;
    }

    public String getAuthority_name() {
        return authority_name;
    }

    public void setAuthority_name(String authority_name) {
        this.authority_name = authority_name;
    }

    public authority() {
    }

    public authority(int authority_id, String authority_name) {
        this.authority_id = authority_id;
        this.authority_name = authority_name;
    }
    
}
