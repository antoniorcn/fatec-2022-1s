package edu.curso;

public class PetControl {

    private Pet[] array = new Pet[100];
    private int petIndex = 0;


    public void adicionar(Pet p) {
        array[petIndex++] = p;
    }

    public Pet pesquisar(String nome) {
        for (int i = 0; i < petIndex; i++) {
            Pet p = array[i];
            if (p != null && p.getNome().contains(nome)) {
                return p;
            }
        }
        return null;
    }

}
