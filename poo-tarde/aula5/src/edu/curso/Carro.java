package edu.curso;

public class Carro {

    private String modelo = "";
    private Pneu p1 = new Pneu();
    private Motor m1 = new Motor();

    public String getModelo() {
        return this.modelo;
    }
    public void setModelo(String valor) {
        this.modelo = valor;
    }

    public Pneu getP1() {
        return this.p1;
    }
    public void setP1(Pneu valor) {
        this.p1 = valor;
    }

    public float getPotenciaMotor() {
        return m1.getPotencia();
    }
}
