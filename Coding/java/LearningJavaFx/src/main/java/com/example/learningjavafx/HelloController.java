package com.example.learningjavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.nio.channels.Pipe;

public class HelloController {

    @FXML
    private Circle myCircle;
    private double x;
    private double y;
    private final int mv = 5;
    @FXML
    private Button logoutButton;
    @FXML
    private AnchorPane scenePane;
    @FXML
    Stage stage;




    public void up(ActionEvent e){
        myCircle.setCenterY(y-=mv);
    }
    public void down(ActionEvent e){
        myCircle.setCenterY(y+=mv);
    }
    public void left(ActionEvent e){
        myCircle.setCenterX(x-=mv);
    }
    public void right(ActionEvent e){
        myCircle.setCenterX(x+=mv);
    }

    public void logout(ActionEvent e){
        stage = (Stage) scenePane.getScene().getWindow();
        stage.close();
    }
}