package edu.curso;

public class Gerente extends Funcionario {
    private double bonus = 500.0;

    @Override
    public double calcularSalario() {
        return getSalarioBase() + getBeneficios() + getBonus();
    }

    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
