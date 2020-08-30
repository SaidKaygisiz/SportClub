/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.sql.Date;
import java.util.List;

/**
 *
 * @author s_a-i_d
 */
public class member extends person {

    private int member_id;
    private int donation_amount;
    private List<authority> authorityList;

    public List<authority> getAuthorityList() {
        return authorityList;
    }

    public void setAuthorityList(List<authority> authorityList) {
        this.authorityList = authorityList;
    }

    public member() {
    }

    public int getMember_id() {
        return member_id;
    }

    public void setMember_id(int member_id) {
        this.member_id = member_id;
    }

    public int getDonation_amount() {
        return donation_amount;
    }

    public void setDonation_amount(int donation_amount) {
        this.donation_amount = donation_amount;
    }

    public member(int member_id, int donation_amount, int person_id, String first_name, String last_name, String e_mail, Date birth_date, char gender) {
        super(person_id, first_name, last_name, e_mail, birth_date, gender);
        this.member_id = member_id;
        this.donation_amount = donation_amount;
    }

}
