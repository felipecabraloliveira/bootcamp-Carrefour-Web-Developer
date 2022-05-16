package com.dio;

public class Main {
    public static void main(String[] args) {

        double a = 10;
        double b = 10;
        System.out.println("Exercício Calculadora: ");
        System.out.println("Classe Calculadora, método adicao: " + Calculadora.adicao(a,b));
        System.out.println("Classe Calculadora, método subtracao: " + Calculadora.subtracao(a,b));
        System.out.println("Classe Calculadora, método divisao: " + Calculadora.divisao(a,b));
        System.out.println("Classe Calculadora, método multiplicacao: " + Calculadora.multiplicacao(a,b));

        System.out.println("\nExercício Mensagem:");
        System.out.println("9h: "  + Mensagem.entradaHora(9));
        System.out.println("21h: " + Mensagem.entradaHora(21));
        System.out.println("15h: " + Mensagem.entradaHora(15));

        System.out.println("\nExercício Empréstimo:");
        Emprestimo.calculaValor(1000,6);
    }
}
