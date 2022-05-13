package edu.curso;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.control.Alert;

public class PetControl {

    private Pet[] lista = new Pet[100];
    private int indice = 0;
    private StringProperty nome = new SimpleStringProperty("");
    private StringProperty raca = new SimpleStringProperty("");

    public StringProperty nomeProperty() {
        return nome;
    }

    public StringProperty racaProperty() {
        return raca;
    }

    public Pet boundaryToEntity() {
        Pet p = new Pet();
        p.setNome(nome.get());
        p.setRaca(raca.get());
        try {
            // p.setPeso(Double.parseDouble(txtPeso.getText()));
        } catch(NumberFormatException e) {
            new Alert(Alert.AlertType.ERROR, "Valor do peso incorreto").show();
        }
        return p;
    }

    public void entityToBoundary(Pet p) {
        if (p != null) {
            nome.set(p.getNome());
            raca.set(p.getRaca());
            // txtPeso.setText(String.valueOf(p.getPeso()));
        }
    }

    public void adicionar() {
        lista[indice++] = boundaryToEntity();
    }

    public void pesquisar() {
        for (int i = 0; i < indice; i++) {
            Pet p = lista[i];
            if (p != null
                    && p.getNome() != null
                    && p.getNome().contains(nome.get())) {
                entityToBoundary(p);
            }
        }
    }

}
