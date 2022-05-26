package edu.curso;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.List;

public class ContatoControl {
    private ObservableList<Contato> contatos = FXCollections.observableArrayList();
    private ContatoDAO dao = new ContatoDAOImpl();
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
        dao.cadastrar(c);
        contatos.add(c);
    }

    public void pesquisar() {
        /* for (int i = 0; i < contatos.size(); i++) {
            Contato c = contatos.get(i);
            if (c != null && c.getNome().contains(nome.get())) {
                nome.set(c.getNome());
                telefone.set(c.getTelefone());
            }
        } */
        List<Contato> encontrados = dao.consultar(nome.get());
        contatos.clear();
        contatos.addAll(encontrados);

    }

    public ObservableList<Contato> getContatos() {
        return contatos;
    }
}
