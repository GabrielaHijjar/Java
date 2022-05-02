module com.example.jutsu {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.jutsu to javafx.fxml;
    exports com.example.jutsu;
}