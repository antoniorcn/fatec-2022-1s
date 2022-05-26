package edu.curso;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ContatoBoundary extends Application {
    private TextField txtNome = new TextField();
    private TextField txtTelefone = new TextField();
    private Button btnAdicionar = new Button("Adicionar");
    private Button btnPesquisar = new Button("Pesquisar");
    private ContatoControl control = new ContatoControl();
    private TableView<Contato> table = new TableView<>();

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane principal = new BorderPane();
        GridPane grid = new GridPane();
        principal.setTop(grid);
        principal.setCenter(table);
        Scene scn = new Scene(principal, 400, 200);

        grid.add(new Label("Nome: "), 0, 0);
        grid.add(txtNome, 1,0);
        grid.add(new Label("Telefone: "), 0, 1);
        grid.add(txtTelefone, 1, 1);
        grid.add(btnAdicionar, 0, 2);
        grid.add(btnPesquisar, 1, 2);

        Bindings.bindBidirectional(control.nomeProperty(), txtNome.textProperty());
        Bindings.bindBidirectional(control.telefoneProperty(), txtTelefone.textProperty());
        TableColumn<Contato, String> col1 = new TableColumn<>("Nome");
        col1.setCellValueFactory(new PropertyValueFactory<>("nome"));

        TableColumn<Contato, String> col2 = new TableColumn<>("Telefone");
        col2.setCellValueFactory(new PropertyValueFactory<>("telefone"));

        table.getColumns().addAll(col1, col2);

        table.setItems(control.getContatos());

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
