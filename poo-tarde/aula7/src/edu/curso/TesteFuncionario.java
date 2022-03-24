package edu.curso;

public class TesteFuncionario {
    public static void main(String[] args) {
        FolhaPagamento fp = new FolhaPagamento();

        Gerente jose = new Gerente();

        fp.fazPagamento(jose);
    }
}
