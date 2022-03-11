package edu.curso;

public class Carro {
    private String modelo = "Onyx";
    private Roda r1 = new Roda();
    private Motor m1 = new Motor();

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Roda getR1() {
        return r1;
    }
    public void setR1(Roda r1) {
        this.r1 = r1;
    }

    public double getPotencia() {
        return this.m1.getPotencia();
    }
}
