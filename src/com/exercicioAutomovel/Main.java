package com.exercicioAutomovel;

public class Main {
    public static void main(String[] args) {
        Caminhao caminhao = new Caminhao("Diesel");
        Esportivo esportivo = new Esportivo("Gasolina");

        System.out.println(caminhao.combustivel());
        System.out.println(esportivo.combustivel());
    }
}
