package Modelo;
import java.sql.ResultSet;
import java.util.Scanner;

import BBDD.ConectarBD;

public class Usuarios {

	static Scanner teclado = new Scanner(System.in);

	private static void VerUsuarios() {
		ConectarBD.Conectar();


		ResultSet selectAll = ConectarBD.EjecutarSentencia("SELECT * FROM usuarios");
		try {
			while(selectAll.next()) {
				//int id = selectAll.getInt("codigo");
				String nombre = selectAll.getString("nombre");

				System.out.println(nombre);
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

	private static void AñadirUsuario() {

		String nombre;
		String pass;
		int id = 2;
		System.out.println("Inserte su nombre de usuario");
		nombre = teclado.nextLine();

		System.out.println("Inserte su contraseña");
		pass = teclado.nextLine();



		ConectarBD.Conectar();
		ConectarBD.EjecutarSentencia("INSERT INTO USUARIOS (ID, NOMBRE, PASSWORD) VALUES ('" +id+"', '"+nombre+"', '"+pass+"');");


	}




	private static void Login() {
		String passTeclado = "usuario";
		String nombreTeclado = "root";



		ConectarBD.Conectar();


		ResultSet selectAll = ConectarBD.EjecutarSentencia("Select * From usuarios where nombre = '"+nombreTeclado+"' and password ='"+passTeclado+"'");
		try {

			while(selectAll.next()) {
				if(selectAll.getString("nombre").equals(nombreTeclado) & selectAll.getString("password").equals(passTeclado)){
					System.out.println("Login Correcto");
				}else {
					System.out.println("el usuario o la contraseña no estan en nuestra base de datos");
				}
			}








		}catch(Exception e) {
			System.out.println(e.getMessage());
		}



	}

	private static void BorrarUsuario() {

		System.out.println("Escriba su nombre de Usuario");
		String nombre = teclado.next() ;

		ConectarBD.Conectar();
		ConectarBD.EjecutarSentencia("delete from USUARIOS where nombre = '"+nombre+"'");
		
	}




}
