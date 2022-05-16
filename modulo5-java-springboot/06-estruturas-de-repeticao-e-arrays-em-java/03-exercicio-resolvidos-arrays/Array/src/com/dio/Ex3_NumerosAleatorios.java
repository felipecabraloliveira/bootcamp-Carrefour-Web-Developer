package com.dio;

import java.util.Random;
import java.util.Scanner;

public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {

        Random aleatorio = new Random();

        int[] numerosAleatorios = new int[20];

        for( int cont = 0; cont < numerosAleatorios.length; cont++){
            int numero = aleatorio.nextInt(100);
            numerosAleatorios[cont] = numero;
        }

        System.out.println("Número Aleatório em ordem!");
        for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");
        }

        System.out.println("\nNúmero Aleatório Sucessor!");
        for (int numero : numerosAleatorios) {
            System.out.print((numero+1) + " ");
        }

        System.out.println("\nNúmero Aleatório Antecessor!");
        for (int numero : numerosAleatorios) {
            System.out.print((numero-1) + " ");
        }
    }
}
