package edu.curso;

public class PetControl {

    private Pet[] lista = new Pet[100];
    private int indice = 0;

    public void adicionar(Pet p) {
        lista[indice++] = p;
    }

    public Pet pesquisar(String nome) {
        for (int i = 0; i < indice; i++) {
            Pet p = lista[i];
            if (p != null
                    && p.getNome() != null
                    && p.getNome().contains(nome)) {
                return p;
            }
        }
        return new Pet();
    }

}
