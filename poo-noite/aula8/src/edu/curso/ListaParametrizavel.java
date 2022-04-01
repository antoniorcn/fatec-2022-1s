package edu.curso;

public class ListaParametrizavel<T> {
    private Object[] vetor = new Object[1000];
    private int index = 0;

    public void adicionar(T elemento) {
        this.vetor[this.index] = elemento;
        this.index++;
    }

    public int procurar(T texto) {
        for (int i = 0; i < vetor.length; i++) {
            if (texto.equals(this.vetor[i])) {
                return i;
            }
        }
        return -1;
    }
}
