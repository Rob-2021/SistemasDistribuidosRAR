/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examenparcial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author MSI GAMING
 */
public class TCPBancoMercantil {

    /**
     * @param args the command line arguments
     */
    
    public static boolean Buscar(String buscar){
        String[] arr = buscar.split(" ");
        
        String ci = arr[0];
        String nombre = arr[1];
        String apellido1 = arr[2];
        String apellido2 = arr[3];
        String banco = arr[4];
        
        if (ci.equals("11021654") && nombre.equals("Juan") && apellido1.equals("Perez") && apellido2.equals("Segovia")&& banco.equals("23254")){
            return true;
        }else{       
            return false;
        }

    }
    
    public static boolean Congelar(int cuentaMonto){
       
        return true;
    }
    
    public static void main(String[] args) {
         int port = 5002; 
              
        try {
            ServerSocket server = new ServerSocket(port);
            System.out.println("Se inicio el servidor con éxito");
            Socket client;
            PrintStream toClient;       
            client = server.accept(); //conexion
            BufferedReader fromClient = new BufferedReader(new InputStreamReader(client.getInputStream())); // el lector
            System.out.println("Cliente se conecto");
            System.out.println(fromClient.readLine());
            toClient = new PrintStream(client.getOutputStream()); 
            toClient.println("Hola Mundo");
            System.out.println("Cliente se conecto");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
