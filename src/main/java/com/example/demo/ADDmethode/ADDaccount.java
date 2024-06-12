package com.example.demo.ADDmethode;

import com.example.demo.objecten.Account;
import javafx.scene.control.ComboBox;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ADDaccount extends ADD {
    private ArrayList<Account> AccountArray = new ArrayList();
    @Override
    protected void Zoeklijst() {
        try (BufferedReader reader = new BufferedReader(new FileReader("accountlist"))) {
            String info;
            while ((info = reader.readLine()) != null) {
                AccountArray.add(new Account(info));
            }
        } catch (IOException ee) {
            System.out.println("Er is een fout opgetreden bij het programma.");
        }
    }

    @Override
    protected void Addlijst(ComboBox<String> lijst) {
        for (Account a : AccountArray) {
            String naam = a.getAccNaam();
            lijst.getItems().add(naam);
        }
    }
}