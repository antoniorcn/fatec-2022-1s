package edu.curso;

public class Gerente extends Funcionario {

    public Gerente(String nome) {
        super(nome);
    }

    @Override
    public void receber() {
        this.salario *= 1.20;
        System.out.printf("Recebi %6.2f reais de salario, " +
                        "quantia aceitável por enquanto%n",
                this.salario);
    }
}
