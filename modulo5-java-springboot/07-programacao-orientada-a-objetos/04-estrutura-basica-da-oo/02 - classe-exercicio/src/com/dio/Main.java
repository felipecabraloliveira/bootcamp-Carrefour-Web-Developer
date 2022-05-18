package com.dio;

import com.dio.Carro;

public class Main {
    public static void main(String[] args) {
        // Criando Objeto
        Carro carro = new Carro();

        // Setando valor nos atributos
        carro.setCor("Cinza");
        carro.setModelo("Civic");
        carro.setCapacidadeTanque(80);

        // Exibindo os valores e chamando o método para verificar o valor para encher o tanque.
        System.out.println("Cor: " + carro.getCor());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Capacidade Tanque: " + carro.getCapacidadeTanque());
        System.out.println("Valor para encher o tanque: " + carro.totalValorTanque(5.95));

        // Exemplo de criação passando valores.
        Carro carro2 = new Carro("Preto","BMW",90);
        System.out.println("\nCor: " + carro2.getCor());
        System.out.println("Modelo: " + carro2.getModelo());
        System.out.println("Capacidade Tanque: " + carro2.getCapacidadeTanque());
        System.out.println("Valor para encher o tanque: " + carro2.totalValorTanque(5.95));

    }
}