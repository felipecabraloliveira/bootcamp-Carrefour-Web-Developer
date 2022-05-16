package com.dio.loops;

import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numero, maior = 0, media = 0;
        int cont = 0;
        while(cont < 5){
            System.out.println("Digite o " + (cont + 1) + "° número: ");
            numero = scan.nextInt();
            if(numero > maior)
                maior = numero;
            media += numero;
            cont++;
        }
        System.out.println("O maior número digitado foi o: " + maior);
        System.out.println("a média dos números digitados foi : " + (media / 5));

        // Outra forma feita pela Instrutora Camila:
        System.out.println("\nOutra maneira de resolver o código - Camila");
        maior = 0;
        media = 0;
        cont = 0;

        do{
            System.out.println("Número: ");
            numero = scan.nextInt();

            media += numero;
            if(numero > maior) maior = numero;
            cont = cont + 1;
        }while(cont < 5);
        System.out.println("Maior: " + maior);
        System.out.println("Média: " + (media / 5));
    }
}