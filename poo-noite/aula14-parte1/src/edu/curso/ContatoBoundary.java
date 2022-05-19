package edu.curso;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ContatoBoundary extends Application {
    private TextField txtNome = new TextField();
    private TextField txtTelefone = new TextField();
    private Button btnAdicionar = new Button("Adicionar");
    private Button btnPesquisar = new Button("Pesquisar");
    private ContatoControl control = new ContatoControl();

    @Override
    public void start(Stage stage) throws Exception {
        GridPane grid = new GridPane();
        Scene scn = new Scene(grid, 400, 200);

        grid.add(new Label("Nome: "), 0, 0);
        grid.add(txtNome, 1,0);
        grid.add(new Label("Telefone: "), 0, 1);
        grid.add(txtTelefone, 1, 1);
        grid.add(btnAdicionar, 0, 2);
        grid.add(btnPesquisar, 1, 2);

        Bindings.bindBidirectional(control.nomeProperty(), txtNome.textProperty());
        Bindings.bindBidirectional(control.telefoneProperty(), txtTelefone.textProperty());

        btnAdicionar.setOnAction((e) -> {
            control.adicionar();
        });

        btnPesquisar.setOnAction( (e) -> {
            control.pesquisar();
        });

        stage.setScene(scn);
        stage.setTitle("Gestão de Contato");
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(ContatoBoundary.class, args);
    }
}
