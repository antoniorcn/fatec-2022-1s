package edu.curso;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Exercicio16Parte2 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        BorderPane panPrincipal = new BorderPane();
        Scene scn = new Scene(panPrincipal, 400, 200);

        Label lblTexto = new Label("Texto");
        panPrincipal.setTop(lblTexto);

        Button btn = new Button("Ok");
        panPrincipal.setBottom(btn);

//        btn.addEventHandler(ActionEvent.ANY,
//                new EventHandler<ActionEvent>(){
//                    public void handle(ActionEvent e) {
//                        System.out.println("Implementação dentro do botão");
//                        lblTexto.setText("Hello World");
//                    }
//                });

//        btn.setOnAction(new EventHandler<ActionEvent>(){
//            @Override
//            public void handle(ActionEvent event) {
//                lblTexto.setText("Hello World 2");
//            }
//        });

//        btn.setOnAction((e) -> {
//           lblTexto.setText("Hello World com Lambda Function");
//        });

        btn.setOnAction(
                e -> lblTexto.setText("Hello World com Lambda Function")
        );

        stage.setScene(scn);
        stage.setTitle("Teste de eventos");
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(Exercicio16Parte2.class, args);
    }
}