package SupuestosPrácticosRepaso;

import java.util.Scanner;

//Cifrado César. Se trata de trasponer posiciones.
// Ejemplo: BABA sería (con n siendo 1) CBCB
public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuál es tu clave?");
        int clave = sc.nextInt();
        
        System.out.println("Introduce tu mensaje.");
        String mensaje = sc.nextLine();

        char [] cifrado = Cifrar(mensaje, clave);

        System.out.println("Tu mensaje en clave César es:");
        System.out.println(cifrado);
    }

    public static char[] Cifrar (String mensaje, int clave){
        char cifrado [] = mensaje.toCharArray();
        for (int i = 0; i < mensaje.length(); i++) {
            cifrado[i] = (char) (mensaje.charAt(i)+clave);
        }
        return cifrado;
    }
}

/*
        char alfabeto [] = new char [26];
        int contAscii = 65;
        for (int i = 0; i < 26; i++) {
            alfabeto[i] = (char)contAscii;
            contAscii += 1;
        }
*/