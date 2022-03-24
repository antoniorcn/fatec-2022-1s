package edu.curso;

public class Funcionario {
    private double salarioBase = 1000.0;
    private double beneficios = 200.0;

    public double calcularSalario() {
        return salarioBase + beneficios;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getBeneficios() {
        return beneficios;
    }
    public void setBeneficios(double beneficios) {
        this.beneficios = beneficios;
    }
}
