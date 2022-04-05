
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class InvertirCadena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String cadena = "";
        System.out.println("Introducir cadena");
        Scanner cad = new Scanner(System.in);
        cadena = cad.next();
        System.out.println(InvertirCadena(cadena));  
    }
    
    public static String InvertirCadena(String cadena) {
        String cadenaInvertida = "";
        for (int x = cadena.length() - 1; x >= 0; x--)
            cadenaInvertida = cadenaInvertida + cadena.charAt(x);
        return cadenaInvertida;
    }
    
}
