package com.exercicioAutomovel;

public class Esportivo extends Automovel{
    public Esportivo(String combustivel) {
        super(combustivel);
    }
    public String combustivel(){
        return this.getCombustivel();
    }
}
