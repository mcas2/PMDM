package SupuestosPrácticosRepaso;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio01 {
    //Math.random genera números del 0 al 1 excluyendo el 1.
    //Crear un menú para elegir las opciones del ejercicio.
    public static void main(String[] args) {
        Random r = new Random(System.currentTimeMillis());
        int lista [] = new int [100];

        for (int i = 0; i < 100; i++) {
            lista[i] = r.nextInt(100);
        }
        Arrays.sort(lista);
        System.out.println(Arrays.toString(lista));

        mostrarMenu(lista);
    }
    public static void mostrarMenu(int lista[]){
        Scanner sc = new Scanner(System.in);
        int mayor = lista [lista.length-1];
        int menor = lista [0];
        int suma = sumarArray(lista);
        double media = mediaArray(lista);
        String condicion = "";

        do {
            imprimirMenu();
            condicion = sc.next();
            switch (condicion){
                case "mayor":
                    System.out.println(mayor);
                    break;
                case "menor":
                    System.out.println(menor);
                    break;
                case "suma":
                    System.out.println(suma);
                    break;
                case "media":
                    System.out.println(media);
                    break;
                case "cambiar":
                    cambiarElemento(lista);
                    System.out.println(Arrays.toString(lista));
                    break;
                case "exit":
                    break;
                default:
                    System.out.println("Introduce una orden válida.");
                    break;
            }
        } while (!condicion.equalsIgnoreCase("EXIT"));
    }

    public static void imprimirMenu(){
        System.out.println(
                "¿Qué deseas hacer?" +
                        "\nConocer el mayor de los números generados (mayor)" +
                        "\nConocer el menor de los números generados (menor)" +
                        "\nConocer la suma de los números generados (suma)" +
                        "\nConocer la media de los números generados (media)" +
                        "\nSustituir el valor de un elemento por otro (cambiar)" +
                        "\nSalir del programa (exit)" );
    }

    public static int sumarArray (int lista[]) {
        int suma=0;
        for (int i = 0; i < lista.length; i++) {
            suma += lista[i];
        }
        return suma;
    }

    public static double mediaArray (int lista[]){
        double media;
        double suma = 0;
        for (int i = 0; i < lista.length; i++) {
            suma += lista[i];
        }
        return media = suma/lista.length;
    }

    public static int[] cambiarElemento(int lista[]){
        System.out.println("¿Qué posición quieres cambiar?");
        Scanner sc = new Scanner(System.in);
        int posicion = sc.nextInt();
        System.out.println("¿Qué número quieres introducir?");
        int num = sc.nextInt();
        lista[posicion] = num;
        return lista;
    }
}
