package com.dio;

public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        int[] vetor = {0,-5,15,50,8,4};

        System.out.println("Utilizando For!");
        for (int i = vetor.length -1 ; i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }

        System.out.println("\nUtilizando While!");
        int cont = 0;
        while(cont <= vetor.length-1 ){
            System.out.print(vetor[cont] + " ");
            cont++;
        }
    }
}
