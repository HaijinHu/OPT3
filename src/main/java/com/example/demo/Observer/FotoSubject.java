package com.example.demo.Observer;

import java.util.ArrayList;
import java.util.List;

public class FotoSubject {
    private static List<FotoObserver> observers = new ArrayList<>();
    private String Naam = null;

    public static void addObserver(FotoObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(FotoObserver observer) {
        observers.remove(observer);
    }

    public void setState(String Naam) {
        this.Naam = Naam;
        notifyAllObservers();
    }

    public String Naam() {
        return Naam;
    }

    private void notifyAllObservers() {
        for (FotoObserver observer : observers) {
            observer.update(Naam);
        }
    }
}
