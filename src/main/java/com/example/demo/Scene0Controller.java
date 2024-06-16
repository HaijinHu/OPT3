package com.example.demo;

import com.example.demo.Switches.SwitchACC;
import com.example.demo.objecten.Account;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;

import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;


public class Scene0Controller {
    public static String inlogName;
    private ArrayList<Account> accounts = new ArrayList<>();
    public static boolean Trainer = true;
    public static int accID = 0;
    private Parent root;

    @FXML
    private javafx.scene.control.TextField nameTextField;
    @FXML
    private Label loginmessage;
    @FXML
    private PasswordField passwordField;
    private Stage stage;
    private Scene scene;

    public void switchToScene1(ActionEvent event){
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void inloggen(ActionEvent e) throws IOException {

        String username = nameTextField.getText();
        String password = passwordField.getText();
        inlogName = username;

        FXMLLoader loader = new FXMLLoader(getClass().getResource("scene1.fxml"));
        root = loader.load();
        Scene1Controller scene1Controller = loader.getController();
        scene1Controller.loginLabel(username);
        if (!nameTextField.getText().isBlank() && !passwordField.getText().isBlank()) {

            try (BufferedReader reader = new BufferedReader(new FileReader("accountlist"))) {
                String info;
                while ((info = reader.readLine()) != null) {
                    accounts.add(new Account(info));
                }
            } catch (IOException ee) {
                loginmessage.setText("Er is een fout opgetreden bij het programma.");
            }

            boolean loggedIn = false;
            for (Account a : accounts) {
                if (username.equals(a.getAccNaam()) && password.equals(a.getAccWachtwoord())) {
                    Trainer = a.isAccisTrainer();
                    accID = a.getAccID();
                    loginmessage.setText("Welkom " + inlogName + "!");
                    loggedIn = true;
                    switchToScene1(e);
                    break;
                }
            }

            if (!loggedIn) {
                loginmessage.setText("Uw gebruikersnaam of wachtwoord is onjuist. Probeer het opnieuw.");
            }

        } else {
            loginmessage.setText("Vul uw Gebruikersnaam en Wachtwoord in.");
        }
    }

    @FXML
    void openlink() throws URISyntaxException, IOException {
        Desktop.getDesktop().browse(new URI("https://proteus-eretes.nl/"));
    }
    public void switchToSceneACC(ActionEvent event) throws IOException {
        SwitchACC S = new SwitchACC();
        S.switchToScene(event);
    }
}