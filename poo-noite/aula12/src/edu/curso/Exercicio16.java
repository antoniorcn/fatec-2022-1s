package edu.curso;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

class ManipuladoraLabel implements EventHandler<ActionEvent> {
    private Label lblTexto;
//    public ManipuladoraLabel(Label lbl) {
//        lblTexto = lbl;
//    }
    @Override
    public void handle(ActionEvent event) {
        System.out.println("Hello World");
        lblTexto.setText("Hello World");
    }
    public void setLblTexto(Label lblTexto) {
        this.lblTexto = lblTexto;
    }
}
public class Exercicio16 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        BorderPane panPrincipal = new BorderPane();
        Scene scn = new Scene(panPrincipal, 400, 200);

        Label lblTexto = new Label("Texto");
        panPrincipal.setTop(lblTexto);

        Button btn = new Button("Ok");
        panPrincipal.setBottom(btn);

        ManipuladoraLabel ml = new ManipuladoraLabel();
        ml.setLblTexto(lblTexto);
        btn.addEventHandler(ActionEvent.ANY, ml);
        stage.setScene(scn);
        stage.setTitle("Teste de eventos");
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(Exercicio16.class, args);
    }
}