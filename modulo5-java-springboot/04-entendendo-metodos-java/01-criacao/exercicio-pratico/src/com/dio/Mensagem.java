package com.dio;

public class Mensagem {
    public static void main(String[] args) {
        System.out.println(entradaHora(9));
    }
    public static String entradaHora(int hora){
        String mensagem;
        if( hora >= 6 && hora < 12){
            mensagem = "Bom dia!";
        }else if(hora >= 12 && hora < 18){
            mensagem = "Boa tarde!";
        }else{
            mensagem = ("Boa Noite!");
        }
        return mensagem;
    }
}
