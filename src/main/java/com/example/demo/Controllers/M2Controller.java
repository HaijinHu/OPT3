package com.example.demo.Controllers;
// Voeg mensen toe tot training
import com.example.demo.ADDmethode.ADD;
import com.example.demo.ADDmethode.ADDaccount;
import com.example.demo.ADDmethode.ADDtraining;
import com.example.demo.Switches.Switch;
import com.example.demo.Switches.Switch2;
import com.example.demo.Switches.SwitchM5;
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
        String trainingFileName = "C:\\Users\\haiji\\IdeaProjects\\demo\\TrainingLedenLijst\\"+ trainingLijst.getValue();
        String atleet = accountlijst.getValue();
        File trainingFile = new File(trainingFileName);
        System.out.println(trainingFile);

        if (!trainingFile.exists()) {
            trainingFile.createNewFile();
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(trainingFile, true))) {
            writer.write(atleet);
            writer.newLine();
            loginmessage.setText("De atleet " + atleet + " is toegevoegd tot de training.");
        } catch (IOException ee) {
            loginmessage.setText("Er is een fout opgetreden.");
        }
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