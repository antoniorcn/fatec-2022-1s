package edu.curso;

public class Dinossauro {
    private int energia = 50;
    private int velocidade = 5;
    private int temperatura = 30;
    private int humor = 20;



    public void pular() {
        System.out.println("Dinossauro pulando ...");
        this.humor += 5;
        this.energia -= 5;
        this.velocidade -= 5;
    }



    public int getEnergia() {
        return this.energia;
    }
    public void setEnergia(int valor) {
        this.energia = valor;
    }

    public int getVelocidade() {
        return this.velocidade;
    }
    public void setVelocidade(int valor) {
        this.velocidade = valor;
    }

    public int getTemperatura() {
        return this.temperatura;
    }
    public void setTemperatura(int valor) {
        this.temperatura = valor;
    }

    public int getHumor() {
        return this.humor;
    }
    public void setHumor(int valor) {
        this.humor = valor;
    }
}
