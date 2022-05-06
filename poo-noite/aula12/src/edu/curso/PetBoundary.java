package edu.curso;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class PetBoundary extends Application {
    private Label lblNome = new Label("Nome do Pet");
    private TextField txtNome = new TextField();
    private Label lblRaca = new Label("Raça");
    private TextField txtRaca = new TextField();
    private Button btnAdicionar = new Button("Adicionar");
    private Button btnPesquisar = new Button("Pesquisar");

    private Pet[] lista = new Pet[100];
    private int indicePet = 0;

    @Override
    public void start(Stage stage) throws Exception {
        GridPane panGrid = new GridPane();
        Scene scn = new Scene(panGrid, 400, 200);

        panGrid.add(lblNome, 0, 0);
        panGrid.add(txtNome, 1, 0);
        panGrid.add(lblRaca, 0, 1);
        panGrid.add(txtRaca, 1, 1);
        panGrid.add(btnAdicionar, 0, 2);
        panGrid.add(btnPesquisar, 1, 2);

        btnAdicionar.setOnAction( e -> {
            Pet p = new Pet();
            p.setNome(txtNome.getText());
            p.setRaca(txtRaca.getText());

            lista[indicePet++] = p;
            txtNome.setText("");
            txtRaca.setText("");
        });

        btnPesquisar.setOnAction( e -> {
            for (int i = 0; i < indicePet; i++) {
                Pet p = lista[i];
                if (p != null && p.getNome().contains(txtNome.getText())) {
                    txtNome.setText(p.getNome());
                    txtRaca.setText(p.getRaca());
                }
            }
        });

        stage.setScene(scn);
        stage.setTitle("Cadastro de Pets");
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(PetBoundary.class, args);
    }
}
