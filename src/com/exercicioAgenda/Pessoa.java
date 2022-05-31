package com.exercicioAgenda;

public class Pessoa {

        private int codigo;
        private int idade;
        private int telefone;

        public Pessoa() {

        }

        public int getCodigo() {
            return codigo;
        }

        public void setCodigo(int codigo) {
            this.codigo = codigo;
        }

        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "codigo=" + codigo +
                ", idade=" + idade +
                ", telefone=" + telefone +
                '}';
    }
}
