package com.dio.loops;

import java.util.Scanner;

public class Ex2_Nota {
    public static void main(String[] args) {
        int nota;
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("Digite uma nota entre 0 e 10: ");
            nota = scan.nextInt();
            if (nota >= 0 && nota <= 10){
                System.out.println("A nota digitada foi: " + nota);
                break;
            }
            System.out.println("Nota inválida!\n");
        }
    }
}
