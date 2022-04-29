/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio1amachuy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlos
 */
public class ClienteCotes {

    public static void main(String[] args) {
        ICotes cotes;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero ");
        int n = sc.nextInt();
        try {
            cotes = (ICotes) Naming.lookup("rmi://localhost/Operaciones"); // instanciar un objeto remoto 
            //System.out.print(operacion.factorial(n));

        } catch (NotBoundException ex) {
            Logger.getLogger(ClienteCotes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ClienteCotes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(ClienteCotes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
