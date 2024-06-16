package com.example.demo;

import com.example.demo.Switches.*;
import javafx.event.ActionEvent;

import java.io.IOException;

public class Scene2Controller {
    public void switchToScene0(ActionEvent event) throws IOException {
        Switch S = new Switch0();
        S.switchToScene(event);
    }
    public void switchToSceneM1(ActionEvent event) throws IOException {
        Switch S = new SwitchM1();
        S.switchToScene(event);
    }
    public void switchToSceneM2(ActionEvent event) throws IOException {
        Switch S = new SwitchM2();
        S.switchToScene(event);
    }
    public void switchToSceneM3(ActionEvent event) throws IOException {
        Switch S = new SwitchM3();
        S.switchToScene(event);
    }
    public void switchToSceneM4(ActionEvent event) throws IOException {
        Switch S = new SwitchM4();
        S.switchToScene(event);
    }
    public void switchToSceneM5(ActionEvent event) throws IOException {
        Switch S = new SwitchM5();
        S.switchToScene(event);
    }
    public void switchToSceneM6(ActionEvent event) throws IOException {
        Switch S = new SwitchM6();
        S.switchToScene(event);
    }
}
