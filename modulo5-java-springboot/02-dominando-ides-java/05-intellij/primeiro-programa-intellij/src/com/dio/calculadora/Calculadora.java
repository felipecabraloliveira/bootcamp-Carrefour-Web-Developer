package com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a, b;

        System.out.println("Digite o primeiro Valor: ");
        a = scan.nextDouble();
        System.out.println("Digite o segundo Valor: ");
        b = scan.nextDouble();

        System.out.println("Soma: " + somar(a, b));
        System.out.println("Subtração: " + subtracao(a, b));
        System.out.println("Multiplicação: " + multiplicacao(a, b));
        System.out.println("dividir: " + dividir(a, b));
    }

    public static double somar(double a, double b){
        return a + b;
    }

    public static double subtracao(double a, double b){
        return a - b;
    }

    public static double multiplicacao(double a, double b){
        return a * b;
    }

    public static double dividir(double a, double b){
        return a / b;
    }
}
