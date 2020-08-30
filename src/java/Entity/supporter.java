/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.sql.Date;

/**
 *
 * @author s_a-i_d
 */
public class supporter extends person {

    private int supporter_id;

    public supporter() {
    }

    public int getSupporter_id() {
        return supporter_id;
    }

    public void setSupporter_id(int supporter_id) {
        this.supporter_id = supporter_id;
    }

    public supporter(int supporter_id, int person_id, String first_name, String last_name, String e_mail, Date birth_date, char gender) {
        super(person_id, first_name, last_name, e_mail, birth_date, gender);
        this.supporter_id = supporter_id;
    }
    
    
}
