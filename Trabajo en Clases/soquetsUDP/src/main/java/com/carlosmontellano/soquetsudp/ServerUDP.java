/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlosmontellano.soquetsudp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 *
 * @author Carlos
 */
public class ServerUDP {

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
                
                String numero = peticion.getData().toString();
                int p = potencia(Integer.parseInt(numero));
                
                //String str = new String(bytes, java.nio.charset.StandardCharsets.UTF_8);

                
                System.out.println("Numero: "+peticion.getData());

                System.out.print("Datagrama recibido del host: "
                        + peticion.getAddress());
                System.out.println(" desde el puerto remoto: "
                        + peticion.getPort());
                
                System.out.println("Potencia: "+p);

                // Construimos el DatagramPacket para enviar la respuesta
                DatagramPacket respuesta
                        = new DatagramPacket(peticion.getData(), peticion.getLength(),
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
    
    public static int potencia(int n) {
        int potencia;
        
        potencia = (int) Math.pow(n, 3);
        
        return potencia;
    }

}
