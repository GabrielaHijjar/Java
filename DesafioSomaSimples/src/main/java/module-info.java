module com.example.desafiosomasimples {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.desafiosomasimples to javafx.fxml;
    exports com.example.desafiosomasimples;
}