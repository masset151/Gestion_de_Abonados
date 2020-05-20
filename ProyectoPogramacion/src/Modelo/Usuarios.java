package Modelo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import javax.swing.JOptionPane;

import BBDD.ConectarBD;
import Vista.Ventana;

public class Usuarios {

	static Scanner teclado = new Scanner(System.in);
	int idusuario;

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




	public static void Login(String passTeclado,String nombreTeclado) {



		boolean login = false;
		ConectarBD.Conectar();


		ResultSet selectAll = ConectarBD.EjecutarSentencia("Select * From usuarios where nombre = '"+nombreTeclado+"' and password ='"+passTeclado+"'");
		try {

			while(selectAll.next()) {

				if(selectAll.getString("nombre").equals(nombreTeclado) & selectAll.getString("password").equals(passTeclado)){

					login = true;
				}else {
					login = false;
				}



			}

			if(login==true) {
				Ventana ventana = new Ventana();
				ventana.setVisible(true);
			}else {
				JOptionPane.showMessageDialog(null,"Error,el usuario o la contraseña no coinciden");
			}








		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,"Error de ejecucion");
		}



	}

	private static void BorrarUsuario() {

		System.out.println("Escriba su nombre de Usuario");
		String nombre = teclado.next() ;

		ConectarBD.Conectar();
		ConectarBD.EjecutarSentencia("delete from USUARIOS where nombre = '"+nombre+"'");

	}

	public void Registro(String usuario,String contra) {

		boolean disponible = checkAbonado(usuario);
		int id = GeneralID();
		ConectarBD.Conectar();
		


		if(disponible) {
			ConectarBD.ejecutarUpdate("INSERT INTO USUARIOS VALUES ('"+id+"','"+usuario+"','"+contra+"')");
			JOptionPane.showMessageDialog(null,"registrado");
		}else {
			JOptionPane.showMessageDialog(null,"el nombre de usuario esta cogido, pruebe con otro");
		}




	}


	private static boolean checkAbonado(String usuario) {
		
		boolean disponible = false;
		



		try {
			
			ConectarBD.Conectar();
			ResultSet rs = ConectarBD.EjecutarSentencia("SELECT * from usuarios where nombre ="+usuario);
			String user = null;
			disponible = true;
			
			while(rs.next()) {
				if(usuario.equals(rs.getString("NOMBRE"))){
					disponible = false;
					
				}
				
			
				
				
				

			}
			
		
			

			if(disponible) {
				return true;
			}else {
				return false;
			}
			

		}catch (Exception e) {
			//JOptionPane.showMessageDialog(null,"Error al comprobar los datos");
			return false;
		}
		



	}

	public int GeneralID()  {
		ConectarBD.Conectar();

		ResultSet selectAll = ConectarBD.EjecutarSentencia("SELECT COUNT(ID) AS ID FROM USUARIOS");


		try {
			while(selectAll.next()) {
				idusuario = selectAll.getInt("ID");
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null,"Error al generar la id");
		}

		idusuario++;
		System.out.print(idusuario);

		return idusuario;
	}



}
