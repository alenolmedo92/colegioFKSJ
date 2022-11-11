package com.colegiofisiokin.matriculados.persistance.entities;

import javax.persistence.*;

@Entity
@Table(name = "datos_bancarios")
public class DatosBancario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_datos_bancarios")
    private Integer idDatosBancarios;
    @Column(name = "cuit")
    private String cuil;
    @Column(name = "ingresos_brutos")
    private String ingresosBrutos;
    @Column(name = "cbu_comafi")
    private String cbuComafi;
    @Column(name = "cbu_galicia")
    private String cbuGalicia;
    @Column(name = "cbu_sanjuan")
    private String cbuSanjuan;
    @Column(name = "id_matriculado")
    private Integer idMatriculado;


    //Getters&Setters

    public Integer getIdDatosBancarios() {
        return idDatosBancarios;
    }

    public String getCuil() {
        return cuil;
    }

    public String getIngresosBrutos() {
        return ingresosBrutos;
    }

    public String getCbuComafi() {
        return cbuComafi;
    }

    public String getCbuGalicia() {
        return cbuGalicia;
    }

    public String getCbuSanjuan() {
        return cbuSanjuan;
    }

    public Integer getIdMatriculado() {
        return idMatriculado;
    }

    public void setIdDatosBancarios(Integer idDatosBancarios) {
        this.idDatosBancarios = idDatosBancarios;
    }

    public void setCuil(String cuil) {
        this.cuil = cuil;
    }

    public void setIngresosBrutos(String ingresosBrutos) {
        this.ingresosBrutos = ingresosBrutos;
    }

    public void setCbuComafi(String cbuComafi) {
        this.cbuComafi = cbuComafi;
    }

    public void setCbuGalicia(String cbuGalicia) {
        this.cbuGalicia = cbuGalicia;
    }

    public void setCbuSanjuan(String cbuSanjuan) {
        this.cbuSanjuan = cbuSanjuan;
    }

    public void setIdMatriculado(Integer idMatriculado) {
        this.idMatriculado = idMatriculado;
    }

}
