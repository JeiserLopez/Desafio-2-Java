import controllers.ConectorBD;
import controllers.UsuarioController;

public class test {

	public static void main(String[] args) {
		ConectorBD conDB = new ConectorBD();
		UsuarioController uc = new UsuarioController();
		
		if(conDB.getConexion() != null) {
			System.out.println("Conexion establecida");
		}
		
		//uc.ejecutarConsulta(conDB.getConexion());

	}

}
