package edu.curso;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

//class Manipuladora implements EventHandler<ActionEvent> {
//    private Label lblComponente;

//    public Manipuladora(Label lblComponente) {
//        this.lblComponente = lblComponente;
//    }


//    @Override
//    public void handle(ActionEvent event) {
//        System.out.println("Ola...");
//        this.lblComponente.setText("Ola ...");
//    }
//
//    public void setComponente(Label lblComponente) {
//        this.lblComponente = lblComponente;
//    }
//}

public class Exercicio17 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        BorderPane bp = new BorderPane();
        Scene scn = new Scene(bp, 600, 400);

        Label lblTeste = new Label("Label do Exercício 17");

        Button btnTeste = new Button("Ok");
        bp.setBottom(btnTeste);
        bp.setTop(lblTeste);

        // Manipuladora man1 = new Manipuladora();
        // man1.setComponente(lblTeste);
        // btnTeste.addEventFilter(ActionEvent.ANY, man1);

//        btnTeste.addEventFilter(ActionEvent.ANY,
//                new EventHandler<ActionEvent>(){
//                    @Override
//                    public void handle(ActionEvent event) {
//                        lblTeste.setText("Ola .... ");
//                    }
//                });

//        btnTeste.addEventFilter(ActionEvent.ANY,(e) -> {
//            lblTeste.setText("Ola .... ");
//        } );

//        btnTeste.addEventFilter(ActionEvent.ANY, e ->
//            lblTeste.setText("Ola .... ")
//        );

        btnTeste.setOnAction( e ->
            lblTeste.setText("Ola ... com setOnAction")
        );

        stage.setScene(scn);
        stage.setTitle("Correção do Exercicio 17");
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(Exercicio17.class, args);
    }
}
