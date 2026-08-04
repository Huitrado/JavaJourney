package org.lhuitrado.poosobrecarga;

import jdk.swing.interop.SwingInterOpUtils;

public class EjemploSobrecargaCalculadora {
    public static void main(String[] args) {


        System.out.println("Sumar int: " + Calculadora.sumar(10, 5));
        System.out.println("Sumar float e int: " + Calculadora.sumar(10.5f, 5));
        System.out.println("Sumar  int y float: " + Calculadora.sumar(10, 5.0f));
        System.out.println("Sumar int, int e int: " + Calculadora.sumar(10, 50, 30));
        System.out.println("Sumar String y String: " + Calculadora.sumar("10", "20"));
        System.out.println("Sumar N cantidad de enteros: " +  Calculadora.sumar(10, 20, 30, 40, 50));
        System.out.println("Sumar un float con N cantidad de enteros: " + Calculadora.sumar(10.5f , 10, 30, 40, 50));
        System.out.println("Sumar 5 double: " + Calculadora.sumar(10.0, 32.4, 34.5, 12.2, 123.43));

    }
}
