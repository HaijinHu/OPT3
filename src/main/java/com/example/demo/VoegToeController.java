package com.example.demo;

import com.example.demo.Switches.Switch;
import com.example.demo.Switches.Switch0;
import com.example.demo.objecten.Account;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.*;

public class VoegToeController {
    @FXML
    private javafx.scene.control.TextField AccName;
    @FXML
    private javafx.scene.control.TextField Voornaam;
    @FXML
    private javafx.scene.control.TextField Achternaam;
    @FXML
    private javafx.scene.control.TextField AccWachtwoord;
    @FXML
    private javafx.scene.control.TextField AccEmail;
    @FXML
    private javafx.scene.control.TextField AccTele;
    @FXML
    private Label loginmessage;
    public void VoegToe() throws IOException {
        Account.VoegToe(AccTele, AccName, Voornaam, Achternaam, AccWachtwoord, AccEmail, loginmessage);
    }

    public void switchToMenu(ActionEvent event) throws IOException {
        Switch S = new Switch0();
        S.switchToScene(event);
    }
}

