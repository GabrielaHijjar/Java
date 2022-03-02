module desafiogft.distancia {
    requires javafx.controls;
    requires javafx.fxml;


    opens desafiogft.distancia to javafx.fxml;
    exports desafiogft.distancia;
}