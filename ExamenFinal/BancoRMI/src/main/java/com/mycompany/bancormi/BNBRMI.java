/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bancormi;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlos
 */
public class BNBRMI {
    
     public static void main(String[] args){
         
         try {
             ServidorBanco server=new ServidorBanco();
         
             LocateRegistry.createRegistry(1099); //levantar el servidor de registro;
             Naming.bind("BNB",server);
             System.out.println("El servidor esta levandado");
             
             
         } catch (RemoteException ex) {
             Logger.getLogger(BNBRMI.class.getName()).log(Level.SEVERE, null, ex);
         } catch (AlreadyBoundException ex) {
             Logger.getLogger(BNBRMI.class.getName()).log(Level.SEVERE, null, ex);
         } catch (MalformedURLException ex) {
             Logger.getLogger(BNBRMI.class.getName()).log(Level.SEVERE, null, ex);
         }
         
         
    }
    
}
