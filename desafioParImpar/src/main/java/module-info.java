module com.example.desafioparimpar {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.desafioparimpar to javafx.fxml;
    exports com.example.desafioparimpar;
}