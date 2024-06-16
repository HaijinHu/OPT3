package com.example.demo;

import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

import java.io.*;
import java.time.LocalDate;
import java.util.Scanner;

public class PlanEenTraining {
    public static void PlanTraining(Label loginmessage, DatePicker Date, ComboBox<String> comboBox, javafx.scene.control.TextField Max, javafx.scene.control.TextField Min){
        int lineCount = 1;

        try (Scanner scanner = new Scanner(new File("TrainingLijst"))) {
            while (scanner.hasNextLine()) {
                scanner.nextLine();
                lineCount++;
            }
        } catch (FileNotFoundException eee) {
            eee.printStackTrace();
        }
        if (!Min.getText().isBlank() && !Max.getText().isBlank()) {
            int accID = lineCount;
            String max = Max.getText();
            String min = Min.getText();
            LocalDate date = Date.getValue();
            String tijd = comboBox.getValue();
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter("TrainingLijst", true));
                writer.write(accID + ", " + max+", "+min+", "+date+", "+tijd+"\n");
                writer.close();
                loginmessage.setText("U heeft training " + accID + " gemaakt: Max atleten " + max+", Min atleten "+min+", Datum "+date+", Tijd "+tijd+"\n" +".");
            } catch (IOException e) {
                loginmessage.setText("Er is een fout opgetreden bij het schrijven naar het bestand");
            }
        }else {
            loginmessage.setText("U moet alles invullen.");
        }
    }
}
