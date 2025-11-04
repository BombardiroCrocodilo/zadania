package com.example.formularzrejestracjipk;
//zrobiłem w tym samym projekcie przepraszam za moje lenistwo

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class KalkulatorWalut extends Application {

@Override
public void start(Stage s) {
    GridPane gp = new GridPane();

    Label l1 = new Label("Kwota");
    TextField tf = new TextField();
    Label l2 = new Label("Z");
    ComboBox c1 = new ComboBox();
    c1.getItems().addAll("PLN","USD","EUR");
    Label l3 = new Label("Na");
    ComboBox c2 = new ComboBox();
    c2.getItems().addAll("PLN","USD","EUR");
    Button b = new Button("Przelicz");
    Label wynik = new Label("");

    gp.add(l1,0,0);
    gp.add(tf,1,0);
    gp.add(l2,0,1);
    gp.add(c1,1,1);
    gp.add(l3,0,2);
    gp.add(c2,1,2);
    gp.add(b,0,3);
    gp.add(wynik,1,3);

    b.setOnAction(e->{
        wynik.setText("Przeliczono: "+tf.getText()+" "+c2.getValue());
    });

    s.setScene(new Scene(gp,300,150));
    s.setTitle("Kalkulator");
    s.show();
}

public static void main(String[] args){
    launch(args);
}

}
