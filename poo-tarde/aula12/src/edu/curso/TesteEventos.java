package edu.curso;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

class ManipuladoraEventos implements EventHandler<ActionEvent> {
    @Override
    public void handle(ActionEvent event) {
        System.out.printf("Type: %s   Source %s   Target %s%n",
                event.getEventType(),
                event.getSource().getClass().getName(),
                event.getTarget().getClass().getName());
    }
}

public class TesteEventos extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        BorderPane bp = new BorderPane();
        Scene scn = new Scene(bp, 600, 400);

        Button btnTeste = new Button("Teste de Eventos");
        bp.setBottom(btnTeste);

        ManipuladoraEventos man1 = new ManipuladoraEventos();
        btnTeste.addEventFilter(ActionEvent.ANY, man1);

        stage.setScene(scn);
        stage.setTitle("Teste de Eventos");
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(TesteEventos.class, args);
    }
}
