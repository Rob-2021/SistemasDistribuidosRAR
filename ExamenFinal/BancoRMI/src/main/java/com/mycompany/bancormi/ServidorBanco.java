/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bancormi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author MSI GAMING
 */
public class ServidorBanco extends UnicastRemoteObject implements IBanco{
    
    public ServidorBanco() throws RemoteException {
        super();
    }

    @Override
    public Boolean Retirar(CuentaBanco nrCuentaBanco, CuentaBanco monto) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return false;
    }

    @Override
    public Boolean Abonar(CuentaBanco nrCuentaBanco, CuentaBanco monto) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return true;
    }
    
}
