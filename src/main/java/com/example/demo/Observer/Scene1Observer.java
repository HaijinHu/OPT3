package com.example.demo.Observer;

import com.example.demo.Scene1Controller;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
public class Scene1Observer extends FotoObserver {
    public Scene1Observer(Scene1Controller controller) {
        this.scene1Controller = controller;
    }
    @FXML
    private Scene1Controller scene1Controller;
    Image Kai = new Image(String.valueOf(getClass().getResource("/com/example/demo/images/kai.png")));
    Image Haijin = new Image(String.valueOf(getClass().getResource("/com/example/demo/images/Haijin.png")));
    Image Niks = new Image(String.valueOf(getClass().getResource("/com/example/demo/images/Niks.png")));

    @Override
    public void update(String Naam) {
        if (Naam.equals("kai")) {
            scene1Controller.ACCFoto.setImage(Kai);
        } else if(Naam.equals("haijin")) {
            scene1Controller.ACCFoto.setImage(Haijin);
        } else{
            scene1Controller.ACCFoto.setImage(Niks);
        }
    }
}
