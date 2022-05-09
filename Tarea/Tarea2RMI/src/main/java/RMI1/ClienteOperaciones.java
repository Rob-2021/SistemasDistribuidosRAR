package RMI1;

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
        //System.out.println("Introduzca un numero ");
        int n;
        boolean salir = false;

        try {
            
            operacion = (IOperaciones) Naming.lookup("rmi://localhost/Operaciones"); // instanciar un objeto remoto 
            
            while (!salir) {
                //operacion = (IOperaciones) Naming.lookup("rmi://localhost/Operaciones"); // instanciar un objeto remoto 
                System.out.println("Elija una opcion");
                System.out.println("1.Sumatoria");
                System.out.println("2.Factorial");
                System.out.println("3.Cadena invertida");
                System.out.println("4.Salir");
                
                int op=sc.nextInt();
                
                switch(op){
                    case 1:
                        System.out.println("Introduzca un número: ");
                        n = sc.nextInt();
                        System.out.println("La Sumatoria es: "+operacion.sumatoria(n));
                        break;
                    case 2:
                        System.out.println("Introduzca un número: ");
                        n = sc.nextInt();
                        System.out.println("El Factorial es: "+operacion.factorial(n));
                        break;
                    case 3:
                        System.out.println("Introduzca una cadena: ");
                        String cadena = sc.next();
                        System.out.println("La Cadena invertida es: "+operacion.cadenaInvertida(cadena));
                        break;
                    case 4:
                        salir = true;
                        break;
                        default:
                            System.out.println("Solo introduzca numeros de 1 a 4");
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
