package edu.curso;
import java.time.LocalDate;

public class Aluno {
    private long id;
    private String nome;
    private String ra;
    private LocalDate nascimento;

    public long getId() {
        return this.id;
    }
    public void setId(long value) {
        this.id = value;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRa() {
        return ra;
    }
    public void setRa(String ra) {
        this.ra = ra;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }
    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public String toString() {
        return this.id + " - " + this.ra + ":" + this.nome;
    }
}
