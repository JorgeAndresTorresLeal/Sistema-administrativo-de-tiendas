package Sistema_administrativo_de_tienda.controlador;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class PrimaryController {

	@FXML
    private Button consultar;

    @FXML
    private Button entradaProducto;

    @FXML
    private Button primaryButton;

    @FXML
    private Button registrarSalida;

    @FXML
    private Button reporte;

    @FXML
    private Button tertiaryButton;
	
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("Crear-modificar empleado");
    }
    
    @FXML
    private void switchToTertiary() throws IOException {
        App.setRoot("Creacion de producto");
    }
    
    @FXML
    private void switchToRegistrarSalida() throws IOException{
    	App.setRoot("Salida-Venta de producto");
    }
    

    @FXML
    void switchToConsultar() throws IOException{
    	App.setRoot("Consultar producto");
    }

    @FXML
    void switchToEntradaProducto() throws IOException{
    	App.setRoot("Registro entrada de producto");
    }
    
    @FXML
    void switchToReporte() throws IOException{
    	App.setRoot("Reporte");
    }
}
