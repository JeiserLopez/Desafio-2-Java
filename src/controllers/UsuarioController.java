package controllers;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class UsuarioController {
	
	public boolean ejecutarConsulta(Connection con,String nomUsuario, String passUsuario) {
		
		try {
			   String SQL = "SELECT * FROM hotelalura.usuarios where nomUsuario='"+nomUsuario+"' and "+"passUsuario='"+passUsuario+"'" ;
			  // System.out.println(SQL);
			   Statement stmt = con.createStatement();
			   ResultSet rs = stmt.executeQuery(SQL);
	
			   if (rs.next()) {
				 //  System.out.println(rs.getString("nomUsuario") + ", " + rs.getString("passUsuario"));
				   return true;
			   }
			  
			  rs.close();
			  stmt.close();
		}
			catch (Exception e) {
			  e.printStackTrace();
			}
		return false;
		}

}
