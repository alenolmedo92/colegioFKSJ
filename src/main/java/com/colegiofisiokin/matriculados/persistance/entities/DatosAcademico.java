package com.colegiofisiokin.matriculados.persistance.entities;

import javax.persistence.*;

@Entity
@Table(name = "datos_academicos")
public class DatosAcademico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_datos_academicos")
    private Integer idDatosAcademico;
    private String profesion;
    private String titulo;
    private String institucion;
    @Column(name = "fecha_egreso")
    private String fechaEgreso;
    private String ciudad;
    private String pais;
    private String jurisdiccion;
    @Column(name = "fecha_registro")
    private String fecharRegistro;
    private String estado;
    @Column(name = "fecha_pasividad")
    private String fechaPasividad;
    private String resolucion;
    @Column(name = "fecha_resolucion")
    private String fechaResolucion;
    @Column(name = "ciudad_resolucion")
    private String ciudadResolucion;
    @Column(name = "revalida_titulo")
    private String revalidaTitulo;
    private String especialidad;
    @Column(name = "id_matriculado")
    private Integer idMatriculado;


    //Getters&Setters

    public Integer getIdDatosAcademico() {
        return idDatosAcademico;
    }

    public String getProfesion() {
        return profesion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getInstitucion() {
        return institucion;
    }

    public String getFechaEgreso() {
        return fechaEgreso;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getPais() {
        return pais;
    }

    public String getJurisdiccion() {
        return jurisdiccion;
    }

    public String getFecharRegistro() {
        return fecharRegistro;
    }

    public String getEstado() {
        return estado;
    }

    public String getFechaPasividad() {
        return fechaPasividad;
    }

    public String getResolucion() {
        return resolucion;
    }

    public String getFechaResolucion() {
        return fechaResolucion;
    }

    public String getCiudadResolucion() {
        return ciudadResolucion;
    }

    public String getRevalidaTitulo() {
        return revalidaTitulo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public Integer getIdMatriculado() {
        return idMatriculado;
    }

    public void setIdDatosAcademico(Integer idDatosAcademico) {
        this.idDatosAcademico = idDatosAcademico;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public void setFechaEgreso(String fechaEgreso) {
        this.fechaEgreso = fechaEgreso;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setJurisdiccion(String jurisdiccion) {
        this.jurisdiccion = jurisdiccion;
    }

    public void setFecharRegistro(String fecharRegistro) {
        this.fecharRegistro = fecharRegistro;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setFechaPasividad(String fechaPasividad) {
        this.fechaPasividad = fechaPasividad;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public void setFechaResolucion(String fechaResolucion) {
        this.fechaResolucion = fechaResolucion;
    }

    public void setCiudadResolucion(String ciudadResolucion) {
        this.ciudadResolucion = ciudadResolucion;
    }

    public void setRevalidaTitulo(String revalidaTitulo) {
        this.revalidaTitulo = revalidaTitulo;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setIdMatriculado(Integer idMatriculado) {
        this.idMatriculado = idMatriculado;
    }

}
