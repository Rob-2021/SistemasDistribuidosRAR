/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.laboratorio1amachuy;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author MSI GAMING
 */
public interface IBanco extends Remote{
    public Factura[] calcular(int idcliente) throws RemoteException;
    public String pagar(Factura[] fact) throws RemoteException;
}
