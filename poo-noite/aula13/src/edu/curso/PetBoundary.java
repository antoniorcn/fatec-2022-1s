package edu.curso;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class PetBoundary extends Application {
    private TextField txtNome = new TextField();
    private TextField txtRaca = new TextField();
    private TextField txtPeso = new TextField();

    private Button btnAdicionar = new Button("Adicionar");
    private Button btnPesquisar = new Button("Pesquisar");

    private PetControl control = new PetControl();

    public Pet boundaryToEntity() {
        Pet p = new Pet();
        p.setNome(txtNome.getText());
        p.setRaca(txtRaca.getText());
        try {
            p.setPeso(Double.parseDouble(txtPeso.getText()));
        } catch(NumberFormatException e) {
            new Alert(Alert.AlertType.ERROR, "Valor do peso incorreto").show();
        }
        return p;
    }

    public void entityToBoundary(Pet p) {
        if (p != null) {
            txtNome.setText(p.getNome());
            txtRaca.setText(p.getRaca());
            txtPeso.setText(String.valueOf(p.getPeso()));
        }
    }

    @Override
    public void start(Stage stage) throws Exception {
        GridPane pane = new GridPane();
        Scene scn = new Scene(pane, 400, 200);

        pane.add(new Label("Nome"), 0, 0);
        pane.add(txtNome, 1, 0);
        pane.add(new Label("Raca"), 0, 1);
        pane.add(txtRaca, 1, 1);
        pane.add(new Label("Peso"), 0, 2);
        pane.add(txtPeso, 1, 2);
        pane.add(btnAdicionar, 0, 3);
        pane.add(btnPesquisar, 1, 3);
        String estiloTextField = "-fx-background-color: lightcyan; " +
                "-fx-border-color: red;" +
                "-fx-border-width: 2px;";
        txtNome.setStyle(estiloTextField);
        txtRaca.setStyle(estiloTextField);
        txtPeso.setStyle(estiloTextField);

        btnAdicionar.setOnAction((e) -> {
            Pet p = boundaryToEntity();
            control.adicionar(p);
            new Alert(Alert.AlertType.INFORMATION,
                    "Pet adicionado com sucesso").show();
            entityToBoundary(new Pet());
        });

        btnPesquisar.setOnAction((e) -> {
            Pet p = control.pesquisar(txtNome.getText());
            entityToBoundary(p);
        });

        stage.setScene(scn);
        stage.setTitle("Gestão de Pets");
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(PetBoundary.class, args);
    }
}
