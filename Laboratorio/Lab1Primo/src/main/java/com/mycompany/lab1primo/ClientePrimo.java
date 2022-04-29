/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab1primo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;



/**
 *
 * @author Carlos
 */
public class ClientePrimo {

    public static void main(String[] args) {
        int port = 5002;
        try {
            Socket client = new Socket("localhost", port); 
            PrintStream toServer = new PrintStream(client.getOutputStream());
            BufferedReader fromServer = new BufferedReader(new InputStreamReader(client.getInputStream()));
            System.out.println("Introduzca el valor de N: ");
            Scanner llamada = new Scanner(System.in);
            int numero = llamada.nextInt();
            
            toServer.println(numero);
            String result = fromServer.readLine(); 
            String verdadero = "true";
            
           
                if(verdadero.equals(result)){
                    System.out.println("El numero "+numero+" es Primo");
                }
                else{
                    System.out.println("El numero "+numero+" no es Primo");
                
                }
          //System.out.println("Es " + result);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
