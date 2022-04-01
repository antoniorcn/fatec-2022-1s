package edu.curso;

public class TesteListaParametrizavel {
    public static void main(String[] args) {

        ListaParametrizavel<Funcionario> lista1 = new ListaParametrizavel<>();

        lista1.adicionar(new Funcionario("João Silva"));
        lista1.adicionar(new Funcionario("Maria Silva"));
        lista1.adicionar(new Funcionario("Lucy Silva"));
        lista1.adicionar(new Funcionario("Jose Silva"));

        int i = lista1.procurar(new Funcionario("Roberto Campos"));
        System.out.println("Indice retornado " + i);
    }
}
