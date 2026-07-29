package org.lhuitrado.poosobrecarga;

import jdk.swing.interop.SwingInterOpUtils;

public class EjemploSobrecargaCalculadora {
    public static void main(String[] args) {
        Calculadora cal = new Calculadora();

        System.out.println("Sumar int: " + cal.sumar(10, 5));
        System.out.println("Sumar float e int: " + cal.sumar(10.5f, 5));
        System.out.println("Sumar  int y float: " + cal.sumar(10, 5.0f));
        System.out.println("Sumar int, int e int: " + cal.sumar(10, 50, 30));
        System.out.println("Sumar String y String: " + cal.sumar("10", "20"));
    }
}
