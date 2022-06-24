module Sistema_administrativo_de_tienda.controlador {
    requires javafx.controls;
    requires javafx.fxml;

    opens Sistema_administrativo_de_tienda.controlador to javafx.fxml;
    exports Sistema_administrativo_de_tienda.controlador;
}
