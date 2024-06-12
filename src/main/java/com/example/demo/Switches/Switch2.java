package com.example.demo.Switches;
import com.example.demo.Scene0Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Switch2 {
    private Stage stage;
    private Scene scene;
    public void switchToScene2(ActionEvent event) throws IOException {
        boolean trainer = Scene0Controller.Trainer;
        Parent root;
        if (trainer) {
            root = FXMLLoader.load(getClass().getResource("/com/example/demo/scene2ADM.fxml"));
        }else {
            root = FXMLLoader.load(getClass().getResource("/com/example/demo/scene2.fxml"));
        }
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
