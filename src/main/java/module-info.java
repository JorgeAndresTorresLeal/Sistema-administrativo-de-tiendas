module Sistema_administrativo_de_tienda.controlador {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens Sistema_administrativo_de_tienda.controlador to javafx.fxml;
    exports Sistema_administrativo_de_tienda.controlador;
}
