module com.example.palavras {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.palavras to javafx.fxml;
    exports com.example.palavras;
}