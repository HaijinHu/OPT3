package com.example.demo.Controllers;
// Voeg mensen toe tot training
import com.example.demo.ADDmethode.ADD;
import com.example.demo.ADDmethode.ADDaccount;
import com.example.demo.ADDmethode.ADDtraining;
import com.example.demo.Switches.Switch;
import com.example.demo.Switches.Switch2;
import com.example.demo.Switches.SwitchM5;
import com.example.demo.VoegAccountToe;
import com.example.demo.objecten.Training;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;

public class M2Controller implements Initializable {
    @FXML
    private ComboBox<String> trainingLijst;
    @FXML
    private ComboBox<String> accountlijst;
    @FXML
    private Label loginmessage;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ADD ad = new ADDaccount();
        ad.AD(accountlijst);
        ad = new ADDtraining();
        ad.AD(trainingLijst);

    }
    public void voegtoe() throws IOException {
        VoegAccountToe.voegtoe(loginmessage, accountlijst,trainingLijst);

    }

    public void switchToScene0(ActionEvent event) throws IOException {
        Switch2 S = new Switch2();
        S.switchToScene2(event);
    }
    public void switchToSceneM5(ActionEvent event) throws IOException {
        Switch S = new SwitchM5();
        S.switchToScene(event);
    }
}