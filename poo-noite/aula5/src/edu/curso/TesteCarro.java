package edu.curso;

public class TesteCarro {
    public static void main(String[] args) {
        Carro c1 = new Carro();

        Roda r = c1.getR1();

        Roda r2 = new Roda();
        r2.setFabricante("Michelin");
        c1.setR1(r2);

        c1.getPotencia();
    }
}
