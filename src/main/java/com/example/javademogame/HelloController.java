package com.example.javademogame;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {

    private int buttonValue = 0;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label mainLabel;

    @FXML
    private Button pressButton;
  

    @FXML
    void btnClick(ActionEvent event) {
        mainLabel.setText("<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3");

    }

    @FXML
    void initialize() {
        assert mainLabel != null : "fx:id=\"mainLabel\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert pressButton != null : "fx:id=\"pressButton\" was not injected: check your FXML file 'hello-view.fxml'.";

    }

}

