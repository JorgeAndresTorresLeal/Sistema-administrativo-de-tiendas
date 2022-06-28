package Sistema_administrativo_de_tienda.controlador;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class VentaProductoController implements Initializable{

    @FXML
    private Button regresar;
    
    @FXML
    private Button Cancelar;

    @FXML
    private TextField DineroADevolver;

    @FXML
    private TextField DineroRecibido;

    @FXML
    private TextField Preciototal;

    @FXML
    private Button Terminar;
    
    @Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

    @FXML
    void switchToMenu() {
    	try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Menu jefe.fxml"));

            Parent root = loader.load();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();

            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();
            
            

            Stage myStage = (Stage) this.regresar.getScene().getWindow();
            myStage.close();

        } catch (IOException ex) {
            Logger.getLogger(MenujefeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @FXML
    void CancelarVenta(ActionEvent event) {

    }

    @FXML
    void TerminarVenta(ActionEvent event) {

    }

    
    

}
