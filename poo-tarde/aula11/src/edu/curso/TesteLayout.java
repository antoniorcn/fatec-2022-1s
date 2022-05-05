package edu.curso;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class TesteLayout extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        // Pane painel = new Pane();
        // FlowPane painel = new FlowPane();
        // TilePane painel = new TilePane();
        BorderPane painel = new BorderPane();
        Scene scn = new Scene(painel, 600, 400);
        Label lblNome = new Label("Nome");
        TextField txtNome = new TextField("");
        Button btnCadastrar = new Button("Cadastrar");
//        btnCadastrar.relocate(250, 320);
//        txtNome.relocate(200, 0);
//        painel.setPrefColumns(3);
//        painel.setHgap(20);
//        painel.setVgap(50);
//        painel.getChildren().addAll(lblNome, txtNome, btnCadastrar);
        painel.setLeft(lblNome);
        painel.setCenter(txtNome);
        painel.setBottom(btnCadastrar);
        stage.setTitle("Teste de Layout");
        stage.setScene(scn);
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(TesteLayout.class, args);
    }
}
