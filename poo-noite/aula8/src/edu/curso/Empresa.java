package edu.curso;

public class Empresa {
    public static void main(String[] args) {
        RecursosHumanos rh = new RecursosHumanos();

        Funcionario f1 = new Funcionario("João Silva");

        Funcionario f2 = new Funcionario("Maria Silva");

        Funcionario f3 = new Funcionario("Robson Silva");

        Gerente g1 = new Gerente ("Lucy Silva");

        rh.pagar(f1, 2500.0);
        rh.pagar(f2, 3000.0);
        rh.pagar(f3, 3000.0, 500.0);
        rh.pagar(g1, 5000.0, 700.0);


    }
}
