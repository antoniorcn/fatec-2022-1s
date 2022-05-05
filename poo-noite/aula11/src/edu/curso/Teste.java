package edu.curso;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Teste extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        // TilePane painel = new TilePane();
//        BorderPane painel = new BorderPane();
        // painel.setHgap(20);
        // painel.setVgap(10);

        GridPane painel = new GridPane();
        Scene scn = new Scene(painel, 600, 400);
        stage.setScene(scn);
        TextArea txtDescricao = new TextArea();
        Label lblNome = new Label("Nome completo: ");
        lblNome.setStyle("-fx-text-fill: yellow; " +
                "-fx-background-color: red;" +
                "-fx-font-size:32;");
//        lblNome.relocate(20, 200);
        TextField txtNome = new TextField("");
        txtNome.setStyle("-fx-border-width: 2;" +
                "-fx-border-color: red;" +
                "-fx-border-radius: 20;");
        txtNome.setBorder(Border.EMPTY);
//        txtNome.relocate(400, 200);
        Button btnGravar = new Button("Gravar");
        Button btnAdicionar = new Button("Adicionar");
//        btnGravar.relocate(300, 300);
//        painel.getChildren().addAll( lblNome, txtNome, btnGravar );
        // painel.setTop(lblNome);
        // painel.setRight(txtNome);
        FlowPane flowPane = new FlowPane();
        flowPane.getChildren().addAll(btnAdicionar, btnGravar);
        // painel.setBottom(flowPane);
        // painel.setCenter(txtDescricao);

        painel.add(lblNome, 0, 0);
        painel.add(txtNome, 1, 0);
        painel.add(flowPane, 0, 1, 2, 1);
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(Teste.class, args);
    }
}
