package com.example.demo.Controllers;
//Pas Aanwezigheid aan
import com.example.demo.Scene0Controller;
import com.example.demo.Switches.Switch2;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

import java.io.*;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class M4Controller implements Initializable {

    @FXML
    private ComboBox<String> comboBox;
    @FXML
    private DatePicker Date;
    @FXML
    private Label loginmessage;
    public void PlanAN(){
        int accID = Scene0Controller.accID;
        if (Date != null) {
            LocalDate date = Date.getValue();
            String tijd = comboBox.getValue();
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter("AanwezigheidLijst", true));
                writer.write(accID + ", " +date+", "+tijd+"\n");
                writer.close();
                loginmessage.setText("Uw aanwezigheid dag is ingepland.");
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
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        comboBox.setItems(FXCollections.observableArrayList("00:00-01:00","01:00-02:00","02:00-03:00","03:00-04:00","04:00-05:00","05:00-06:00","06:00-07:00","07:00-08:00","08:00-09:00","09:00-10:00","10:00-11:00","11:00-12:00","12:00-13:00","13:00-14:00","14:00-15:00","15:00-16:00","16:00-17:00","17:00-18:00","18:00-19:00","19:00-20:00","20:00-21:00","21:00-22:00","22:00-23:00","23:00-24:00"));
    }
}
