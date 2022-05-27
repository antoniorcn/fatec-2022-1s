package edu.curso;

import java.time.LocalDate;

public class Evento {
    private String nome = "";
    private LocalDate data = LocalDate.now();

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
}
