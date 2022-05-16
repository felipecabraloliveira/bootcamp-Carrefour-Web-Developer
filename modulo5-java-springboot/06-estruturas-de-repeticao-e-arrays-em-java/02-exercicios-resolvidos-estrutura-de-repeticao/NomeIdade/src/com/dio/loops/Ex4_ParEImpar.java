package com.dio.loops;

import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int quantNumeros, numero, cont = 0, quantPar = 0, quantImpar = 0;

        System.out.println("Informe a quantidade de vezes: ");
        quantNumeros = scan.nextInt();

        while(cont < quantNumeros){
            System.out.println("Digite o "+ (cont + 1) + "° número: ");
            numero = scan.nextInt();
            if (numero % 2 == 0) quantPar++;
            else quantImpar++;
            cont++;
        }
        System.out.println("Quantidade de números pares: " + quantPar);
        System.out.println("Quantidade de números Ímpares: " + quantImpar);
    }
}
