/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.addressDao;
import Entity.address;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;


/**
 *
 * @author s_a-i_d
 */
@Named("add")
@SessionScoped
public class addressController implements Serializable {

    private final String s1 = "Adana";
    private final String s2 = "Adıyaman";
    private final String s3 = "Afyonkarahisar";
    private final String s4 = "Ağrı";
    private final String s5 = "Amasya";
    private final String s6 = "Ankara";
    private final String s7 = "Antalya";
    private final String s8 = "Artvin";
    private final String s9 = "Aydın";
    private final String s10 = "Balıkesir";
    private final String s11 = "Bilecik";
    private final String s12 = "Bingöl";
    private final String s13 = "Bitlis";
    private final String s14 = "Bolu";
    private final String s15 = "Burdur";
    private final String s16 = "Bursa";
    private final String s17 = "Çanakkale";
    private final String s18 = "Çankırı";
    private final String s19 = "Çorum";
    private final String s20 = "Denizli";
    private final String s21 = "Diyarbakır";
    private final String s22 = "Edirne";
    private final String s23 = "Elazığ";
    private final String s24 = "Erzincan";
    private final String s25 = "Erzurum";
    private final String s26 = "Eskişehir";
    private final String s27 = "Gaziantep";
    private final String s28 = "Giresun";
    private final String s29 = "Gümüşhane";
    private final String s30 = "Hakkari";
    private final String s31 = "Hatay";
    private final String s32 = "Isparta";
    private final String s33 = "Mersin";
    private final String s34 = "İstanbul";
    private final String s35 = "İzmir";
    private final String s36 = "Kars";
    private final String s37 = "Kastamonu";
    private final String s38 = "Kayseri";
    private final String s39 = "Kırklareli";
    private final String s40 = "Kırşehir";
    private final String s41 = "Kocaeli";
    private final String s42 = "Konya";
    private final String s43 = "Kütahya";
    private final String s44 = "Malatya";
    private final String s45 = "Manisa";
    private final String s46 = "Kahramanmaraş";
    private final String s47 = "Mardin";
    private final String s48 = "Muğla";
    private final String s49 = "Muş";
    private final String s50 = "Nevşehir";
    private final String s51 = "Niğde";
    private final String s52 = "Ordu";
    private final String s53 = "Rize";
    private final String s54 = "Sakarya";
    private final String s55 = "Samsun";
    private final String s56 = "Siirt";
    private final String s57 = "Sinop";
    private final String s58 = "Sivas";
    private final String s59 = "Tekirdağ";
    private final String s60 = "Tokat";
    private final String s61 = "Trabzon";
    private final String s62 = "Tunceli";
    private final String s63 = "Şanlıurfa";
    private final String s64 = "Uşak";
    private final String s65 = "Van";
    private final String s66 = "Yozgat";
    private final String s67 = "Zonguldak";
    private final String s68 = "Aksaray";
    private final String s69 = "Bayburt";
    private final String s70 = "Karaman";
    private final String s71 = "Kırıkkale";
    private final String s72 = "Batman";
    private final String s73 = "Şırnak";
    private final String s74 = "Bartın";
    private final String s75 = "Ardahan";
    private final String s76 = "Iğdır";
    private final String s77 = "Yalova";
    private final String s78 = "Karabük";
    private final String s79 = "Kilis";
    private final String s80 = "Osmaniye";
    private final String s81 = "Düzce";

    public String getS2() {
        return s2;
    }

    public String getS3() {
        return s3;
    }

    public String getS4() {
        return s4;
    }

    public String getS5() {
        return s5;
    }

    public String getS6() {
        return s6;
    }

    public String getS7() {
        return s7;
    }

    public String getS8() {
        return s8;
    }

    public String getS9() {
        return s9;
    }

    public String getS10() {
        return s10;
    }

    public String getS11() {
        return s11;
    }

    public String getS12() {
        return s12;
    }

    public String getS13() {
        return s13;
    }

    public String getS14() {
        return s14;
    }

    public String getS15() {
        return s15;
    }

    public String getS16() {
        return s16;
    }

