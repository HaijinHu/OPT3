package com.example.demo.Controllers;
// Plan Training
import com.example.demo.Scene2Controller;
import com.example.demo.Switches.Switch;
import com.example.demo.Switches.Switch2;
import com.example.demo.Switches.SwitchM5;
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
import java.util.Scanner;


public class M1Controller implements Initializable {
    @FXML
    private javafx.scene.control.TextField Min;
    @FXML
    private javafx.scene.control.TextField Max;
    @FXML
    private ComboBox<String> comboBox;
    @FXML
    private DatePicker Date;
    @FXML
    private Label loginmessage;
    public void PlanTraining(){
        int lineCount = 1;

        try (Scanner scanner = new Scanner(new File("TrainingLijst"))) {
            while (scanner.hasNextLine()) {
                scanner.nextLine();
                lineCount++;
            }
        } catch (FileNotFoundException eee) {
            eee.printStackTrace();
        }
        if (!Min.getText().isBlank() && !Max.getText().isBlank()) {
            int accID = lineCount;
            String max = Max.getText();
            String min = Min.getText();
            LocalDate date = Date.getValue();
            String tijd = comboBox.getValue();
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter("TrainingLijst", true));
                writer.write(accID + ", " + max+", "+min+", "+date+", "+tijd+"\n");
                writer.close();
                loginmessage.setText("U heeft training " + accID + " gemaakt: Max atleten " + max+", Min atleten "+min+", Datum "+date+", Tijd "+tijd+"\n" +".");
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
        comboBox.setItems(FXCollections.observableArrayList("00.00-01.00","01.00-02.00","02.00-03.00","03.00-04.00","04.00-05.00","05.00-06.00","06.00-07.00","07.00-08.00","08.00-09.00","09.00-10.00","10.00-11.00","11.00-12.00","12.00-13.00","13.00-14.00","14.00-15.00","15.00-16.00","16.00-17.00","17.00-18.00","18.00-19.00","19.00-20.00","20.00-21.00","21.00-22.00","22.00-23.00","23.00-24.00"));
    }
    public void switchToSceneM2(ActionEvent event) throws IOException {
        Scene2Controller s = new Scene2Controller();
        s.switchToSceneM2(event);
    }
    public void switchToSceneM5(ActionEvent event) throws IOException {
        Switch S = new SwitchM5();
        S.switchToScene(event);
    }
}
