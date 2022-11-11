package com.colegiofisiokin.matriculados.persistance.entities;


import javax.persistence.*;

@Entity
@Table(name = "sanciones")
public class Sancion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sanciones")
    private Integer idSancion;
    private String descripcion;
    private String fecha;
    @Column(name = "id_matriculado")
    private Integer idMatriculado;
    @ManyToOne
    @JoinColumn(name = "id_matriculado", insertable = false, updatable = false)
    private Matriculado matriculado;

    //Getters&Setters


    public Integer getIdSancion() {
        return idSancion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public Integer getIdMatriculado() {
        return idMatriculado;
    }

    public Matriculado getMatriculado() {
        return matriculado;
    }

    public void setIdSancion(Integer idSancion) {
        this.idSancion = idSancion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setIdMatriculado(Integer idMatriculado) {
        this.idMatriculado = idMatriculado;
    }

    public void setMatriculado(Matriculado matriculado) {
        this.matriculado = matriculado;
    }
}
