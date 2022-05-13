package edu.curso;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class TestePropriedade {

    public static void main(String[] args) {

        StringProperty nome = new SimpleStringProperty("");
        nome.set("Toto");
        System.out.println( "Nome : " + nome.get());

        nome.addListener((prop, valorAntigo, valorNovo)-> {
            System.out.printf("Nome foi trocado de %s para %s\n",
                    valorAntigo, valorNovo);
        });

        nome.set("Fifi");
        nome.set("Rex");

    }
}
