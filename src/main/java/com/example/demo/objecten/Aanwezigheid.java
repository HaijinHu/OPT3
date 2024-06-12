package com.example.demo.objecten;

import java.time.LocalDate;

public class Aanwezigheid {
    int id;
    String tijd;
    String Date;

    public Aanwezigheid(String info) {
        String[] parts = info.split(", ");
        id = Integer.parseInt(parts[0]);
        tijd = parts[1].replaceAll("\"", "").trim();
        Date = parts[2].replaceAll("\"", "").trim();
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
}