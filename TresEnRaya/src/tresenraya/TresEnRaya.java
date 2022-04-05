/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tresenraya;

import java.util.Scanner;
import static tresenraya.Juego.Jugador;
import static tresenraya.Juego.MostrarTablero;
import static tresenraya.Juego.evaluar;

/**
 *
 * @author Jhon Ramirez
 */
public class TresEnRaya {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] tablero = {"_", "_", "_", "_", "_", "_", "_", "_", "_"};
        int tirada = 0;
        boolean ganador = false;
        Juego jugar = new Juego();
        do {
           MostrarTablero(tablero);
            String ficha = tirada % 2 == 0 ? "X" : "O";
            Jugador(ficha, tablero);
            ganador = evaluar(tablero);
            if (ganador) {
                System.out.println("ganaste Jugador" + ficha);
            }
            tirada++;
        } while (!ganador);

    }

}
