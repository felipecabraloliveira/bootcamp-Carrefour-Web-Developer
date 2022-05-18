package com.dio;

public class Veiculo {

    String modelo;
    int capcidadeTanque;
    String cor;

    String combustivel;

    public Veiculo(String modelo, int capcidadeTanque, String cor, String combustivel) {
        this.modelo = modelo;
        this.capcidadeTanque = capcidadeTanque;
        this.cor = cor;
        this.combustivel = combustivel;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapcidadeTanque() {
        return capcidadeTanque;
    }

    public void setCapcidadeTanque(int capcidadeTanque) {
        this.capcidadeTanque = capcidadeTanque;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }
}
