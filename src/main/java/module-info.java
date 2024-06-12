module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires java.desktop;
    requires java.sql;

    opens com.example.demo to javafx.fxml;
    exports com.example.demo;
    exports com.example.demo.Switches;
    opens com.example.demo.Switches to javafx.fxml;
    exports com.example.demo.Controllers;
    opens com.example.demo.Controllers to javafx.fxml;
    exports com.example.demo.objecten;
    opens com.example.demo.objecten to javafx.fxml;
    exports com.example.demo.ADDmethode;
    opens com.example.demo.ADDmethode to javafx.fxml;
}