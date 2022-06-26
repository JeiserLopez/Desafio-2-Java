package models;

public class Usuarios {
	
	private String nombreUsuario;
	private String passwordUsuario;
	
	public Usuarios(String nombreUsuario, String passwordUsuario) {
		super();
		this.nombreUsuario = nombreUsuario;
		this.passwordUsuario = passwordUsuario;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public String getPasswordUsuario() {
		return passwordUsuario;
	}
}
