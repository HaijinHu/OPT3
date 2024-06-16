package com.example.demo.Controllers;
//Pas afwezigheiddagen aan
import com.example.demo.Scene0Controller;
import com.example.demo.Switches.Switch2;
import com.example.demo.objecten.Aanwezigheid;
import com.example.demo.objecten.Afwezigheid;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

import java.io.*;
import java.time.LocalDate;

public class M3Controller {
    @FXML
    private DatePicker Date;
    @FXML
    private Label loginmessage;
    public void PlanAF(){
        String date = String.valueOf(Date.getValue());
        Afwezigheid.PlanAF(date);
        loginmessage.setText(Afwezigheid.loginmessage);
    }
    public void switchToScene0(ActionEvent event) throws IOException {
        Switch2 S = new Switch2();
        S.switchToScene2(event);
    }
}
