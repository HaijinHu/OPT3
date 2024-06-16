package com.example.demo;

import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class VoegAccountToe {
    public static void voegtoe(Label loginmessage, ComboBox<String> accountlijst, ComboBox<String> trainingLijst) throws IOException {
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
}
