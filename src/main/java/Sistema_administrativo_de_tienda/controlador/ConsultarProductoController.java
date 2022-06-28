package Sistema_administrativo_de_tienda.controlador;

import java.io.IOException;

import java.net.URL;
import java.time.LocalDate;
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
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ConsultarProductoController implements Initializable{

    @FXML
    private Button regresar;
    
    @FXML
    private Button buscar;
    
    @FXML
    private DatePicker Fechavencimiento;

    @FXML
    private TextField Nombreproducto;

    @FXML
    private TextField Codigo;
    
    @FXML
    private TableView<Producto> tablaProductos;
    
    @FXML
    private TableColumn colCantidad;

    @FXML
    private TableColumn colCodigo;

    @FXML
    private TableColumn colFechaDeVencimiento;

    @FXML
    private TableColumn colLote;

    @FXML
    private TableColumn colNombre;

    @FXML
    private TableColumn colPrecioCompra;

    @FXML
    private TableColumn colPrecioVenta;
    
    @Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

    @FXML
    public void switchToMenu() {
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
    void Buscar(ActionEvent event) {
    	LocalDate fechaDeVencimiento = Fechavencimiento.getValue();
    	String nombre = Nombreproducto.getText();
    	String codigo = Codigo.getText();
    }

}