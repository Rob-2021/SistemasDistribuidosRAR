/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tresenraya;

import java.util.Scanner;

/**
 *
 * @author Jhon Ramirez
 */
public class Juego {

    

    public static void MostrarTablero(String[] tablero) {
        System.out.println(tablero[0] + "|" + tablero[1] + "|" + tablero[2]);
        System.out.println(tablero[3] + "|" + tablero[4] + "|" + tablero[5]);
        System.out.println(tablero[6] + "|" + tablero[7] + "|" + tablero[8]);
    }

    public static void Jugador(String ficha, String tablero[]) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Donde quieres mover,jugador  " + ficha + "?");
        int posicion = lector.nextInt();
        tablero[posicion] = ficha;

    }

    public static boolean evaluar(String tablero[]) {
        if (tablero[0].equals(tablero[1]) && tablero[0].equals(tablero[2]) && !tablero[0].equals("_")) {
            return true;
        } else if (tablero[3].equals(tablero[4]) && tablero[3].equals(tablero[5]) && !tablero[3].equals("_")) {
            return true;
        } else if (tablero[6].equals(tablero[7]) && tablero[6].equals(tablero[8]) && !tablero[6].equals("_")) {
            return true;
        } else if (tablero[0].equals(tablero[3]) && tablero[0].equals(tablero[6]) && !tablero[0].equals("_")) {
            return true;
        } else if (tablero[1].equals(tablero[4]) && tablero[1].equals(tablero[7]) && !tablero[1].equals("_")) {
            return true;
        } else if (tablero[2].equals(tablero[5]) && tablero[2].equals(tablero[8]) && !tablero[2].equals("_")) {
            return true;
        } else if (tablero[0].equals(tablero[4]) && tablero[0].equals(tablero[8]) && !tablero[0].equals("_")) {
            return true;
        } else if (tablero[2].equals(tablero[4]) && tablero[2].equals(tablero[6]) && !tablero[2].equals("_")) {
            return true;
        }
        return false;
    }

}
