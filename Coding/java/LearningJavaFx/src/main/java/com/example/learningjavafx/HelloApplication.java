package com.example.learningjavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
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

import java.util.Objects;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        stage.setScene(new Scene(root));

        /*
        Group root = new Group();
        Scene scene = new Scene(root, Color.LIGHTGOLDENRODYELLOW);
        stage.getIcons().add(new Image("icon.png"));
        stage.setTitle("Hello JavaFX");
        stage.setWidth(1200);
        stage.setHeight(800);
        stage.setScene(scene);
        stage.setResizable(false);
        //stage.setX(50);
        //stage.setY(50);
        //stage.setFullScreen(true);
        stage.setFullScreenExitHint("ESC for exit");

        Text text = new Text();
        text.setText("WELCOME TO THE PROJECT0");
        text.setFill(Color.DARKGREEN);
        text.setX(300);
        text.setY(400);
        text.setFont(Font.font("Arial",50));
        root.getChildren().add(text);


        Line line = new Line();
        line.setStartX(0);
        line.setStartY(0);
        line.setEndX(1200);
        line.setEndY(800);
        root.getChildren().add(line);


        Line line2 = new Line();
        line2.setStartX(1200);
        line2.setStartY(0);
        line2.setEndX(0);
        line2.setEndY(800);
        line2.setStrokeWidth(10);
        line2.setStroke(Color.RED);
        line2.setOpacity(0.5);
        line2.setRotate(45);
        root.getChildren().add(line2);


        Rectangle rect = new Rectangle();
        rect.setX(100);
        rect.setY(100);
        rect.setWidth(100);
        rect.setHeight(100);
        rect.setFill(Color.BLUE);
        root.getChildren().add(rect);

        Polygon triangle = new Polygon();
        triangle.getPoints().setAll(
                200.0,200.0,
                300.0,300.0,
                200.0,300.0);
        triangle.setFill(Color.YELLOW);
        root.getChildren().add(triangle);

        Circle circle = new Circle();
        circle.setCenterX(550);
        circle.setCenterY(550);
        circle.setRadius(50);
        circle.setFill(Color.BLUE);
        root.getChildren().add(circle);

        Image img = new Image("icon.png");
        ImageView imgvw = new ImageView(img);
        imgvw.setX(300);
        imgvw.setY(300);
        imgvw.setOpacity(0.3);
        imgvw.setPreserveRatio(true);
        imgvw.setFitHeight(400);
        imgvw.setFitWidth(400);
        root.getChildren().add(imgvw);
         */

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}