package com.dio;

import com.dio.Veiculo;

public class Carro extends Veiculo {
    int portas;
    int lugares;

    public Carro(String modelo, int capcidadeTanque, String cor, String combustivel, int portas, int lugares) {
        super(modelo, capcidadeTanque, cor, combustivel);
        this.portas = portas;
        this.lugares = lugares;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public int getLugares() {
        return lugares;
    }

    public void setLugares(int lugares) {
        this.lugares = lugares;
    }
}
