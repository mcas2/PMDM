package SupuestosPrácticosRepaso;
//utilizar los métodos de String como index, lastIndex, etc.

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un texto");
        String cadena = sc.nextLine();
        System.out.println("Introduce una palabra");
        String palabra = sc.next();

        int ocurrencias = 0;

    }

    public static int contarPalabras(String cadena, String palabra) {
        int ocurrencias = 0;
        for (int i = 0; i < cadena.length(); i++) {

                ocurrencias+=1;
            }

        return ocurrencias;
    }
}

