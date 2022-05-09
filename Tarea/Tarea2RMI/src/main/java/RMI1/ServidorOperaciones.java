/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMI1;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Usuario
 */
public class ServidorOperaciones extends UnicastRemoteObject implements IOperaciones {

    public ServidorOperaciones() throws RemoteException {
        super();
    }

    @Override
    public int sumatoria(int a) throws RemoteException {
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            sum += i;
        }
        return sum;
    }

    @Override
    public int factorial(int a) throws RemoteException {
        int sum = 1;
        for (int i = 2; i <= a; i++) {
            sum *= i;
        }
        return sum;
    }

    @Override
    public String cadenaInvertida(String cadena) throws RemoteException {
        StringBuilder a = new StringBuilder(cadena);
        cadena = a.reverse().toString();
        return cadena;
    }

}
