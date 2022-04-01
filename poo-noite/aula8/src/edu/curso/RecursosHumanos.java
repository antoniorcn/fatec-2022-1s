package edu.curso;

public class RecursosHumanos {

    public void pagar(Funcionario f, double valor) {
        f.salario = valor;
        System.out.printf("Foi pago %6.2f para o funcionario %s%n",
                f.salario, f.nome);
        f.receber();
    }


    public void pagar(Funcionario f, double valor, double vr) {
        f.salario = valor;
        System.out.printf("Foi pago %6.2f de salario mais %6.2f de " +
                        "vale refeição para o funcionario %s%n",
                valor, vr, f.nome);
        f.receber();
    }

}
