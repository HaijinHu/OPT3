package com.example.demo.Switches;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public abstract class Switch {
    private Stage stage;
    private Scene scene;

    public final void switchToScene(ActionEvent event) throws IOException {
        Parent root;
        String Scenenaam = scenenaam();
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(Scenenaam)));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    protected abstract String scenenaam();
}
