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
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class InicioController implements Initializable{

    @FXML
    private PasswordField Contraseña;

    @FXML
    private Button Ingresar;

    @FXML
    private TextField NombreDeUsuario;
    
    @Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

    @FXML
    void Verificar(ActionEvent event) {
    	
    	String nombre = this.NombreDeUsuario.getText();
    	String contraseña = this.Contraseña.getText();
    	
    	
    	Validador val = new Validador(nombre,contraseña);
    	String m = val.validar();
    	
    	if(m.compareTo("correcto,jefe")==0) {
    		
	    	try {	
	    		FXMLLoader loader = new FXMLLoader(getClass().getResource("Menu jefe.fxml"));
	    		
	    		Parent root;
				
				root = loader.load();
				
	
	            
	            MenujefeController controlador = loader.getController();
	
	            
	            Scene scene = new Scene(root);
	            Stage stage = new Stage();
	
	           
	            stage.setScene(scene);
	            stage.setResizable(false);
	            stage.show();
	
	            
	            stage.setOnCloseRequest(e -> controlador.switchToInicio());
	
	            
	            Stage myStage = (Stage) this.Ingresar.getScene().getWindow();
	            myStage.close();
	    	}catch(IOException ex) {
	    		Logger.getLogger(MenujefeController.class.getName()).log(Level.SEVERE, null, ex);
	    	}
    	}else if(m.compareTo("correcto,empleado")==0) {
    		try {	
	    		FXMLLoader loader = new FXMLLoader(getClass().getResource("Menu empleado.fxml"));
	    		
	    		Parent root;
				
				root = loader.load();
			 
	            MenuEmpleadoController controlador = loader.getController();
	
	            Scene scene = new Scene(root);
	            Stage stage = new Stage();
	
	           
	            stage.setScene(scene);
	            stage.setResizable(false);
	            stage.show();
	
	            
	            stage.setOnCloseRequest(e -> controlador.switchToInicio());
	
	            
	            Stage myStage = (Stage) this.Ingresar.getScene().getWindow();
	            myStage.close();
	    	}catch(IOException ex) {
	    		Logger.getLogger(MenujefeController.class.getName()).log(Level.SEVERE, null, ex);
	    	}
    	}else {
    		Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Datos incorrectos");
            alert.showAndWait();
    	}
    }

}
