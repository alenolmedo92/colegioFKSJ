package com.colegiofisiokin.matriculados.persistance.entities;

import javax.persistence.*;

@Entity
@Table(name = "contacto_profesional")
public class ContactoProfesional {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_contacto_profesional")
    private Integer idContactoProfesional;
    private String lugar;
    private String calle;
    private String numero;
    private String cardinal;
    private String departamento;
    private String barrio;
    private String telefono1;
    private String telefono2;
    @Column(name = "id_matriculado")
    private Integer idMatriculado;
    @ManyToOne
    @JoinColumn(name = "id_matriculado", insertable = false, updatable = false)
    private Matriculado matriculado;

    //Getters&Setters

    public Integer getIdContactoProfesional() {
        return idContactoProfesional;
    }

    public String getLugar() {
        return lugar;
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

    public String getDepartamento() {
        return departamento;
    }

    public String getBarrio() {
        return barrio;
    }

    public String getTelefono1() {
        return telefono1;
    }

    public String getTelefono2() {
        return telefono2;
    }

    public Integer getIdMatriculado() {
        return idMatriculado;
    }

    public Matriculado getMatriculado() {
        return matriculado;
    }

    public void setIdContactoProfesional(Integer idContactoProfesional) {
        this.idContactoProfesional = idContactoProfesional;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
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

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }

    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }

    public void setIdMatriculado(Integer idMatriculado) {
        this.idMatriculado = idMatriculado;
    }

    public void setMatriculado(Matriculado matriculado) {
        this.matriculado = matriculado;
    }
}
