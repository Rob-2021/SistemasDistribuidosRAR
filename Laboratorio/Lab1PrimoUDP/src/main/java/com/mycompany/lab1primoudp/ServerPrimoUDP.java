/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab1primoudp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 *
 * @author Carlos
 */
public class ServerPrimoUDP {

   /*public static String Recuperar(String cad, int a) {
        String res = "";
        for (int i = 0; i < a; i++) {
            res += cad.charAt(i);
        }
        return res;
    }*/
    

    public static void main(String args[]) {

        int port = 6789;
        try {
            

            DatagramSocket socketUDP = new DatagramSocket(port);
            byte[] bufer = new byte[1000];

            while (true) {
                // Construimos el DatagramPacket para recibir peticiones
                DatagramPacket peticion
                        = new DatagramPacket(bufer, bufer.length);

                // Leemos una petición del DatagramSocket
                socketUDP.receive(peticion);
                
                String cadena = new String(peticion.getData());
                int valor = Integer.valueOf(cadena.trim());

                /*String dato = new String(peticion.getData());
                String dato1 = Recuperar(dato, peticion.getLength());
                int numero = Integer.parseInt(dato1);*/
                
                boolean primo = esPrimo(valor);
                
                
                String datos ="";
                if(primo == false){
                    datos = "No es Primo";
                }
                else{
                    datos = "Es Primo";
                }

                
                
                System.out.print("Datagrama recibido del host: "
                        + peticion.getAddress());
                System.out.println(" desde el puerto remoto: "
                        + peticion.getPort());

                // Construimos el DatagramPacket para enviar la respuesta
                byte[] mensaje = datos.getBytes();
                
                DatagramPacket respuesta
                        = new DatagramPacket(mensaje, datos.length(),
                                peticion.getAddress(), peticion.getPort());

                // Enviamos la respuesta, que es un eco
                socketUDP.send(respuesta);
            }

        } catch (SocketException e) {
            System.out.println("Socket: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO: " + e.getMessage());
        }
    }

    public static boolean esPrimo(int numero) {
        // El 0, 1 y 4 no son primos
        if (numero == 0 || numero == 1 || numero == 4) {
            return false;
        }
        for (int x = 2; x < numero / 2; x++) {
            // Si es divisible por cualquiera de estos números, no
            // es primo
            if (numero % x == 0) {
                return false;
            }
        }
        // Si no se pudo dividir por ninguno de los de arriba, sí es primo
        return true;
    }

}
