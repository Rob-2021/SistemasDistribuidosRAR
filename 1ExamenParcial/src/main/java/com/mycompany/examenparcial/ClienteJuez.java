/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examenparcial;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MSI GAMING
 */
public class ClienteJuez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IJuez juez;
        boolean salir = false;
        Cuenta cuenta;
        banco bancos;
        
        //juez.ConsultarCuentas(ci, nombres, apellidos);
        
        try {
            
            while(!salir){
               juez = (IJuez) Naming.lookup("rmi://localhost/ServidorASFI"); // instanciar un objeto remoto 
               
               
               
            }
              
        } catch (NotBoundException ex) {
            Logger.getLogger(ClienteJuez.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ClienteJuez.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(ClienteJuez.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
