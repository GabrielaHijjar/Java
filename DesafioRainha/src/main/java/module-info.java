module com.example.desafiorainha {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.desafiorainha to javafx.fxml;
    exports com.example.desafiorainha;
}