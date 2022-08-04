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
public class Cuenta {
    public Banco banco;
    public int nrocuenta;
    public Cliente cliente;

    public Cuenta(Banco banco, int nrocuenta, Cliente cliente) {
        this.banco = banco;
        this.nrocuenta = nrocuenta;
        this.cliente = cliente;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
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

    @Override
    public String toString() {
        return "Cuenta{" + "banco=" + banco + ", nrocuenta=" + nrocuenta + ", cliente=" + cliente + '}';
    }
    
    
}
