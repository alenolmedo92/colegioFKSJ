package com.colegiofisiokin.matriculados.domain;

public class PersonalContact {
    private int personalContactId;
    private String street;
    private String number;
    private String cardinal;
    private String location;
    private String district;
    private String country;
    private String zipCode;
    private String phone;
    private String mobilePhone;
    private String emailAddress;
    private int registeredId;

    //Getters&Setters

    public int getPersonalContactId() {
        return personalContactId;
    }

    public String getStreet() {
        return street;
    }

    public String getNumber() {
        return number;
    }

    public String getCardinal() {
        return cardinal;
    }

    public String getLocation() {
        return location;
    }

    public String getDistrict() {
        return district;
    }

    public String getCountry() {
        return country;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getPhone() {
        return phone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public int getRegisteredId() {
        return registeredId;
    }

    public void setPersonalContactId(int personalContactId) {
        this.personalContactId = personalContactId;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setCardinal(String cardinal) {
        this.cardinal = cardinal;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setRegisteredId(int registeredId) {
        this.registeredId = registeredId;
    }
}
