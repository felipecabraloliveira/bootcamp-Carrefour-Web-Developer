package com.dio.polimorfismo;

public class RodarAplicacao {
    public static void main(String[] args) {

        // Cria vetor da classe mae, 3 objetos - Filha1, Filha2 e Mae
        // polimorfismo
        ClassMae[] classes = new ClassMae[]{new ClassFilha1(), new ClassFilha2(), new ClassMae()};

        for (ClassMae classe: classes){
            classe.metodo1();
        }

        System.out.println("");

        for(ClassMae classe : classes){
            classe.metodo2();
        }

        System.out.println("");

        ClassFilha2 classeFilha2 = new ClassFilha2();
        classeFilha2.metodo2();

    }
}
