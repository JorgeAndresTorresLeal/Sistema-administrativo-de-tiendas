module Sistema_administrativo_de_tienda.controlador {
    requires javafx.controls;
    requires javafx.fxml;
<<<<<<< HEAD
	requires java.logging;
	requires javafx.graphics;
	requires javafx.base;
=======
    requires java.sql;
>>>>>>> bfe93ddb6a843ddaf3f03c281d2802d9d8f07827

    opens Sistema_administrativo_de_tienda.controlador to javafx.fxml;
    exports Sistema_administrativo_de_tienda.controlador;
}
