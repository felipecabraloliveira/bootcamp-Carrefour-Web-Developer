package com.dio.loops;

import java.util.Scanner;
public class Ex1_NomeEIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome;
        int idade;
        String cont;

        while (true){
            System.out.println("Nome: ");
            nome = scan.next();
            System.out.println("Idade: ");
            idade = scan.nextInt();
            System.out.println("Deseja continuar?[S/N]");
            cont = scan.next();
            if (cont.equals("N") || cont.equals("n") ) {
                System.out.println("Programa Finalizado!");
                break;
            }
        }
    }
}
