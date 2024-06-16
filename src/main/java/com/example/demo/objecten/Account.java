package com.example.demo.objecten;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.*;
import java.util.Scanner;

public class Account {
    private int accID;
    private String accNaam;
    private String accWachtwoord;
    private boolean accisTrainer;
    private String Voornaam;
    private String Achternaam;
    private String Email;
    private String Telefoon;

    public Account(String info) {
        String[] parts = info.split(", ");
        accID = Integer.parseInt(parts[0]);
        accNaam = parts[1].replaceAll("\"", "").trim();
        Voornaam = parts[2].replaceAll("\"", "").trim();
        Achternaam = parts[3].replaceAll("\"", "").trim();
        accWachtwoord = parts[4].replaceAll("\"", "").trim();
        Email = parts[5].replaceAll("\"", "").trim();
        Telefoon = parts[6].replaceAll("\"", "").trim();
        accisTrainer = Boolean.parseBoolean(parts[7].trim());
    }
    public int getAccID() {
        return accID;
    }

    public String getAccNaam() {
        return accNaam;
    }

    public String getAccWachtwoord() {
        return accWachtwoord;
    }

    public boolean isAccisTrainer() {
        return accisTrainer;
    }
    public String getTelefoon() {
        return Telefoon;
    }

    public String getAchternaam() {
        return Achternaam;
    }

    public String getVoornaam() {
        return Voornaam;
    }

    public String getEmail() {
        return Email;
    }

    public void setAccisTrainer(boolean accisTrainer) {
        this.accisTrainer = accisTrainer;
    }
    public static void VoegToe(TextField AccTele, TextField AccName, TextField Voornaam, TextField Achternaam, TextField AccWachtwoord, TextField AccEmail, Label loginmessage) throws IOException {
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
