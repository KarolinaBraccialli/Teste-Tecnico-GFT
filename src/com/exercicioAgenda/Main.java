package com.exercicioAgenda;

public class Main {
    public static void main(String[] args) {
        Agenda novaAgenda = new Agenda();

      novaAgenda.inserirPessoa(001, 35, 12345678);
//        novaAgenda.inserirPessoa(002, 30, 12345678);
//        novaAgenda.inserirPessoa(003, 45, 12345678);

        novaAgenda.removerPessoa(003);
        //novaAgenda.editarPessoa(001, 40, 654321);
        novaAgenda.imprimeAgenda();
    }
}
