/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examenparcial;

import java.io.Serializable;

/**
 *
 * @author MSI GAMING
 */
public class Cuenta implements Serializable{
    private banco bancos;
    private String nroCuenta;
    private String ci;
    private String nombre;
    private String apellidos;
    private double saldo;

    public Cuenta(banco bancos, String nroCuenta, String ci, String nombre, String apellidos, double saldo) {
        this.bancos = bancos;
        this.nroCuenta = nroCuenta;
        this.ci = ci;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.saldo = saldo;
    }

    public banco getBancos() {
        return bancos;
    }

    public void setBancos(banco bancos) {
        this.bancos = bancos;
    }

    public String getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(String nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "bancos=" + bancos + ", nroCuenta=" + nroCuenta + ", ci=" + ci + ", nombre=" + nombre + ", apellidos=" + apellidos + ", saldo=" + saldo + '}';
    }
    
    
}
