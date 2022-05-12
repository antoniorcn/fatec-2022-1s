package edu.curso;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PetBoundary extends Application {

    private Label lblNome = new Label("Nome");
    private Label lblRaca = new Label("Raça");
    private TextField txtNome = new TextField();
    private TextField txtRaca = new TextField();
    private TextField txtNascimento = new TextField();
    private Button btnAdicionar = new Button("Adicionar");
    private Button btnPesquisar = new Button("Pesquisar");

    private PetControl control = new PetControl();

    private DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Pet boundaryToEntity() {
        Pet p = new Pet();
        p.setNome(txtNome.getText());
        p.setRaca(txtRaca.getText());
        LocalDate dt = LocalDate.parse(txtNascimento.getText(), fmt);
        p.setNascimento(dt);
        return p;
    }

    public void entityToBoundary(Pet p) {
        txtNome.setText(p.getNome());
        txtRaca.setText(p.getRaca());
        txtNascimento.setText(p.getNascimento().format(fmt));
    }

    @Override
    public void start(Stage stage) throws Exception {
        GridPane grid = new GridPane();
        Scene scn = new Scene(grid, 600, 200);
        grid.add(lblNome, 0, 0);
        grid.add(txtNome, 1, 0);
        grid.add(lblRaca, 0, 1);
        grid.add(txtRaca, 1, 1);
        grid.add(new Label("Nascimento"), 0, 2);
        grid.add(txtNascimento, 1, 2);
        grid.add(btnAdicionar, 0, 3);
        grid.add(btnPesquisar, 1, 3);

        btnAdicionar.setOnAction( (e) -> {
            Pet p = boundaryToEntity();
            control.adicionar(p);
        });

        btnPesquisar.setOnAction( (e) -> {
            Pet p = control.pesquisar(txtNome.getText());
            entityToBoundary(p);
        });

        stage.setScene(scn);
        stage.setTitle("Cadastro de Pets");
        stage.show();
    }


    public static void main(String[] args) {
        Application.launch(PetBoundary.class, args);
    }
}
