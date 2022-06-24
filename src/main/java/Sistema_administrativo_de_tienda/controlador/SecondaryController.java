package Sistema_administrativo_de_tienda.controlador;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class SecondaryController {

	@FXML
    private Button regresar;
	
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("Menu jefe");
    }
}