module org.dretez.riichijava {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.dretez.riichijava.ui to javafx.fxml;
    exports org.dretez.riichijava.ui;
}