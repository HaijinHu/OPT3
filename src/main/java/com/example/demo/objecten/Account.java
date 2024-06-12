package com.example.demo.objecten;

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
}
