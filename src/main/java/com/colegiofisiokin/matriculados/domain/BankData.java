package com.colegiofisiokin.matriculados.domain;

public class BankData {
    private int bankDataId;
    private String cuil;
    private String grossRevenue;
    private String comafiCbu;
    private String galiciaCbu;
    private String sanjuanCbu;
    private int registeredId;

    //Getters&Setters


    public int getBankDataId() {
        return bankDataId;
    }

    public String getCuil() {
        return cuil;
    }

    public String getGrossRevenue() {
        return grossRevenue;
    }

    public String getComafiCbu() {
        return comafiCbu;
    }

    public String getGaliciaCbu() {
        return galiciaCbu;
    }

    public String getSanjuanCbu() {
        return sanjuanCbu;
    }

    public int getRegisteredId() {
        return registeredId;
    }

    public void setBankDataId(int bankDataId) {
        this.bankDataId = bankDataId;
    }

    public void setCuil(String cuil) {
        this.cuil = cuil;
    }

    public void setGrossRevenue(String grossRevenue) {
        this.grossRevenue = grossRevenue;
    }

    public void setComafiCbu(String comafiCbu) {
        this.comafiCbu = comafiCbu;
    }

    public void setGaliciaCbu(String galiciaCbu) {
        this.galiciaCbu = galiciaCbu;
    }

    public void setSanjuanCbu(String sanjuanCbu) {
        this.sanjuanCbu = sanjuanCbu;
    }

    public void setRegisteredId(int registeredId) {
        this.registeredId = registeredId;
    }
}
