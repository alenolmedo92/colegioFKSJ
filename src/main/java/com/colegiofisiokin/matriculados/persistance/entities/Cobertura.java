package com.colegiofisiokin.matriculados.persistance.entities;

import javax.persistence.*;

@Entity
@Table(name = "cobertura")
public class Cobertura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cobertura")
    private Integer idCobertura;
    private String prepaga;
    @Column(name = "seguro_vida")
    private String seguroVida;
    @Column(name = "seguro_malapraxis")
    private String seguroMalapraxis;
    @Column(name = "numero_poliza")
    private String numeroPoliza;
    @Column(name = "numero_certificado")
    private String numeroCertificado;
    @Column(name = "fecha_vigencia_poliza")
    private String fechaVigenciaPoliza;
    @Column(name = "realiza_domicilio")
    private String realizaDomicilio;
    @Column(name = "id_matriculado")
    private Integer idMatriculado;


    //Getters&Setters


    public Integer getIdCobertura() {
        return idCobertura;
    }

    public void setIdCobertura(Integer idCobertura) {
        this.idCobertura = idCobertura;
    }

    public String getPrepaga() {
        return prepaga;
    }

    public void setPrepaga(String prepaga) {
        this.prepaga = prepaga;
    }

    public String getSeguroVida() {
        return seguroVida;
    }

    public void setSeguroVida(String seguroVida) {
        this.seguroVida = seguroVida;
    }

    public String getSeguroMalapraxis() {
        return seguroMalapraxis;
    }

    public void setSeguroMalapraxis(String seguroMalapraxis) {
        this.seguroMalapraxis = seguroMalapraxis;
    }

    public String getNumeroPoliza() {
        return numeroPoliza;
    }

    public void setNumeroPoliza(String numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    public String getNumeroCertificado() {
        return numeroCertificado;
    }

    public void setNumeroCertificado(String numeroCertificado) {
        this.numeroCertificado = numeroCertificado;
    }

    public String getFechaVigenciaPoliza() {
        return fechaVigenciaPoliza;
    }

    public void setFechaVigenciaPoliza(String fechaVigenciaPoliza) {
        this.fechaVigenciaPoliza = fechaVigenciaPoliza;
    }

    public String getRealizaDomicilio() {
        return realizaDomicilio;
    }

    public void setRealizaDomicilio(String realizaDomicilio) {
        this.realizaDomicilio = realizaDomicilio;
    }

    public Integer getIdMatriculado() {
        return idMatriculado;
    }

    public void setIdMatriculado(Integer idMatriculado) {
        this.idMatriculado = idMatriculado;
    }
}
