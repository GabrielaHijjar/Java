module com.example.xadrezcores {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.xadrezcores to javafx.fxml;
    exports com.example.xadrezcores;
}