    public String getS17() {
        return s17;
    }

    public String getS18() {
        return s18;
    }

    public String getS19() {
        return s19;
    }

    public String getS20() {
        return s20;
    }

    public String getS21() {
        return s21;
    }

    public String getS22() {
        return s22;
    }

    public String getS23() {
        return s23;
    }

    public String getS24() {
        return s24;
    }

    public String getS25() {
        return s25;
    }

    public String getS26() {
        return s26;
    }

    public String getS27() {
        return s27;
    }

    public String getS28() {
        return s28;
    }

    public String getS29() {
        return s29;
    }

    public String getS30() {
        return s30;
    }

    public String getS31() {
        return s31;
    }

    public String getS32() {
        return s32;
    }

    public String getS33() {
        return s33;
    }

    public String getS34() {
        return s34;
    }

    public String getS35() {
        return s35;
    }

    public String getS36() {
        return s36;
    }

    public String getS37() {
        return s37;
    }

    public String getS38() {
        return s38;
    }

    public String getS39() {
        return s39;
    }

    public String getS40() {
        return s40;
    }

    public String getS41() {
        return s41;
    }

    public String getS42() {
        return s42;
    }

    public String getS43() {
        return s43;
    }

    public String getS44() {
        return s44;
    }

    public String getS45() {
        return s45;
    }

    public String getS46() {
        return s46;
    }

    public String getS47() {
        return s47;
    }

    public String getS48() {
        return s48;
    }

    public String getS49() {
        return s49;
    }

    public String getS50() {
        return s50;
    }

    public String getS51() {
        return s51;
    }

    public String getS52() {
        return s52;
    }

    public String getS53() {
        return s53;
    }

    public String getS54() {
        return s54;
    }

    public String getS55() {
        return s55;
    }

    public String getS56() {
        return s56;
    }

    public String getS57() {
        return s57;
    }

    public String getS58() {
        return s58;
    }

    public String getS59() {
        return s59;
    }

    public String getS60() {
        return s60;
    }

    public String getS61() {
        return s61;
    }

    public String getS62() {
        return s62;
    }

    public String getS63() {
        return s63;
    }

    public String getS64() {
        return s64;
    }

    public String getS65() {
        return s65;
    }

    public String getS66() {
        return s66;
    }

    public String getS67() {
        return s67;
    }

    public String getS68() {
        return s68;
    }

    public String getS69() {
        return s69;
    }

    public String getS70() {
        return s70;
    }

    public String getS71() {
        return s71;
    }

    public String getS72() {
        return s72;
    }

    public String getS73() {
        return s73;
    }

    public String getS74() {
        return s74;
    }

    public String getS75() {
        return s75;
    }

    public String getS76() {
        return s76;
    }

    public String getS77() {
        return s77;
    }

    public String getS78() {
        return s78;
    }

    public String getS79() {
        return s79;
    }

    public String getS80() {
        return s80;
    }

    public String getS81() {
        return s81;
    }

    public String getS1() {
        return s1;
    }

    private address address;
    private List<address> addressList;
    private addressDao addressDao;

    public address getAddress() {
        if (this.address == null) {
            this.address = new address();
        }
        return address;
    }

    public void setAddress(address address) {
        this.address = address;
    }

    public List<address> getAddressList() {
        this.addressList = this.getAddressDao().getList();
        return addressList;
    }

    public void setAddressList(List<address> addressList) {
        this.addressList = addressList;
    }

    public addressDao getAddressDao() {
        if (this.addressDao == null) {
            this.addressDao = new addressDao();
        }
        return addressDao;
    }

    public void setAddressDao(addressDao addressDao) {
        this.addressDao = addressDao;
    }

    public void save() {
        this.getAddressDao().save(this.address);
        clearForm();
    }
    
    public void clearForm(){
        this.address=new address();
    }
    public void delete(address a){
        this.getAddressDao().delete(a);
    } 
    
    public void updateForm(address a){
        this.address=a;
    }
    
    public void update(){
        this.getAddressDao().update(this.address);
        clearForm();
    }

}
