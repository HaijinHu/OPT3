package com.example.demo;

import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ToonLedenVanTraining {
    public static void toonleden(ListView<String> LedenList, ComboBox<String> TrainingLedenLijst, ArrayList<String> TrainingLedenArray){
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
}
