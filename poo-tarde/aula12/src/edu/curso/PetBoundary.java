package edu.curso;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class PetBoundary extends Application {

    private Label lblNome = new Label("Nome");
    private Label lblRaca = new Label("Raça");
    private TextField txtNome = new TextField();
    private TextField txtRaca = new TextField();
    private Button btnAdicionar = new Button("Adicionar");
    private Button btnPesquisar = new Button("Pesquisar");

    private Pet[] array = new Pet[100];
    private int petIndex = 0;

    @Override
    public void start(Stage stage) throws Exception {
        GridPane grid = new GridPane();
        Scene scn = new Scene(grid, 600, 200);
        grid.add(lblNome, 0, 0);
        grid.add(txtNome, 1, 0);
        grid.add(lblRaca, 0, 1);
        grid.add(txtRaca, 1, 1);
        grid.add(btnAdicionar, 0, 2);
        grid.add(btnPesquisar, 1, 2);

        btnAdicionar.setOnAction( (e) -> {
            Pet p = new Pet();
            p.setNome(txtNome.getText());
            p.setRaca(txtRaca.getText());

            array[petIndex++] = p;
        });

        btnPesquisar.setOnAction( (e) -> {
            for (int i = 0; i < petIndex; i++) {
                Pet p = array[i];
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
