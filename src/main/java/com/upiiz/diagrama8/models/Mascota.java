package com.upiiz.diagrama8.models;

import java.util.Date;

public class Mascota {
    private Long id;
    private String nombreMascota;
    private String colorMascota;
    private String razaMascota;
    private String padecimientosMascota;
    private String especieMascota;
    private Date fechaNacimientoMascota;
    private byte[] fotoMascota;
    private Boolean bajaMascota;
    private String sexoMascota;
    private Long idUsuario;

    public Mascota() {
    }

    public Mascota(Long id, String nombreMascota, String colorMascota, String razaMascota,
                   String padecimientosMascota, String especieMascota, Date fechaNacimientoMascota, byte[] fotoMascota,
                   Boolean bajaMascota, String sexoMascota, Long idUsuario) {
        this.id = id;
        this.nombreMascota = nombreMascota;
        this.colorMascota = colorMascota;
        this.razaMascota = razaMascota;
        this.padecimientosMascota = padecimientosMascota;
        this.especieMascota = especieMascota;
        this.fechaNacimientoMascota = fechaNacimientoMascota;
        this.fotoMascota = fotoMascota;
        this.bajaMascota = bajaMascota;
        this.sexoMascota = sexoMascota;
        this.idUsuario = idUsuario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getColorMascota() {
        return colorMascota;
    }

    public void setColorMascota(String colorMascota) {
        this.colorMascota = colorMascota;
    }

    public String getRazaMascota() {
        return razaMascota;
    }

    public void setRazaMascota(String razaMascota) {
        this.razaMascota = razaMascota;
    }

    public String getPadecimientosMascota() {
        return padecimientosMascota;
    }

    public void setPadecimientosMascota(String padecimientosMascota) {
        this.padecimientosMascota = padecimientosMascota;
    }

    public String getEspecieMascota() {
        return especieMascota;
    }

    public void setEspecieMascota(String especieMascota) {
        this.especieMascota = especieMascota;
    }

    public Date getFechaNacimientoMascota() {
        return fechaNacimientoMascota;
    }

    public void setFechaNacimientoMascota(Date fechaNacimientoMascota) {
        this.fechaNacimientoMascota = fechaNacimientoMascota;
    }

    public byte[] getFotoMascota() {
        return fotoMascota;
    }

    public void setFotoMascota(byte[] fotoMascota) {
        this.fotoMascota = fotoMascota;
    }

    public Boolean getBajaMascota() {
        return bajaMascota;
    }

    public void setBajaMascota(Boolean bajaMascota) {
        this.bajaMascota = bajaMascota;
    }

    public String getSexoMascota() {
        return sexoMascota;
    }

    public void setSexoMascota(String sexoMascota) {
        this.sexoMascota = sexoMascota;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }
}