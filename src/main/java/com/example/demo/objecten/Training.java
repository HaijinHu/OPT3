package com.example.demo.objecten;

import java.time.LocalDate;

public class Training{
    private int TrainingID;
    private String Max;
    private String Min;
    private String Tijd;
    private String Date;
    public Training(String info) {
        String[] parts = info.split(", ");
        TrainingID = Integer.parseInt(parts[0]);
        Max = parts[1].replaceAll("\"", "").trim();
        Min = parts[2].replaceAll("\"", "").trim();
        Tijd = parts[3].replaceAll("\"", "").trim();
        Date = parts[4].replaceAll("\"", "").trim();
    }
    public int getTrainingID() {
        return TrainingID;
    }
    public String getMax() {
        return Max;
    }
    public String getMin() {
        return Min;
    }
    public String getTijd() {
        return Tijd;
    }
    public String getDate() {
        return Date;
    }
}


