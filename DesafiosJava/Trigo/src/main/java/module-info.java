module com.example.desafiojavatrigo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.desafiojavatrigo to javafx.fxml;
    exports com.example.desafiojavatrigo;
}