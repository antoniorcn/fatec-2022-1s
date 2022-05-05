package edu.curso;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class Calculadora extends Application {
    private String[] nomesBotoes = {
            "1", "2", "3", "+",
            "4", "5", "6", "-",
            "7", "8", "9", "*",
            ".", "0", "=", "/"};
    @Override
    public void start(Stage stage) throws Exception {
        BorderPane principal = new BorderPane();
        Scene scn = new Scene(principal, 500, 600);
        FlowPane panDisplay = new FlowPane();
        panDisplay.setVgap(5);
        panDisplay.setHgap(5);
        panDisplay.setPadding(new Insets(5));
        TextField txtDisplay = new TextField();
        txtDisplay.setPrefWidth(430);
        txtDisplay.setPrefHeight(50);
        Button btnCE = new Button("CE");
        panDisplay.getChildren().addAll(txtDisplay, btnCE);
        principal.setTop(panDisplay);

        TilePane painelBotoes = new TilePane();
        painelBotoes.setPrefColumns(4);
        painelBotoes.setVgap(5);
        painelBotoes.setHgap(5);
        painelBotoes.setStyle("-fx-pref-tile-width: 7.7em; " +
                "-fx-pref-tile-height: 7.7em;");
        painelBotoes.setPadding(new Insets(5.0));
        principal.setCenter(painelBotoes);


        for (int i = 0; i < 16; i++) {
            String nome = nomesBotoes[i];
            Button btn1 = new Button(nome);
            btn1.setPrefHeight(Double.MAX_VALUE);
            btn1.setPrefWidth(Double.MAX_VALUE);
            painelBotoes.getChildren().add(btn1);
        }

        stage.setScene(scn);
        stage.setTitle("Calculadora");
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(Calculadora.class, args);
    }
}
