package com.exercicioAutomovel;

public class Caminhao extends Automovel{
    public Caminhao(String combustivel) {
        super(combustivel);
    }

    public String combustivel(){
        return this.getCombustivel();
    }
}
