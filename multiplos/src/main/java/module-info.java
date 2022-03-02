module com.example.multiplos {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.multiplos to javafx.fxml;
    exports com.example.multiplos;
}