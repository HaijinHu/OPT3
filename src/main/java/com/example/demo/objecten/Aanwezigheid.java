package com.example.demo.objecten;

import com.example.demo.Scene0Controller;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Aanwezigheid {
    int id;
    String tijd;
    String Date;
    String Locate;

    public Aanwezigheid(String info) {
        String[] parts = info.split(", ");
        id = Integer.parseInt(parts[0]);
        tijd = parts[1].replaceAll("\"", "").trim();
        Date = parts[2].replaceAll("\"", "").trim();
        Locate = parts[3].replaceAll("\"", "").trim();
    }
    public int getId() {
        return id;
    }
    public String getTijd() {
        return tijd;
    }
    public String getDate() {
        return Date;
    }
    public String getLocate() {
        return Locate;
    }
    public static String loginmessage;

    public static String PlanAN(String Date, String tijd, String Locate) {
        int accID = Scene0Controller.accID;
        boolean DateNULL = false;
        boolean TijdNULL = false;
        boolean LocatieNULL = false;
        if (Date.equals("null")){
            DateNULL = true;
        }
        if (tijd == null){
            TijdNULL = true;
        }
        if (Locate == null){
            LocatieNULL = true;
        }        if (!DateNULL && !TijdNULL && !LocatieNULL) {
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter("AanwezigheidLijst", true));
                writer.write(accID + ", " + Date + ", " + tijd +", " + Locate + "\n");
                writer.close();
                loginmessage = ("Uw aanwezigheid dag is ingepland.");
            } catch (IOException e) {
                loginmessage = ("Er is een fout opgetreden bij het schrijven naar het bestand");
            }
        }
        else if(DateNULL && !TijdNULL && !LocatieNULL) {
            loginmessage = ("U moet uw datum invullen.");
        }else if (!DateNULL && TijdNULL && !LocatieNULL){
            loginmessage = ("U moet uw tijd invullen.");
        }else if (!DateNULL && !TijdNULL && LocatieNULL){
            loginmessage = ("U moet uw locatie invullen.");
        }else {
            loginmessage =("U moet alle vakjes invullen.");
        }
        return loginmessage;
    }
}