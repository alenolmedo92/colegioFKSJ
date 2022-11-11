package com.colegiofisiokin.matriculados.persistance.entities;

import javax.persistence.*;

@Entity
@Table(name = "capacitaciones")
public class Capacitacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_capacitaciones")
    private Integer idCapacitaciones;
    private String  titulo;
    private String descripcion;
    private String fecha;
    private String institucion;
    @Column(name = "id_matruculado")
    private Integer idMatriculado;
    @ManyToOne
    @JoinColumn(name = "id_matruculado", insertable = false, updatable = false)
    private Matriculado matriculado;


    //Getters&Setters:

    public Integer getIdCapacitaciones() {
        return idCapacitaciones;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public String getInstitucion() {
        return institucion;
    }

    public Integer getIdMatriculado() {
        return idMatriculado;
    }

    public Matriculado getMatriculado() {
        return matriculado;
    }

    public void setIdCapacitaciones(Integer idCapacitaciones) {
        this.idCapacitaciones = idCapacitaciones;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescripcion(String description) {
        this.descripcion = descripcion;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public void setIdMatriculado(Integer idMatriculado) {
        this.idMatriculado = idMatriculado;
    }

    public void setMatriculado(Matriculado matriculado) {
        this.matriculado = matriculado;
    }
}