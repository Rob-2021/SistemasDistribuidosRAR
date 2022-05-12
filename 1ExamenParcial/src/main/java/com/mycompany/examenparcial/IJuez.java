/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examenparcial;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author MSI GAMING
 */
public interface IJuez extends Remote{
    ArrayList<Cuenta> ConsultarCuentas(String ci, String nombres, String apellidos) throws RemoteException;
    boolean RetenerMonto(Cuenta cuenta,int monto, int glosa) throws RemoteException;
}
