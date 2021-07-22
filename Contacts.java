package com.company;

// Iraklis Tsikas
// MPPL20082

import java.io.Serializable;

public class Contacts implements Serializable {
    private String Name;
    private String Surname;
    private String mobile;
    private String address;
    private String birth_date;

    public String getName(){
        return Name;
    }

    public void setName(String Name){
        this.Name=Name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String Surname){
        this.Surname=Surname;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }
}
