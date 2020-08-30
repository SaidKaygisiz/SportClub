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
public class address {
    
    private int address_id;
    private String neighborhood;
    private String street;
    private int number;
    private int postal_code;
    private String district;
    private String country;
    private int p_id;

    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

   
    

    public int getAddress_id() {
        return address_id;
    }

    public void setAddress_id(int address_id) {
        this.address_id = address_id;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(int postal_code) {
        this.postal_code = postal_code;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public address() {
    }

    public address(int address_id, String neighborhood, String street, int number, int postal_code, String district, String country, int p_id) {
        this.address_id = address_id;
        this.neighborhood = neighborhood;
        this.street = street;
        this.number = number;
        this.postal_code = postal_code;
        this.district = district;
        this.country = country;
        this.p_id = p_id;
    }

  
    

   

   
    
    
    
}
