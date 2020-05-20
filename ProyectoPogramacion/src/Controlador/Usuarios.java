package Controlador;

public class Usuarios {

	public static void login(String user,String contra) {
		Modelo.Usuarios.Login(contra, user);
	}
	
	public static void Registro(String usuario,String contra) {
		Modelo.Usuarios us = new Modelo.Usuarios();
		
		us.Registro(usuario, contra);
	}
	
	
	
}
