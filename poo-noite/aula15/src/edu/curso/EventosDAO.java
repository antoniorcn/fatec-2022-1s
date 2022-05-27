package edu.curso;

import java.util.List;

public interface EventosDAO {
    void inserir(Evento e);
    List<Evento> consultar(String nome);
}
