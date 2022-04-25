package com.mycompany.trabajoenclases4;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Carlos
 */
public class ServidorOperaciones extends UnicastRemoteObject implements IOperaciones {

    public ServidorOperaciones() throws RemoteException {
        super();
    }

    @Override
    public int suma(int a, int b) throws RemoteException {
        return a + b;
    }

    @Override
    public int resta(int a, int b) throws RemoteException {
        return a - b;
    }

    @Override
    public int multiplicacion(int a, int b) throws RemoteException {
        return a * b;
    }

    @Override
    public int division(int a, int b) throws RemoteException {
        return a / b;
    }

}
