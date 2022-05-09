/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.laboratorio1amachuy;

import java.io.Serializable;

/**
 *
 * @author MSI GAMING
 */
public class Empresa implements Serializable{
    private String nombre;
    private Long NIT;

    public Empresa(String nombre, Long NIT) {
        this.nombre = nombre;
        this.NIT = NIT;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getNIT() {
        return NIT;
    }

    public void setNIT(Long NIT) {
        this.NIT = NIT;
    }

    @Override
    public String toString() {
        return "Empresa{" + "nombre=" + nombre + ", NIT=" + NIT + '}';
    }
    
}
