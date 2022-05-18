package com.dio;

import com.dio.Veiculo;

public class Caminhao extends Veiculo{
    int eixos;

    public Caminhao(String modelo, int capcidadeTanque, String cor, String combustivel, int eixos) {
        super(modelo, capcidadeTanque, cor, combustivel);
        this.eixos = eixos;
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }
}

