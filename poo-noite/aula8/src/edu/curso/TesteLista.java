package edu.curso;

public class TesteLista {
    public static void main(String[] args) {

        Lista lista1 = new Lista();

        lista1.adicionar("A");
        lista1.adicionar("B");
        lista1.adicionar("C");
        lista1.adicionar("D");

        int i = lista1.procurar("C");
        System.out.println("Indice retornado " + i);
    }
}
