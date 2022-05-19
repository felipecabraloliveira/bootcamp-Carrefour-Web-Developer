package com.dio.polimorfismo;

public class ClassFilha2 extends ClassMae {

    @Override
    void metodo1() {
        System.out.println("Método 1 da Class Filha 2");
    }

    @Override // Subscrita
    void metodo2() {
        System.out.println("Método 2 da Class Filha 2");
    }
}
