module com.example.variavel {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.variavel to javafx.fxml;
    exports com.example.variavel;
}