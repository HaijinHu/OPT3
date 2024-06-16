package com.example.demo;

import com.example.demo.objecten.Ervaring;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ToonErvaring {
    public static String loginmessage;
    private static ArrayList<Ervaring> ErvaringArray = new ArrayList<>();
    public static String toonrevaring(String naam){
        if (naam != null) {
            try (BufferedReader reader = new BufferedReader(new FileReader("ErvaringLijst"))){
                String info;
                while ((info = reader.readLine()) != null) {
                    ErvaringArray.add(new Ervaring(info));
                }
            } catch (IOException e) {
                loginmessage = ("Er is een fout opgetreden bij het schrijven naar het bestand");
            }
            for (Ervaring E : ErvaringArray) {
                String GebruikerNaam = E.getNaam();
                if (GebruikerNaam.equals(naam)){
                    int ervaringjaren = E.getErvaringJaren();
                    if (ervaringjaren <=2){
                        loginmessage = ("Zalm");
                    } else if (ervaringjaren <= 5){
                        loginmessage = ("Dolfijn");
                    } else {
                        loginmessage = ("Haai");
                    }
                }
            }
        }else {
            loginmessage = ("Deze persoon staat niet in de ervaring lijst");
        }
        return loginmessage;
    }
}
