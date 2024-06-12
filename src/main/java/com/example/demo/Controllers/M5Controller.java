package com.example.demo.Controllers;
//Toon agenda
import com.example.demo.Switches.Switch2;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class M5Controller implements Initializable {
    private ArrayList<String> TrainingLedenArray = new ArrayList();
    @FXML
    private ComboBox<String> TrainingLedenLijst;
    @FXML
    private ListView<String> LedenList;

    public void toonleden(){
        LedenList.getItems().clear();
        TrainingLedenArray.clear();
        String fileNaam = "C:\\Users\\haiji\\IdeaProjects\\demo\\TrainingLedenLijst\\" + TrainingLedenLijst.getValue();
        System.out.println(fileNaam);
        try (BufferedReader reader = new BufferedReader(new FileReader(fileNaam))) {
            String info;
            while ((info = reader.readLine()) != null) {
                TrainingLedenArray.add(new String(info));
            }
        } catch (IOException ee) {
            System.out.println("Er is een fout opgetreden bij het programma: " + ee);
        }
        LedenList.getItems().addAll(TrainingLedenArray);
    }
    public void AD()throws IOException {
        Path dir = Paths.get("C:\\Users\\haiji\\IdeaProjects\\demo\\TrainingLedenLijst");

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
            for (Path entry : stream) {
                TrainingLedenLijst.getItems().add(String.valueOf(entry.getFileName()));
            }
        }
    }

        @Override
        public void initialize (URL location, ResourceBundle resources){
            try {
                AD();
            } catch (IOException e) {
                System.err.println("Er is een fout opgetreden bij het laden van de gegevens: " + e.getMessage());
            }
        }
    public void switchToScene0(ActionEvent event) throws IOException {
        Switch2 S = new Switch2();
        S.switchToScene2(event);
    }

    }


