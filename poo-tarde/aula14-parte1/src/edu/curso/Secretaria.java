package edu.curso;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class Secretaria implements ChangeListener<String> {

    public void alunoTrocandoEmail(String novoEmail) {
        System.out.println("Aluno trocou o email para ==> " + novoEmail);
    }

    @Override
    public void changed(ObservableValue<? extends String> observable,
                        String oldValue, String newValue) {
        alunoTrocandoEmail(newValue);
    }
}
