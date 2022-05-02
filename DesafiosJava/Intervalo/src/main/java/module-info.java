module com.example.intervalo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.intervalo to javafx.fxml;
    exports com.example.intervalo;
}