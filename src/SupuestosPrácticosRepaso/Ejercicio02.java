package SupuestosPrácticosRepaso;

import java.util.InputMismatchException;
import java.util.Scanner;

//Usar excepciones como Arrayboundoutofrange y la de los enteros.
//en base a la excepción redirigimos el flujo de ejecución.
public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       try {
           System.out.println("Introduce una cadena");
           String cadena = sc.nextLine();
           System.out.println("Introduce una posición");
           int posicion = sc.nextInt();

           System.out.println(cadena.charAt(posicion-1));

       } catch (StringIndexOutOfBoundsException s) {
           System.out.println("Esa posición está fuera del rango de la cadena.");

       } catch (InputMismatchException im){
           System.out.println("Introduce un número entero.");
       }
    }
}
