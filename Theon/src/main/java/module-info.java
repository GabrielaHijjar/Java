module com.example.theon {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.theon to javafx.fxml;
    exports com.example.theon;
}