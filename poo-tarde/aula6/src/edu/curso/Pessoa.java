package edu.curso;

public class Pessoa extends Animal {
    private String nome;
    public Pessoa(String nome) {
        super();
        this.nome = nome;
        System.out.println("Construindo Pessoa " + this.nome);
    }
    public Pessoa() {
        this("Luis");
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
