package com.dio;

public class Emprestimo {
    public static double parcelasAte5(){
        return 0.20;
    }
    public static double parcelas5ate10(){
        return 0.40;
    }
    public static double parcelas10ate15(){
        return 0.80;
    }
    public static void calculaValor(double valor, int parcelas ){
        double juros;
        double valorFinal;
        double valorParcela;
        if (parcelas <= 5){
            juros = parcelasAte5();
        }else if(parcelas <= 10){
            juros = parcelas5ate10();
        }else{
            juros = parcelas10ate15();
        }

        valorFinal = valor + (juros * valor);
        valorParcela = valorFinal / parcelas;

        System.out.println("Valor solicitado: " + valor +
                "\nValor com Juros: " + valorFinal + "\nValor das Parcelas: " +
                " " +parcelas+ " x " + valorParcela);
        }
}
