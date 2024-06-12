package com.example.demo.objecten;

public class Afwezigheid {
    String Date;
    int id;

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
}
