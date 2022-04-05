
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
public class Repaso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero para generar Fibonacci: ");
        int numero = leer.nextInt();
        
        System.out.println(fibonacciRecursivo(numero));
    }
    
    public static int fibonacciRecursivo(int n) {
        if (n==0){
            return 0; 
        } else if (n==1) {
            return 1;
        } else {
            return fibonacciRecursivo(n-1)+fibonacciRecursivo(n-2);
        }
    }
    
}
