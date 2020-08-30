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
public class staff extends person {

    private int staff_id;
    private String degree;

    public staff(int staff_id, String degree, int person_id, String first_name, String last_name, String e_mail, Date birth_date, char gender) {
        super(person_id, first_name, last_name, e_mail, birth_date, gender);
        this.staff_id = staff_id;
        this.degree = degree;
    }

    public staff() {
    }

    public int getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(int staff_id) {
        this.staff_id = staff_id;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

}
