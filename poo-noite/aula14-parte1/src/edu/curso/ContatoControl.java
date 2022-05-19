package edu.curso;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class ContatoControl {
    private Contato[] contatos = new Contato[100];
    private int index = 0;

    private StringProperty nome = new SimpleStringProperty();
    private StringProperty telefone = new SimpleStringProperty();

    public StringProperty nomeProperty() {
        return nome;
    }
    public StringProperty telefoneProperty() {
        return telefone;
    }

    public void adicionar() {
        System.out.println("Nome: " + nome.get());
        System.out.println("Telefone: " + telefone.get());

        Contato c = new Contato();
        c.setNome(nome.get());
        c.setTelefone(telefone.get());

        contatos[index] = c;
        index++;
    }

    public void pesquisar() {
        for (int i = 0; i < index; i++) {
            Contato c = contatos[i];
            if (c != null && c.getNome().contains(nome.get())) {
                nome.set(c.getNome());
                telefone.set(c.getTelefone());
            }
        }
    }
}
