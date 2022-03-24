package edu.curso;

public class FolhaPagamento {

    public void fazPagamento(Funcionario f) {
        System.out.println("Pagando " + f.calcularSalario() +
                " para o funcionario");
    }
}
