package edu.curso;

public class BolaBasquete implements Pingavel, Escorrivel {
    @Override
    public void pingar(int altura) {
        System.out.println("Pingando na quadra");
    }

    @Override
    public void escorrer() {
        System.out.println("Escorrendo para debaixo da arquibancada");
    }
}
