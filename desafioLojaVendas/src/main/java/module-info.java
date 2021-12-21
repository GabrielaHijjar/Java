module com.example.desafiolojavendas {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.desafiolojavendas to javafx.fxml;
    exports com.example.desafiolojavendas;
}