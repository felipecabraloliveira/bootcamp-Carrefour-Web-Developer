package com.dio;

import com.dio.Veiculo;

public class Moto extends Veiculo{

    int cilindradas;

    public Moto(String modelo, int capcidadeTanque, String cor, String combustivel, int cilindradas) {
        super(modelo, capcidadeTanque, cor, combustivel);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
}
