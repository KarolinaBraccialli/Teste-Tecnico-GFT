package com.exercicioAgenda;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Agenda {

        private List<Pessoa> agenda = new ArrayList<>(10);
        private String nomeAgenda;

        public List<Pessoa> getAgenda() {
            return agenda;
        }

        public void setAgenda(List<Pessoa> agenda) {
            this.agenda = agenda;
        }

        public String getNomeAgenda() {
            return nomeAgenda;
        }

        public void setNomeAgenda(String nomeAgenda) {
            this.nomeAgenda = nomeAgenda;
        }

        void inserirPessoa(int codigo, int idade, int telefone) {
            Pessoa contato = new Pessoa();
            contato.setCodigo(codigo);
            contato.setIdade(idade);
            contato.setTelefone(telefone);
            this.agenda.add(contato);
        }

        void editarPessoa(int codigo, int idade, int telefone) {
            int indice = buscarPessoa(codigo);
            if (codigo != -1){
                Pessoa editar = this.agenda.get(indice);
                editar.setIdade(idade);
                editar.setTelefone(telefone);
                this.agenda.set(indice, editar);
            }
        }

    int buscarPessoa(int codigo) {
        for (Pessoa contato : this.agenda) {
            if (Objects.equals(contato.getCodigo(), codigo)) return this.agenda.indexOf(contato);
        }
        return -1;
    }

        void removerPessoa(int codigo) {
            this.agenda.removeIf(contato -> Objects.equals(contato.getCodigo(), codigo));
        }

        void imprimeAgenda() {
            for (Pessoa contato : agenda) {
                System.out.println(contato);
            }
        }

    }
