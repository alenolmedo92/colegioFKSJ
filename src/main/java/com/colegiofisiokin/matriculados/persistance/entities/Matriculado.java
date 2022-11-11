package com.colegiofisiokin.matriculados.persistance.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "datos_matriculados")
public class Matriculado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_datos_matriculados")
    private Integer idMatriculado;
    private String nombre;
    private String apellido;
    @Column(name = "tipo_dni")
    private String tipoDni;
    private String dni;
    @Column(name = "fecha_nacimiento")
    private String fechaNacimiento;
    @Column(name = "lugar_nacimiento")
    private String lugarNacimiento;
    @Column(name = "ciudad_nacimiento")
    private String ciudadNacimiento;
    @Column(name = "pais_nacimiento")
    private String paisNacimiento;
    private String nacionalidad;
    @Column(name = "certificado_superintendencia")
    private String certificadoSuperintendencia;
    @Column(name = "fecha_registro_super")
    private String fechaRegistroSuperint;
    @Column(name = "fecha_vencimiento_super")
    private String fechaVencimientoSuper;
    @OneToMany(mappedBy = "matriculado")
    private List<Capacitacion> capacitaciones;
    @OneToMany(mappedBy = "matriculado", cascade = {CascadeType.ALL})
    private List<ContactoProfesional> contactosProfesional;
    @OneToMany(mappedBy = "matriculado")
    private List<Sancion> sanciones;


    //Getters&Setters:

    public Integer getIdMatriculado() {
        return idMatriculado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTipoDni() {
        return tipoDni;
    }

    public String getDni() {
        return dni;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public String getCiudadNacimiento() {
        return ciudadNacimiento;
    }

    public String getPaisNacimiento() {
        return paisNacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getCertificadoSuperintendencia() {
        return certificadoSuperintendencia;
    }

    public String getFechaRegistroSuperint() {
        return fechaRegistroSuperint;
    }

    public String getFechaVencimientoSuper() {
        return fechaVencimientoSuper;
    }

    public List<Capacitacion> getCapacitaciones() {
        return capacitaciones;
    }

    public List<ContactoProfesional> getContactosProfesional() {
        return contactosProfesional;
    }

    public List<Sancion> getSanciones() {
        return sanciones;
    }

    public void setIdMatriculado(Integer idMatriculado) {
        this.idMatriculado = idMatriculado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTipoDni(String tipoDni) {
        this.tipoDni = tipoDni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    public void setCiudadNacimiento(String ciudadNacimiento) {
        this.ciudadNacimiento = ciudadNacimiento;
    }

    public void setPaisNacimiento(String paisNacimiento) {
        this.paisNacimiento = paisNacimiento;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setCertificadoSuperintendencia(String certificadoSuperintendencia) {
        this.certificadoSuperintendencia = certificadoSuperintendencia;
    }

    public void setFechaRegistroSuperint(String fechaRegistroSuperint) {
        this.fechaRegistroSuperint = fechaRegistroSuperint;
    }

    public void setFechaVencimientoSuper(String fechaVencimientoSuper) {
        this.fechaVencimientoSuper = fechaVencimientoSuper;
    }

    public void setCapacitaciones(List<Capacitacion> capacitaciones) {
        this.capacitaciones = capacitaciones;
    }

    public void setContactosProfesional(List<ContactoProfesional> contactosProfesional) {
        this.contactosProfesional = contactosProfesional;
    }

    public void setSanciones(List<Sancion> susciones) {
        this.sanciones = susciones;
    }
}
