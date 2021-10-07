package SupuestosPrácticosRepaso;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random(System.currentTimeMillis());
        int numero = r.nextInt(100);
        int prueba;
        boolean acierto = false;

        System.out.println("Prueba suerte con un número");

        while (acierto==false){
            prueba = sc.nextInt();
            if (prueba>numero){
                System.out.println("¡Más bajo!");
            } else if (prueba<numero) {
                System.out.println("¡Más alto!");
            } else {
                System.out.println("Enhorabuena, ¡has acertado!");
                acierto=true;
            }
        }
    }
}
