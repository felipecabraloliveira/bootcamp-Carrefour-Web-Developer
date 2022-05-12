package com.dio.base;

/**
 * @author Felipe Cabral
 * @version 1.0.0
 * @since 1.0
 */

public class Order {
    // Representa o código do pedido
    private final String code;
    private final double totalValue;

    private String[] itens;

    /**
     * Método construtor
     * Construtor da Classe Order
     * 
     * @param code       // Código de pedido
     * @param totalValue // Valor total do pedido
     */
    public Order(String code, double totalValue) {
        this.code = code;
        this.totalValue = totalValue;
    }

    public void printIntems() {
        int i = 0;
        while (i < itens.length) {
            System.out.println("Usuando WHILE: " + itens);
            i++;
        }
        int a = 0;
        do {
            System.out.println("Usuando DO: " + itens);
            a++;
        } while (a < itens.length);

        for (int c = 0; c < itens.length; i++) {
            System.out.println("Usuando FOR: " + itens);
        }
        for (String d : itens) {
            System.out.println("Usuando FOR: " + d);
        }

    }

    /**
     * Calcula valor total de acordo com o pedido.
     * Se valor maior que 100, taxa será aplicada.
     */
    /*
     * public double calculateFee() {
     * if (totalValue > 100) {
     * return totalValue * 2.99;
     * } else {
     * return totalValue;
     * }
     * }
     * 
     * 
     * Exemplo Aula 1
     * 
     * 
     * @Override
     * public String toString() {
     * return "Order={" +
     * "code='" + code + "'" +
     * "totalValue='" + totalValue + "'" +
     * "}";
     * }
     */
}
