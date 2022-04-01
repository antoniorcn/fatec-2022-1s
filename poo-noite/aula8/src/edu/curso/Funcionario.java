package edu.curso;

public class Funcionario {

    String nome;
    double salario;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public void receber() {
        this.salario *= 1.10;
        System.out.printf("Oba recebi %6.2f reais de salario%n",
                this.salario);

    }


}
