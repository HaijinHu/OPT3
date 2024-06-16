package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.util.Objects;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/com/example/demo/images/RoeiFoto.png")));
        stage.getIcons().add(image);
        try {
            Parent root = FXMLLoader.load(getClass().getResource("sceneM6.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        launch(args);
    }
}