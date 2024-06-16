package com.example.demo.objecten;

import java.io.*;
import java.util.ArrayList;

public class Ervaring {
    int ID;
    String Naam;
    int ErvaringJaren;

    public Ervaring(String info) {
        String[] parts = info.split(", ");
        ID = Integer.parseInt(parts[0]);
        Naam = parts[1].replaceAll("\"", "").trim();
        ErvaringJaren =  Integer.parseInt(parts[2]);
    }
    public int getID() {
        return ID;
    }

    public String getNaam() {
        return Naam;
    }

    public int getErvaringJaren() {
        return ErvaringJaren;
    }
}
