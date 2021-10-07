package SupuestosPrácticosRepaso;
//Algoritmo para la creación de un DNI válido.

import java.util.Arrays;
import java.util.Scanner;

import java.util.Scanner;

public class Ejercicio03 {

    private static char codigos[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
            'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    private static boolean confirmar(String digitos, char letra) {
        Long numero = Long.parseLong(digitos);
        int posicion = buscarPosicion(Character.toUpperCase(letra));
        return (numero % 23) == posicion;
    }

    private static int buscarPosicion(char letra) {
        for (int i = 0; i < codigos.length; ++i)
            if (codigos[i] == letra) return i;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca los numeros: ");
        String digitos = sc.nextLine();
        System.out.print("Introduzca la letra: ");
        char letra = sc.next().charAt(0);
        System.out.println("El dni es " + (confirmar(digitos, letra) ? "" : "in" ) + "correcto");

    }
}