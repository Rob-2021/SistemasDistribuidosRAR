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
public class ClienteBanco {

    public static void main(String[] args) {
        IBanco banco;
        Scanner sc = new Scanner(System.in);
        Factura[] facturasPendientes = null;

        try {
            int opcion = 0;
            banco = (IBanco) Naming.lookup("rmi://localhost/OperacionesBanco"); // instanciar un objeto remoto
            while (opcion != 3) {
                System.out.println("Escoga una opcion");
                System.out.println("1.Calcular ");
                System.out.println("2.Pagar");
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Introduzca el id del cliente: ");
                        int id = sc.nextInt();
                        System.out.println("La factura pendientes son: ");
                        facturasPendientes = banco.calcular(id);
                        for (Factura f : facturasPendientes) {
                            System.out.println("La factura de cliente es: " + f);
                        }
                        break;
                    case 2:
                        System.out.println("El resultado de la operaciones: ");
                        int i = 0;
                        for (Factura f : facturasPendientes) {
                            System.out.println(i + " : " + f);
                            i++;
                        }
                        //System.out.println("Cual factura desea pagar. Escoga una");
                        //int op = sc.nextInt();
                        System.out.println(banco.pagar(facturasPendientes));
                        ;
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("Introduzca un valor correcto");

                }
            }
        } catch (NotBoundException ex) {
            Logger.getLogger(ClienteBanco.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ClienteBanco.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(ClienteBanco.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
