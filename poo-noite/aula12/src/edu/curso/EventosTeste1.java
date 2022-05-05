package edu.curso;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

//class ManipuladoraTeclas implements EventHandler<KeyEvent> {
//    @Override
//    public void handle(KeyEvent event) {
////        System.out.printf("Tipo: %s   Source: %s   Target: %s%n",
////                event.getEventType(),
////                event.getSource().getClass().getName(),
////                event.getTarget().getClass().getName() );
//        if (event.isAltDown() && event.getCode() == KeyCode.F) {
//            System.out.println("Ola.. você apertou <ALT> + <F>");
//        } else {
//            System.out.print(event.getText());
//        }
//    }
//}

class ManipuladoraBotao implements EventHandler<ActionEvent> {

    @Override
    public void handle(ActionEvent event) {
        System.out.println("Olá o botão foi pressionado");
    }
}

public class EventosTeste1 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        BorderPane panPrincipal = new BorderPane();
        Scene scn = new Scene(panPrincipal, 400, 200);

        // ManipuladoraTeclas m = new ManipuladoraTeclas();
        // stage.addEventFilter(KeyEvent.ANY, m);
        ManipuladoraBotao b = new ManipuladoraBotao();

        Button btn = new Button("Me aperte");
        panPrincipal.setBottom(btn);

        btn.addEventFilter(ActionEvent.ANY, b);

        stage.setScene(scn);
        stage.setTitle("Teste de eventos");
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(EventosTeste1.class, args);
    }
}
