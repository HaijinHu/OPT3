package com.example.demo.Controllers;
//Pas afwezigheiddagen aan
import com.example.demo.Scene0Controller;
import com.example.demo.Switches.Switch2;
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
        int accID = Scene0Controller.accID;
        if (Date != null) {
            LocalDate date = Date.getValue();
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter("BlokeerdagenLijst", true));
                writer.write(accID + ", " +date+", \n");
                writer.close();
                loginmessage.setText("Uw blokkerdag is ingepland.");
            } catch (IOException e) {
                loginmessage.setText("Er is een fout opgetreden bij het schrijven naar het bestand");
            }
        }else {
            loginmessage.setText("U moet alles invullen.");
        }
    }
    public void switchToScene0(ActionEvent event) throws IOException {
        Switch2 S = new Switch2();
        S.switchToScene2(event);
    }
}
