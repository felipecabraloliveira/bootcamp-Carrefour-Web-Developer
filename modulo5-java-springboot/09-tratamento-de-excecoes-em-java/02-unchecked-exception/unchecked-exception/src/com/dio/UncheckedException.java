package com.dio;

import javax.swing.*;

public class UncheckedException {
    public static void main(String[] args) {

        boolean continueLooping = true;
        do{
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Deniminador: ");
            try {
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: " + resultado);
                continueLooping = false;
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Entrada inválida, informe um número inteiro!");
                //e.printStackTrace();
            }catch (ArithmeticException e){
                JOptionPane.showMessageDialog(null,"Entrada inválida, impossível dividir um número por 0!");
            }
            finally {
                System.out.println("Chegou no Finally!");
            }
        }while (continueLooping);
    }

    public static int dividir(int a, int b){
        return a / b;
    }
}
