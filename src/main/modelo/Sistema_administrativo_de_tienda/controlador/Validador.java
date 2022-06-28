package Sistema_administrativo_de_tienda.controlador;

public class Validador {
	private String nombre;
	private String contraseña;
	
	public Validador(String nombre, String contraseña) {
		super();
		this.nombre = nombre;
		this.contraseña = contraseña;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	public String validar() {
		if(contraseña.compareTo("hola")==0 & nombre.compareTo("hola")==0) {
			return "correcto,jefe";
		}else if(contraseña.compareTo("h")==0 & nombre.compareTo("h")==0){
			return "correcto,empleado";
		}
		return "invalid";	
	}
}
