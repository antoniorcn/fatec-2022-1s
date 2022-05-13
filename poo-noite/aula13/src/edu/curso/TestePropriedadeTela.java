package edu.curso;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class TestePropriedadeTela extends Application {
    private StringProperty nome = new SimpleStringProperty("");
    @Override
    public void start(Stage stage) throws Exception {
        FlowPane pane = new FlowPane();
        Scene scn = new Scene(pane, 400, 200);

        TextField txtNome = new TextField();

        Label lblTeste = new Label("");

        Bindings.bindBidirectional(txtNome.textProperty(), nome);
        Bindings.bindBidirectional(nome, lblTeste.textProperty());
        Bindings.bindBidirectional(txtNome.textProperty(), lblTeste.styleProperty());

        nome.set("Rex");

        Button btn = new Button("Mostrar");
        btn.setOnAction((e) -> {
            System.out.println("Nome Atual: " + nome.get());
        });

        pane.getChildren().addAll(
            new Label("Nome: "),
            txtNome,
            btn,
                lblTeste
        );

        stage.setScene(scn);
        stage.setTitle("Teste Propriedade Tela");
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(TestePropriedadeTela.class, args);
    }
}
