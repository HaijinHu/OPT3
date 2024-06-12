package com.example.demo;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.*;
import java.util.Scanner;

public class Voegtoe {
    public static void VoegToe(TextField AccTele, TextField AccName, TextField Voornaam, TextField Achternaam, TextField AccWachtwoord, TextField AccEmail, Label loginmessage, ActionEvent e) throws IOException {
        int lineCount = 1;

        try (Scanner scanner = new Scanner(new File("accountlist"))) {
            while (scanner.hasNextLine()) {
                scanner.nextLine();
                lineCount++;
            }
        } catch (FileNotFoundException eee) {
            eee.printStackTrace();
        }

        if (!AccTele.getText().isBlank() && !AccName.getText().isBlank() && !Voornaam.getText().isBlank() && !Achternaam.getText().isBlank() && !AccWachtwoord.getText().isBlank() && !AccEmail.getText().isBlank()) {
            int accID = lineCount;
            String accNUM = AccTele.getText();
            String accName = AccName.getText();
            String voornaam = Voornaam.getText();
            String achternaam = Achternaam.getText();
            String accWachtwoord = AccWachtwoord.getText();
            String accEmail = AccEmail.getText();
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter("accountlist", true));
                writer.write(accID + ", " + accName + ", " + voornaam + ", " + achternaam + ", " + accWachtwoord + ", " + accEmail + ", " + accNUM + ", false\n");
                writer.close();
                loginmessage.setText("De account " + accName + " is toegevoegd");
            } catch (IOException ee) {
                loginmessage.setText("Er is een fout opgetreden bij het schrijven naar het bestand.");
            }
        } else {
            loginmessage.setText("Vul alle vakjes in met uw gegevens.");
        }
    }
}