package Sistema_administrativo_de_tienda.controlador;

import database.ConnectionDb;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {


    @Override
    public void start(Stage stage) throws IOException {   	
    	try {
            FXMLLoader loader = new FXMLLoader(App.class.getResource("Menu jefe.fxml"));        
            Pane ventana = (Pane) loader.load();

            // Show the scene containing the root layout.
            Scene scene = new Scene(ventana);
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    	
    }



    public static void main(String[] args) {
        ConnectionDb connectionDb = new ConnectionDb();
        connectionDb.conectar();
        launch();
    }

}