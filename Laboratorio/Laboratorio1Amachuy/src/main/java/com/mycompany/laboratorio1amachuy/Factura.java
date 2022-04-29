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
public class Factura implements Serializable{
    Empresa empresa;
    int idfactura;
    Mes mes;
    int anio;
    double monto;

    public Factura(Empresa empresa, int idfactura, Mes mes, int anio, double monto) {
        this.empresa = empresa;
        this.idfactura = idfactura;
        this.mes = mes;
        this.anio = anio;
        this.monto = monto;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public int getIdfactura() {
        return idfactura;
    }

    public void setIdfactura(int idfactura) {
        this.idfactura = idfactura;
    }

    public Mes getMes() {
        return mes;
    }

    public void setMes(Mes mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }


}