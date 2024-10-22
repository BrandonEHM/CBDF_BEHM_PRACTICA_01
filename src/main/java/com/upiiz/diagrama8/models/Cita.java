package com.upiiz.diagrama8.models;

import java.sql.Time;
import java.util.Date;


public class Cita {
    private Long id;
    private String tipoCita;
    private String descripcion;
    private String observacion;
    private Date fechaCita;
    private Time horaCita;
    private Long idmascota;
    private Long idusuario;
    private Long idveterinario;
    private Boolean estatuscita;

    public Cita() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoCita() {
        return tipoCita;
    }

    public void setTipoCita(String tipoCita) {
        this.tipoCita = tipoCita;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Date getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(Date fechaCita) {
        this.fechaCita = fechaCita;
    }

    public Time getHoraCita() {
        return horaCita;
    }

    public void setHoraCita(Time horaCita) {
        this.horaCita = horaCita;
    }

    public Long getIdmascota() {
        return idmascota;
    }

    public void setIdmascota(Long idmascota) {
        this.idmascota = idmascota;
    }

    public Long getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Long idusuario) {
        this.idusuario = idusuario;
    }

    public Long getIdveterinario() {
        return idveterinario;
    }

    public void setIdveterinario(Long idveterinario) {
        this.idveterinario = idveterinario;
    }

    public Boolean getEstatuscita() {
        return estatuscita;
    }

    public void setEstatuscita(Boolean estatuscita) {
        this.estatuscita = estatuscita;
    }
}