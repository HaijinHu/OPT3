package com.example.demo.ADDmethode;

import com.example.demo.objecten.Training;
import javafx.scene.control.ComboBox;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ADDtraining extends ADD {
    private ArrayList<Training> TrainingArray = new ArrayList<>();
    @Override
    protected void Zoeklijst() {
        try (BufferedReader reader = new BufferedReader(new FileReader("TrainingLijst"))) {
            String info;
            while ((info = reader.readLine()) != null) {
                TrainingArray.add(new Training(info));
            }
        } catch (IOException ee) {
            System.out.println("Er is een fout opgetreden bij het programma.");
        }
    }
    @Override
    protected void Addlijst(ComboBox<String> lijst) {
        for (Training T : TrainingArray) {
            int ID = T.getTrainingID();
            String datum = T.getDate();
            String tijd = T.getTijd();
            String Training = ID + " I " + datum + " I " + tijd;
            lijst.getItems().add(Training);
        }
    }
}
