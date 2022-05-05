package edu.curso;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Calculadora extends Application {
    private String[] nomesBotoes = {    "1", "2", "3", "+",
                                        "4", "5", "6", "-",
                                        "7", "8", "9", "*",
                                        ".", "0", "=", "/"    };
    @Override
    public void start(Stage stage) throws Exception {
        BorderPane panPrincipal = new BorderPane();
//        panPrincipal.setBackground(
//                new Background(
//                        new BackgroundFill(Color.WHITE,
//                                           CornerRadii.EMPTY,
//                                           Insets.EMPTY)));
        TilePane panBotoes = new TilePane();
        panBotoes.setPrefColumns(4);
        panBotoes.setPrefWidth(Double.MAX_VALUE);
        GridPane panDisplay = new GridPane();

        panPrincipal.setCenter(panBotoes);
        panPrincipal.setTop(panDisplay);
        panPrincipal.setStyle("-fx-background-color: aqua;");

        Button btnCE = new Button("CE");
        TextField txtDisplay = new TextField();
        txtDisplay.setPrefHeight(50);
        txtDisplay.setPrefWidth(Double.MAX_VALUE);
        panDisplay.setMaxWidth(Double.MAX_VALUE);
        panDisplay.add(txtDisplay, 0, 0, 5, 1);
        panDisplay.add(btnCE, 5, 0);

        Scene scn = new Scene(panPrincipal, 400, 500);

        for (int i = 0; i < 16; i++) {
            String nome = nomesBotoes[i];
            Button btn = new Button(nome);
            btn.setPrefWidth(90);
            btn.setPrefHeight(110);
            btn.setFont(Font.font(28));
            panBotoes.getChildren().add(btn);
        }

        stage.setScene(scn);
        stage.setTitle("Calculadora");
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(Calculadora.class, args);
    }
}
