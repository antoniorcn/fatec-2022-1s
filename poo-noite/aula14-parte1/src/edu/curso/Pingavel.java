package edu.curso;

public interface Pingavel {
    int altura = 100;

    void pingar(int altura);

    default String tipoParaTexto(int tipo) {
        if (tipo == 1) {
            return "formato de pingo";
        } else {
            return "formato esferico";
        }
    }
}
