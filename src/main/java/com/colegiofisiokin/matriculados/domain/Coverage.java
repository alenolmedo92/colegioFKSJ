package com.colegiofisiokin.matriculados.domain;

public class Coverage {
    private int coverageId;
    private String prepaid;
    private String lifeInsurance;
    private String malpracticeInsurance;
    private String policyNumber;
    private String certNumber;
    private String policyValidityDate;
    private String homeCare;
    private int registeredId;

    //Getters&Setters

    public int getCoverageId() {
        return coverageId;
    }

    public String getPrepaid() {
        return prepaid;
    }

    public String getLifeInsurance() {
        return lifeInsurance;
    }

    public String getMalpracticeInsurance() {
        return malpracticeInsurance;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public String getPolicyValidityDate() {
        return policyValidityDate;
    }

    public String getHomeCare() {
        return homeCare;
    }

    public int getRegisteredId() {
        return registeredId;
    }

    public String getCertNumber() {
        return certNumber;
    }

    public void setCoverageId(int coverageId) {
        this.coverageId = coverageId;
    }

    public void setPrepaid(String prepaid) {
        this.prepaid = prepaid;
    }

    public void setLifeInsurance(String lifeInsurance) {
        this.lifeInsurance = lifeInsurance;
    }

    public void setMalpracticeInsurance(String malpracticeInsurance) {
        this.malpracticeInsurance = malpracticeInsurance;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public void setPolicyValidityDate(String policyValidityDate) {
        this.policyValidityDate = policyValidityDate;
    }

    public void setHomeCare(String homeCare) {
        this.homeCare = homeCare;
    }

    public void setRegisteredId(int registeredId) {
        this.registeredId = registeredId;
    }

    public void setCertNumber(String certNumber) {
        this.certNumber = certNumber;
    }
}