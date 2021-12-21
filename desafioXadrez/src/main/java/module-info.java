module com.example.desafioxadrez {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.desafioxadrez to javafx.fxml;
    exports com.example.desafioxadrez;
}