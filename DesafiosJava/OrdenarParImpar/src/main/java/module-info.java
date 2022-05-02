module com.example.ordenarparimpar {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ordenarparimpar to javafx.fxml;
    exports com.example.ordenarparimpar;
}