package com.example.scenedemo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root,800,600,Color.LIGHTSKYBLUE);

        //add text line in the scene
        Text text = new Text();
        text.setText("Ami tumake valobashi");
        text.setX(50);
        text.setY(50);
        text.setFont(Font.font("Verdana",50));
        text.setFill(Color.GREEN);
        //adding the text line to the root
        root.getChildren().add(text);

        //adding straight line
        Line line = new Line();
        line.setStartX(200);
        line.setStartY(200);
        line.setEndX(500);
        line.setEndY(200);
        line.setStrokeWidth(5);
        line.setStroke(Color.RED);
        line.setOpacity(0.3);
        line.setRotate(45);
        root.getChildren().add(line);

        Rectangle rect = new Rectangle();
        rect.setY(100);
        rect.setX(100);
        rect.setWidth(100);
        rect.setHeight(100);
        rect.setFill(Color.BLUE);
        rect.setStrokeWidth(5);
        rect.setStroke(Color.BLACK);
        rect.setRotate(85);
        root.getChildren().add(rect);

        Polygon triangle = new Polygon();
        //to draw a trangle you have to show the points
        triangle.getPoints().setAll(
                200.0,200.0,
                300.0,300.0,
                200.0,300.0
        );
        triangle.setFill(Color.YELLOW);
        root.getChildren().add(triangle);

        Circle circle = new Circle();
        circle.setCenterX(350);
        circle.setCenterY(350);
        circle.setRadius(50);
        circle.setFill(Color.ORANGE);
        root.getChildren().add(circle);

        Image image2 = new Image("ff.jpg");
        ImageView imageView = new ImageView(image2);
        imageView.setX(400);
        imageView.setY(400);
        imageView.setFitHeight(200.0);
        imageView.setFitWidth(200.0);
        root.getChildren().add(imageView);


        Image image = new Image("download (1).jpg");
        stage.getIcons().add(image);
        stage.setScene(scene);
        stage.show();
    }
}