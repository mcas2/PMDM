package SupuestosPrácticosRepaso;

import java.util.Scanner;

//Cifrado César. Se trata de trasponer posiciones.
// Ejemplo: BABA sería (con n siendo 1) CBCB
public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuál es tu clave?");
        int clave = sc.nextInt();


        char alfabeto [] = new char [26];
        int contAscii = 65;
        for (int i = 0; i < 26; i++) {
            alfabeto[i] = (char)contAscii;
            contAscii += 1;
        }
        System.out.println("Introduce tu mensaje.");
        String mensaje = sc.nextLine();
        String cifrado;
        System.out.println("Tu mensaje en clave César es:");
    }

    public static String Cifrar (char alfabeto [], String mensaje){
        String cifrado="a";
        return cifrado;
    }
}
