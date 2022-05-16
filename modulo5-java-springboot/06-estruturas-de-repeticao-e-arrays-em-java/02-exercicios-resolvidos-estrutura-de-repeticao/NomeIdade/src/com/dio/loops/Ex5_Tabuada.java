package com.dio.loops;

import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;

        System.out.println("Digite o número para a tabuada: ");
        numero = scan.nextInt();
        for (int cont = 1; cont <= 10; cont++) {
            System.out.println(numero + " x " + cont + " = " + (cont * numero));
        }
    }
}