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
public class person {
    
    private int person_id;
    private String first_name;
    private String last_name;
    private String e_mail;
    private Date birth_date;
    private char gender;

    public person(int person_id, String first_name, String last_name, String e_mail, Date birth_date, char gender) {
        this.person_id = person_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.e_mail = e_mail;
        this.birth_date = birth_date;
        this.gender = gender;
    }

    public person() {
    }
    
    

    public int getPerson_id() {
        return person_id;
    }

    public void setPerson_id(int person_id) {
        this.person_id = person_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public Date getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
    
    
}
