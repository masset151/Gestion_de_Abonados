package Controlador;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;



public class ConectarBD {
	static String timezone = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	static String dbname = "carreraoficial";
	static String url="jdbc:mysql://localhost:3307/"+dbname+timezone;
	static String user="root";
	static String pas = "manolo";
	static String driver="com.mysql.cj.jdbc.Driver";


	static Connection conexion;
	static Statement consulta;
	static ResultSet resultado;

	public static void Conectar() {
		try {
			Class.forName(driver);
			conexion = DriverManager.getConnection(url,user,pas);
			consulta = conexion.createStatement();
			System.out.println(" ");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static ResultSet ejecutarUpdate(String sentencia) {

		try {
			 consulta.executeUpdate(sentencia);
			 System.out.println("Modificacion Guardada");
		}catch (Exception e) {
			System.out.println(e.getMessage());

		}

		return resultado;
	}

	public static ResultSet EjecutarSentencia(String sentencia) {
		
		try {
			resultado = consulta.executeQuery(sentencia);
		}catch (Exception e) {
			System.out.println(e.getMessage());

		}

		return resultado;
	}
	


}
