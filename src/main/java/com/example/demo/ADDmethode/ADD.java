package com.example.demo.ADDmethode;

import javafx.scene.control.ComboBox;

public abstract class ADD {
    protected abstract void Zoeklijst();
    protected abstract void Addlijst(ComboBox<String> lijst);
    public final void AD(ComboBox<String> lijst){

        Zoeklijst();

        Addlijst(lijst);
    }
}
