package com.example.demo;

import com.example.demo.Observer.FotoSubject;
import com.example.demo.Observer.Scene1Observer;
import com.example.demo.Switches.Switch;
import com.example.demo.Switches.Switch0;
import com.example.demo.Switches.Switch2;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

import java.io.IOException;

public class Scene1Controller {
    public ImageView ACCFoto;
    String Naam = Scene0Controller.inlogName;
    private final FotoSubject fotoObserver = new FotoSubject();

    @FXML
    Label loginLabel;

    public void initialize() {
        Scene1Observer scene1Observer = new Scene1Observer(this);
        FotoSubject.addObserver(scene1Observer);
        fotoObserver.setState(Naam);
    }
    public void loginLabel(String username) {
        loginLabel.setText("Welkom " + username + "!");
    }

    public void switchToScene0(ActionEvent event) throws IOException {
        Switch S = new Switch0();
        S.switchToScene(event);
    }
    public void switchToScene2(ActionEvent event) throws IOException {
        Switch2 S = new Switch2();
        S.switchToScene2(event);
    }
}