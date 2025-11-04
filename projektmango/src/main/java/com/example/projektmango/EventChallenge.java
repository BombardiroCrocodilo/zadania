package com.example.projektmango;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;

public class EventChallenge extends Application {
    public  EventChallenge(){}
    @Override
    public void start(Stage primaryStage) {

        Circle circle = new Circle();
        circle.setCenterY(200);
        circle.setCenterX(200);
        circle.setRadius(15);
        circle.setFill(Color.TRANSPARENT);
        circle.setStroke(Color.BLACK);
        circle.setStrokeWidth(1);
        Pane root = new Pane();
        Scene scene = new Scene(root, 400, 400);
        root.getChildren().add(circle);
        Paint niebieski = Paint.valueOf("blue");
        Paint czarny = Paint.valueOf("black");



        scene.setOnKeyPressed(event -> {
            switch (event.getCode()) {
                case UP:    circle.setCenterY(circle.getCenterY() - 10); break;
                case DOWN:  circle.setCenterY(circle.getCenterY() + 10); break;
                case LEFT:  circle.setCenterX(circle.getCenterX() - 10); break;
                case RIGHT: circle.setCenterX(circle.getCenterX() + 10); break;
                case ENTER:
                case PLUS:  circle.setRadius(circle.getRadius() + 5); break;
                case BACK_SPACE:
                case MINUS:
                    double newRadius = circle.getRadius() - 5;
                    if (newRadius > 0) circle.setRadius(newRadius);
                    break;
            }
        });
        circle.setOnMouseEntered(e ->{
            circle.setStroke(niebieski);
            circle.setStrokeWidth(3);
        });
        circle.setOnMouseExited(e ->{
            circle.setStroke(czarny);
            circle.setStrokeWidth(1);
        });

        primaryStage.setTitle("Prosty Sterownik Kształtu");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}