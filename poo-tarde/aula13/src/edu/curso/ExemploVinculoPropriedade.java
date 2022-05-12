package edu.curso;

import com.sun.javafx.binding.BidirectionalBinding;
import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.StringBinding;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ExemploVinculoPropriedade extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        VBox pane = new VBox();
        Scene scn = new Scene(pane, 300, 300);

        TextField text1 = new TextField("");
        TextField text2 = new TextField("");

        StringProperty text3 = new SimpleStringProperty("");

        Button btn = new Button("Mostra Propriedade");
        btn.setOnAction((e) -> {
            System.out.println("Valor da Propriedade 3: " + text3.get());
        });

        pane.getChildren().addAll(
          new Label("Propriedade 1: "),
                text1,
                new Label("Propriedade 2: "),
                text2,
                btn
        );

        Bindings.bindBidirectional(text1.textProperty(), text2.textProperty());
        Bindings.bindBidirectional(text2.textProperty(), text3);

        text3.set("Valor inicial");

        stage.setScene(scn);
        stage.setTitle("Teste de Vinculo de Propriedade");
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(ExemploVinculoPropriedade.class, args);
    }
}
