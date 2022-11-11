package com.colegiofisiokin.matriculados.domain;

public class Training {
    private int trainingId;
    private String title;
    private String description;
    private String date;
    private String institucion;
    private int registeredId;
    private Registered registered;

    //Getters&Setters

    public int getTrainingId() {
        return trainingId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date;
    }

    public String getInstitucion() {
        return institucion;
    }

    public int getRegisteredId() {
        return registeredId;
    }

    public Registered getRegistered() {
        return registered;
    }

    public void setTrainingId(int trainingId) {
        this.trainingId = trainingId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public void setRegisteredId(int registeredId) {
        this.registeredId = registeredId;
    }

    public void setRegistered(Registered registered) {
        this.registered = registered;
    }
}
