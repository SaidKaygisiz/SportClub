/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import java.sql.Date;

/**
 *
 * @author s_a-i_d
 */
public class athlete extends person implements Serializable {

    private int athlete_id;
    private int height;
    private int weight;
    private int testimonial;
    private int address_id;

    public int getAddress_id() {
        return address_id;
    }

    public void setAddress_id(int address_id) {
        this.address_id = address_id;
    }

    public athlete() {
    }

    public int getAthlete_id() {
        return athlete_id;
    }

    public void setAthlete_id(int athlete_id) {
        this.athlete_id = athlete_id;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getTestimonial() {
        return testimonial;
    }

    public void setTestimonial(int testimonial) {
        this.testimonial = testimonial;
    }

    public athlete(int athlete_id, int height, int weight, int testimonial, int person_id, String first_name, String last_name, String e_mail, Date birth_date, char gender) {
        super(person_id, first_name, last_name, e_mail, birth_date, gender);
        this.athlete_id = athlete_id;
        this.height = height;
        this.weight = weight;
        this.testimonial = testimonial;
    }
    
    
}
