module com.example.desafiodama {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.desafiodama to javafx.fxml;
    exports com.example.desafiodama;
}