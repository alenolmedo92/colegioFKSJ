package com.colegiofisiokin.matriculados.domain;

public class Sanction {
    private int santionId;
    private String description;
    private String date;
    private int registeredId;
    private Registered registered;

    //Getters and setters

    public int getSantionId() {
        return santionId;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date;
    }

    public int getRegisteredId() {
        return registeredId;
    }

    public Registered getRegistered() {
        return registered;
    }

    public void setSantionId(int santionId) {
        this.santionId = santionId;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setRegisteredId(int registeredId) {
        this.registeredId = registeredId;
    }

    public void setRegistered(Registered registered) {
        this.registered = registered;
    }
}
