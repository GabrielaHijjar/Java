module com.example.tempojogo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tempojogo to javafx.fxml;
    exports com.example.tempojogo;
}