/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bancormi;

/**
 *
 * @author MSI GAMING
 */
public class CuentaBanco {
    public int nrocuenta;
    public Cliente cliente;
    public Double saldo;

    public CuentaBanco(int nrocuenta, Cliente cliente, Double saldo) {
        this.nrocuenta = nrocuenta;
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public int getNrocuenta() {
        return nrocuenta;
    }

    public void setNrocuenta(int nrocuenta) {
        this.nrocuenta = nrocuenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "CuentaBanco{" + "nrocuenta=" + nrocuenta + ", cliente=" + cliente + ", saldo=" + saldo + '}';
    }
    
    
}
