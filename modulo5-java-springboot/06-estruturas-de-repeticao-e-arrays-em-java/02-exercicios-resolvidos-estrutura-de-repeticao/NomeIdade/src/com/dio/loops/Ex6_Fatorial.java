package com.dio.loops;

import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        int multiplicacao = 1;

        System.out.println("Digite o número: ");
        numero = scan.nextInt();
        for(int cont= numero; cont >= 1; cont-- ){
            multiplicacao = multiplicacao * cont;
            System.out.println(cont);
        }
        System.out.println(multiplicacao);
    }
}
