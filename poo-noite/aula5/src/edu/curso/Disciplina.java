package edu.curso;

public class Disciplina {
    private String nome;
    private Professor prof;
    private int qtdAulas;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getProf() {
        return prof;
    }
    public void setProf(Professor valor){
        this.prof = valor;
    }

    public int getQtdAulas() {
        return qtdAulas;
    }
    public void setQtdAulas(int qtdAulas) {
        this.qtdAulas = qtdAulas;
    }
}
