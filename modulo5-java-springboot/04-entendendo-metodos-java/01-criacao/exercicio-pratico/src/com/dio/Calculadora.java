package com.dio;

public class Calculadora {
    public static void main(String[] args) {

        double num1 = 5;
        double num2 = 3;

        double soma = adicao(num1,num2);
        double sub = subtracao(num1,num2);
        double div = divisao(num1,num2);
        double mult = multiplicacao(num1,num2);

        System.out.println("Adição: " + soma);
        System.out.println("Subtração: " + sub);
        System.out.println("Divisão: " + div);
        System.out.println("Multiplicação: " + mult);
    }

        public static double adicao(double a, double b) {
            return a + b;
        }

        public static double subtracao(double a, double b) {
            return a - b;
        }

        public static double divisao(double a, double b) {
            return a / b;
        }

        public static double multiplicacao(double a, double b) {
            return a * b;
        }
    }