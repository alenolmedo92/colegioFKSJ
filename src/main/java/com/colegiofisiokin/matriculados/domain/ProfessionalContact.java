package com.colegiofisiokin.matriculados.domain;

public class ProfessionalContact {
    private int professionalContactId;
    private String place;
    private String street;
    private String number;
    private String cardinal;
    private String district;
    private String neighborhood;
    private String phone1;
    private String phone2;
    private int registeredId;
    private Registered registered;

    //Getters&Setters

    public int getProfessionalContactId() {
        return professionalContactId;
    }

    public String getPlace() {
        return place;
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

    public String getDistrict() {
        return district;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public String getPhone1() {
        return phone1;
    }

    public String getPhone2() {
        return phone2;
    }

    public int getRegisteredId() {
        return registeredId;
    }

    public Registered getRegistered() {
        return registered;
    }

    public void setProfessionalContactId(int professionalContactId) {
        this.professionalContactId = professionalContactId;
    }

    public void setPlace(String place) {
        this.place = place;
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

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public void setRegisteredId(int registeredId) {
        this.registeredId = registeredId;
    }

    public void setRegistered(Registered registered) {
        this.registered = registered;
    }
}
