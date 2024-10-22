package com.upiiz.diagrama8.models;

import java.util.Date;

public class Consulta {
private Long id;
private String tipoConsulta;
private Date proximaCitaConsulta;
private int pesoConsulta;
private String productoConsulta;
private String aplicoConsulta;
private String descripcionConsulta;
private String ObservacionesConsulta;
private Long idMascota;
private Long idVeterinario;
private Long idCita;

    public Consulta() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoConsulta() {
        return tipoConsulta;
    }

    public void setTipoConsulta(String tipoConsulta) {
        this.tipoConsulta = tipoConsulta;
    }

    public Date getProximaCitaConsulta() {
        return proximaCitaConsulta;
    }

    public void setProximaCitaConsulta(Date proximaCitaConsulta) {
        this.proximaCitaConsulta = proximaCitaConsulta;
    }

    public int getPesoConsulta() {
        return pesoConsulta;
    }

    public void setPesoConsulta(int pesoConsulta) {
        this.pesoConsulta = pesoConsulta;
    }

    public String getProductoConsulta() {
        return productoConsulta;
    }

    public void setProductoConsulta(String productoConsulta) {
        this.productoConsulta = productoConsulta;
    }

    public String getAplicoConsulta() {
        return aplicoConsulta;
    }

    public void setAplicoConsulta(String aplicoConsulta) {
        this.aplicoConsulta = aplicoConsulta;
    }

    public String getDescripcionConsulta() {
        return descripcionConsulta;
    }

    public void setDescripcionConsulta(String descripcionConsulta) {
        this.descripcionConsulta = descripcionConsulta;
    }

    public String getObservacionesConsulta() {
        return ObservacionesConsulta;
    }

    public void setObservacionesConsulta(String observacionesConsulta) {
        ObservacionesConsulta = observacionesConsulta;
    }

    public Long getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(Long idMascota) {
        this.idMascota = idMascota;
    }

    public Long getIdVeterinario() {
        return idVeterinario;
    }

    public void setIdVeterinario(Long idVeterinario) {
        this.idVeterinario = idVeterinario;
    }

    public Long getIdCita() {
        return idCita;
    }

    public void setIdCita(Long idCita) {
        this.idCita = idCita;
    }
}
