package SupuestosPrácticosRepaso;
//Controlar excepciones, operadores falsos, etc.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculadora" +
                "\n1. Suma" +
                "\n2. Resta" +
                "\n3. Multiplicación" +
                "\n4. División" +
                "\n5. Raíz cuadrada" +
                "\nIntroduce la opción y los operandos. (Solo uno en la raiz cuadrada)");

        int calculo = 0;
        try {
            calculo = sc.nextInt();
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
        int num1 = sc.nextInt();
        int num2 = 0;
        if (calculo!=5)  {
            num2 = sc.nextInt();
        }

        switch (calculo) {
            case 1:
                System.out.println(Suma(num1, num2));
                break;
            case 2:
                System.out.println(Resta(num1, num2));
                break;
            case 3:
                System.out.println(Multiplicacion(num1, num2));
                break;
            case 4:
                System.out.println(Division(num1, num2));
                break;
            case 5:
                System.out.println(Raiz(num1));
                break;
        }
    }

    public static int Suma (int num1, int num2){
        int suma = num1 + num2;
        return suma;
    }

    public static int Resta (int num1, int num2){
        int resta = num1 - num2;
        return resta;
    }

    public static int Multiplicacion (int num1, int num2){
        int mult = num1*num2;
        return mult;
    }

    public static double Division (int num1, int num2) {
        double div = (double)num1/(double)num2;
        return div;
    }

    public static double Raiz (int num1) {
        double raiz = Math.sqrt(num1);
        return raiz;
    }
}
