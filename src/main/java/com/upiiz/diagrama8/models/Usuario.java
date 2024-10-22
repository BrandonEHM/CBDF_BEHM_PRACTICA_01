package com.upiiz.diagrama8.models;


public class Usuario {
    private Long id;
    private String nombreUsuario;
    private String apellidoUsuario;
    private String telefonoUsuario;
    private String emailUsuario;
    private String estadoUsuario;
    private String ciudadUsuario;
    private String coloniaUsuario;
    private Integer cpUsuario;
    private String calleUsuario;
    private String numExtUsuario;
    private String passwordUsuario;
    private Boolean estatusUsuario;
    private Boolean bajaUsuario;
    private byte[] fotoUsuario;
    private Long id_veterinario;


    public Usuario() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    public String getTelefonoUsuario() {
        return telefonoUsuario;
    }

    public void setTelefonoUsuario(String telefonoUsuario) {
        this.telefonoUsuario = telefonoUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getEstadoUsuario() {
        return estadoUsuario;
    }

    public void setEstadoUsuario(String estadoUsuario) {
        this.estadoUsuario = estadoUsuario;
    }

    public String getCiudadUsuario() {
        return ciudadUsuario;
    }

    public void setCiudadUsuario(String ciudadUsuario) {
        this.ciudadUsuario = ciudadUsuario;
    }

    public String getColoniaUsuario() {
        return coloniaUsuario;
    }

    public void setColoniaUsuario(String coloniaUsuario) {
        this.coloniaUsuario = coloniaUsuario;
    }

    public Integer getCpUsuario() {
        return cpUsuario;
    }

    public void setCpUsuario(Integer cpUsuario) {
        this.cpUsuario = cpUsuario;
    }

    public String getCalleUsuario() {
        return calleUsuario;
    }

    public void setCalleUsuario(String calleUsuario) {
        this.calleUsuario = calleUsuario;
    }

    public String getNumExtUsuario() {
        return numExtUsuario;
    }

    public void setNumExtUsuario(String numExtUsuario) {
        this.numExtUsuario = numExtUsuario;
    }

    public String getPasswordUsuario() {
        return passwordUsuario;
    }

    public void setPasswordUsuario(String passwordUsuario) {
        this.passwordUsuario = passwordUsuario;
    }

    public Boolean getBajaUsuario() {
        return bajaUsuario;
    }

    public void setBajaUsuario(Boolean bajaUsuario) {
        this.bajaUsuario = bajaUsuario;
    }

    public Boolean getEstatusUsuario() {
        return estatusUsuario;
    }

    public void setEstatusUsuario(Boolean estatusUsuario) {
        this.estatusUsuario = estatusUsuario;
    }

    public byte[] getFotoUsuario() {
        return fotoUsuario;
    }

    public void setFotoUsuario(byte[] fotoUsuario) {
        this.fotoUsuario = fotoUsuario;
    }

    public Long getId_veterinario() {
        return id_veterinario;
    }

    public void setId_veterinario(Long id_veterinario) {
        this.id_veterinario = id_veterinario;
    }
}