module com.example.desafiofusohorario {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.desafiofusohorario to javafx.fxml;
    exports com.example.desafiofusohorario;
}