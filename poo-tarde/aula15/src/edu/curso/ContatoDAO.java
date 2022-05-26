package edu.curso;

import java.util.List;

public interface ContatoDAO {

    void cadastrar(Contato c);
    List<Contato> consultar(String nome);

}
