package RMI2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlos
 */
public class ClienteLibro {

    public static void main(String[] args) {
        ILibro libro;

        Scanner sc = new Scanner(System.in);
        int anio, idLibro;
        boolean salir = false;
        String titulo, autor, editorial, mensaje;

        try {

            libro = (ILibro) Naming.lookup("rmi://localhost/libros"); // instanciar un objeto remoto 

            while (!salir) {
                System.out.println("Elija una opcion");
                System.out.println("1.Crear");
                System.out.println("2.Editar");
                System.out.println("3.Eliminar");
                System.out.println("4.Mostrar");
                System.out.println("5.Salir");

                int op = sc.nextInt();

                switch (op) {
                    case 1:
                        System.out.println("Introduzca el titulo del libro: ");
                        titulo = sc.next();
                        System.out.println("Introduzca el autor del libro: ");
                        autor = sc.next();
                        System.out.println("Introduzca la editorial del libro: ");
                        editorial = sc.next();
                        System.out.println("Introduzca el Año del libro: ");
                        anio = sc.nextInt();
                        System.out.println("Libro: ");
                        mensaje = libro.crear(titulo, autor, editorial, anio);
                        if (mensaje.equals("si")) {
                            System.out.println("Se inserto con exito");
                        } else {
                            System.out.println("Hubo un error al insertar");
                        }
                        break;
                    case 2:
                        System.out.println("Introduzca el ID del libro que quiere editar: ");
                        idLibro = sc.nextInt();
                        System.out.println("Introduzca el titulo del libro: ");
                        titulo = sc.next();
                        System.out.println("Introduzca el autor del libro: ");
                        autor = sc.next();
                        System.out.println("Introduzca la editorial del libro: ");
                        editorial = sc.next();
                        System.out.println("Introduzca el Año del libro: ");
                        anio = sc.nextInt();
                        System.out.println("Libro: ");
                        Libro aux = libro.editar(idLibro, titulo, autor, editorial, anio);
                        System.out.println(aux);
                        break;
                    case 3:
                        System.out.println("Introduzca el ID del libro para eliminar: ");
                        idLibro=sc.nextInt();
                        libro.eliminar(idLibro);
                        break;
                        case 4:
                            ArrayList<Libro> auxiliar = libro.mostrar();
                            
                            for(Libro libros:auxiliar){
                                System.out.println(libros);
                            }
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
            Logger.getLogger(ClienteLibro.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ClienteLibro.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(ClienteLibro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
