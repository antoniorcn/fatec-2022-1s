package edu.curso;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Aluno {
    private String nome = "";
    private StringProperty email = new SimpleStringProperty("");

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email.get();
    }
    public void setEmail(String email) {
        this.email.set(email);
    }
    public StringProperty emailProperty() {
        return email;
    }
}
