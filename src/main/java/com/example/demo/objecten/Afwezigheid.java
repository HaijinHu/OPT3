package com.example.demo.objecten;

import com.example.demo.Scene0Controller;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Afwezigheid {
    String Date;
    int id;
    public static String loginmessage;

    public Afwezigheid(String info) {
        String[] parts = info.split(", ");
        id = Integer.parseInt(parts[0]);
        Date = parts[1].replaceAll("\"", "").trim();

    }
    public int getId() {
        return id;
    }
    public String getDate() {
        return Date;
    }


    public static String PlanAF(String date){
        int accID = Scene0Controller.accID;
        if (!date.equals("null")) {
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter("BlokeerdagenLijst", true));
                writer.write(accID + ", " +date+", \n");
                writer.close();
                loginmessage = ("Uw blokkerdag is ingepland.");
            } catch (IOException e) {
                loginmessage = ("Er is een fout opgetreden bij het schrijven naar het bestand");
            }
        }else {
            loginmessage = ("U moet alle vakjes invullen.");
        }
        return loginmessage;
    }
}
