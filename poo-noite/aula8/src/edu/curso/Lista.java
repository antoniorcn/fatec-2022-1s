package edu.curso;

public class Lista {

    private String[] vetor = new String[1000];
    private int index = 0;

    public void adicionar(String elemento) {
        this.vetor[this.index] = elemento;
        this.index++;
    }

    public int procurar(String texto) {
        for (int i = 0; i < vetor.length; i++) {
            if (texto.equals(this.vetor[i])) {
                return i;
            }
        }
        return -1;
    }
}
