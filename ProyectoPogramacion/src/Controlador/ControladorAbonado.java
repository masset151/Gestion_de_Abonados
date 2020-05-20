package Controlador;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

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
	
	public static void countAbonado() {
		Modelo.Abonados.ContarAbonados();
	}
	

	
	
	public static void ImprimirAbono(ResultSet rs) throws IOException {
		File f = new File("Abono.md");
		FileWriter fw = new FileWriter(f);
		int codabonado = 0;
		int codzona = 0;
		int codsector = 0;
		
		
		try {
			while(rs.next()) {
				 codabonado = rs.getInt("id_abonado");
				 codzona = rs.getInt("codzona");
				 codsector = rs.getInt("codsector");
			
				 fw.write("**CodigoAbonado "+codabonado+"**\n-- Codigo Zona "+codzona+"\n    - Codigo Sector "+codsector);
				 
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}finally {
			fw.close();
			Desktop fichero = Desktop.getDesktop();
			fichero.open(new File("abono.md"));
		
		}
		
		
		
		
		
		
	}
	
}
