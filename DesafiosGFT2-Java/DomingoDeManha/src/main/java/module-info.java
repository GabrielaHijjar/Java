module com.example.domingodemanha {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.domingodemanha to javafx.fxml;
    exports com.example.domingodemanha;
}