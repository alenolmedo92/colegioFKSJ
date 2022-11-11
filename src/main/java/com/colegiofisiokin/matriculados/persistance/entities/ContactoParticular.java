package com.colegiofisiokin.matriculados.persistance.entities;


import javax.persistence.*;

@Entity
@Table(name = "contacto_particular")
public class ContactoParticular {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_contacto_particular")
    private Integer idContactoParticular;
    private String calle;
    private String numero;
    private String cardinal;
    private String localidad;
    private String departamento;
    private String pais;
    @Column(name = "cp")
    private String codigoPostal;
    @Column(name = "telefono_fijo")
    private String telefonoFijo;
    @Column(name = "celular")
    private String telefonoMovil;
    private String email;
    @Column(name = "id_matriculado")
    private Integer idMatriculado;


    //Getters&Setters

    public Integer getIdContactoParticular() {
        return idContactoParticular;
    }

    public String getCalle() {
        return calle;
    }

    public String getNumero() {
        return numero;
    }

    public String getCardinal() {
        return cardinal;
    }

    public String getLocalidad() {
        return localidad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getPais() {
        return pais;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public String getTelefonoFijo() {
        return telefonoFijo;
    }

    public String getTelefonoMovil() {
        return telefonoMovil;
    }

    public String getEmail() {
        return email;
    }

    public Integer getIdMatriculado() {
        return idMatriculado;
    }

    public void setIdContactoParticular(Integer idContactoParticular) {
        this.idContactoParticular = idContactoParticular;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setCardinal(String cardinal) {
        this.cardinal = cardinal;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public void setTelefonoFijo(String telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }

    public void setTelefonoMovil(String telefonoMovil) {
        this.telefonoMovil = telefonoMovil;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIdMatriculado(Integer idMatriculado) {
        this.idMatriculado = idMatriculado;
    }

}
