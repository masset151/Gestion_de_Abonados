package Controlador;

import Modelo.Abonados;

public class ControladorAbonado{

	public void insertUser( String nombre, String apellido1, String apellido2,int codzona,
			String direcion, String telefono,int codsector) {
		
		int aleatorio1 = (int) (Math.random()*10)+1;
		int aleatorio2 = (int) (Math.random()*10)+1;
		
		//int codzona = 1;
		//int codsector = 0;
		
		int clave = codzona+codsector+aleatorio1+aleatorio2;
		
		
		Abonados abonado = new Abonados();
		int idAbonado = 5;
		
		
		abonado.InsertarAbonado(idAbonado, nombre, apellido1, apellido2, codzona, direcion, telefono, clave, codsector);
		
	}
	
	public static void deleteUser(int num) {
		Modelo.Abonados.BorrarAbonado(num);
		System.out.println("controlador");
	}
	
}
