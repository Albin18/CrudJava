package com.crudo.CrudSpringBoot.modelo;

import jakarta.persistence.*;

@Entity
@Table(name="cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCliente;
    private String nombre;
    private String rut;
    private String correo;
    private String telefono;

    public Cliente() {

    }


    public Cliente(int idCliente, String nombre, String rut, String correo, String telefono) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.rut = rut;
        this.correo = correo;
        this.telefono = telefono;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
