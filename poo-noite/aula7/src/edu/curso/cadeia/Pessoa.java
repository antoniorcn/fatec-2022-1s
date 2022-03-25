package edu.curso.cadeia;

public class Pessoa extends Animal {
    String nome;
    public Pessoa(String n) {
        super();
        this.nome = n;
        System.out.println("Criando pessoa....");
    }

    public Pessoa() {
        this("SemNome");
    }
}
