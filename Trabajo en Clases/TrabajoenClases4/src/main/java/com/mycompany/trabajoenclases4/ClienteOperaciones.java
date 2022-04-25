package com.mycompany.trabajoenclases4;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
public class ClienteOperaciones {

    public static void main(String[] args) {
        IOperaciones operacion;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero ");
        int n = sc.nextInt();
        System.out.println("Introduzca un segundo numero ");
        int n2 = sc.nextInt();
        boolean salir = false;

        try {

            while (!salir) {
                operacion = (IOperaciones) Naming.lookup("rmi://localhost/Operaciones"); // instanciar un objeto remoto 
                System.out.println("Elija una opcion");
                System.out.println("1.Suma");
                System.out.println("2.Resta");
                System.out.println("3.Multiplicacion");
                System.out.println("4.Division");
                System.out.println("5.Salir");
                
                int op=sc.nextInt();
                
                switch(op){
                    case 1:
                        System.out.println("La Suma es: "+operacion.suma(n, n2));
                        break;
                    case 2:
                        System.out.println("La Resta es: "+operacion.resta(n, n2));
                        break;
                    case 3:
                        System.out.println("La Multiplicacion es: "+operacion.multiplicacion(n, n2));
                        break;
                    case 4:
                        System.out.println("La Division es: "+operacion.division(n, n2));
                        break;
                    case 5:
                        salir = true;
                        break;
                        default:
                            System.out.println("Solo introduzca numeros de 1 a 5");
                            break;
                }
            }

        } catch (NotBoundException ex) {
            Logger.getLogger(ClienteOperaciones.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ClienteOperaciones.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(ClienteOperaciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
