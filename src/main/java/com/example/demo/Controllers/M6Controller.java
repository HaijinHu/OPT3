package com.example.demo.Controllers;

import com.example.demo.ADDmethode.ADD;
import com.example.demo.ADDmethode.ADDaccount;
import com.example.demo.Switches.Switch2;
import com.example.demo.ToonErvaring;
import com.example.demo.objecten.Ervaring;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class M6Controller implements Initializable {
    @FXML
    private Label loginmessage;
    @FXML
    private ComboBox<String> ervaringlijst;
    public void switchToScene0(ActionEvent event) throws IOException {
        Switch2 S = new Switch2();
        S.switchToScene2(event);
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ADD ad = new ADDaccount();
        ad.AD(ervaringlijst);
    }
    public void toonervaring(){
        String Naam = ervaringlijst.getValue();
        ToonErvaring.toonrevaring(Naam);
        loginmessage.setText(ToonErvaring.loginmessage);
    }
}
