module org.dretez.riichijava {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.dretez.riichijava to javafx.fxml;
    exports org.dretez.riichijava;
}