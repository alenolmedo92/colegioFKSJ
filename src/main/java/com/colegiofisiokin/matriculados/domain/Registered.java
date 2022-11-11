package com.colegiofisiokin.matriculados.domain;

import javax.persistence.OneToMany;
import java.util.List;

public class Registered {
    private int registeredId;
    private String name;
    private String surname;
    private String dniType;
    private String dni;
    private String dateOfBirth;
    private String placeOfBirth;
    private String cityOfBirth;
    private String countryOfBirth;
    private String nationality;
    private String superintendentCertificate;
    private String superintendentRegistrationDate;
    private String superintendentExpirationDate;

    private List<Sanction> sanctions;
    private List<Training> trainings;
    private List<ProfessionalContact> professionalContacts;

    //Getters&Setters

    public int getRegisteredId() {
        return registeredId;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDniType() {
        return dniType;
    }

    public String getDni() {
        return dni;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public String getCityOfBirth() {
        return cityOfBirth;
    }

    public String getCountryOfBirth() {
        return countryOfBirth;
    }

    public String getNationality() {
        return nationality;
    }

    public String getSuperintendentCertificate() {
        return superintendentCertificate;
    }

    public String getSuperintendentRegistrationDate() {
        return superintendentRegistrationDate;
    }

    public String getSuperintendentExpirationDate() {
        return superintendentExpirationDate;
    }

    public List<Training> getTrainings() {
        return trainings;
    }

    public List<ProfessionalContact> getProfessionalContacts() {
        return professionalContacts;
    }

    public List<Sanction> getSanctions() {
        return sanctions;
    }

    public void setRegisteredId(int registeredId) {
        this.registeredId = registeredId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDniType(String dniType) {
        this.dniType = dniType;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public void setCityOfBirth(String cityOfBirth) {
        this.cityOfBirth = cityOfBirth;
    }

    public void setCountryOfBirth(String countryOfBirth) {
        this.countryOfBirth = countryOfBirth;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setSuperintendentCertificate(String superintendentCertificate) {
        this.superintendentCertificate = superintendentCertificate;
    }

    public void setSuperintendentRegistrationDate(String superintendentRegistrationDate) {
        this.superintendentRegistrationDate = superintendentRegistrationDate;
    }

    public void setSuperintendentExpirationDate(String superintendentExpirationDate) {
        this.superintendentExpirationDate = superintendentExpirationDate;
    }

    public void setTrainings(List<Training> trainings) {
        this.trainings = trainings;
    }

    public void setProfessionalContacts(List<ProfessionalContact> professionalContacts) {
        this.professionalContacts = professionalContacts;
    }

    public void setSanctions(List<Sanction> sanctions) {
        this.sanctions = sanctions;
    }
}
