/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.laboratorio1amachuy;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class RMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            ServidorBanco serverBanco = new ServidorBanco();
            ServidorCessa serverCessa = new ServidorCessa();
            ServidorCotes serverCotes = new ServidorCotes();

            LocateRegistry.createRegistry(1099); //levantar el servidor de registro;
            Naming.bind("OperacionesBanco", serverBanco);  // Nombrando el servicio
            Naming.bind("OperacionesCessa", serverCessa);  
            Naming.bind("OperacionesCotes", serverCotes);  
            System.out.println("El servidor esta levandado");

        } catch (RemoteException ex) {
            Logger.getLogger(ServidorBanco.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AlreadyBoundException ex) {
            Logger.getLogger(ServidorBanco.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ServidorBanco.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
