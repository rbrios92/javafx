module pa.cifpaviles.dam2d.testjavafx {
    requires javafx.controls;
    requires javafx.fxml;

    opens pa.cifpaviles.dam2d.testjavafx to javafx.fxml;
    exports pa.cifpaviles.dam2d.testjavafx;
}
