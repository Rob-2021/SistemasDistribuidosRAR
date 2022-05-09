/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMI1;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Usuario
 */
public interface IOperaciones extends Remote {

    public int sumatoria(int a) throws RemoteException;

    public int factorial(int a) throws RemoteException;

    public String cadenaInvertida(String cadena) throws RemoteException;
    
}
