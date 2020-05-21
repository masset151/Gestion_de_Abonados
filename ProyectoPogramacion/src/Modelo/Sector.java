package Modelo;

import java.sql.ResultSet;
import java.util.ArrayList;

import BBDD.ConectarBD;

public class Sector {

	private int codsector;
	private String sector;
	private int codzona;
	
	
	public  static ArrayList<Beans.Sector> listarSectores() {
		ConectarBD.Conectar();
		ResultSet rs = ConectarBD.EjecutarSentencia("SELECT * FROM SECTOR");
		ArrayList<Beans.Sector> sector = new Controlador.Helper().Sector(rs);
		return sector;
		
	}
	
	public  static ArrayList<Beans.Sector> listarSectores(int num) {
		ConectarBD.Conectar();
		ResultSet rs = ConectarBD.EjecutarSentencia("SELECT * FROM SECTOR WHERE codzona="+num);
		ArrayList<Beans.Sector> sector = new Controlador.Helper().Sector(rs);
		return sector;
		
	}
	
	
	public void ListarSectores(int num) {
		ConectarBD.Conectar();
		ResultSet selectAll = ConectarBD.EjecutarSentencia("SELECT * FROM SECTOR where codzona ="+num);
		
		try {
			System.out.println("codsector"+"\t"+"sector"+"\t"+"codzona");
			while(selectAll.next()) {
				codsector = selectAll.getInt("codsector");
				sector = selectAll.getString("sector");
				codzona = selectAll.getInt("codzona");
				
				
				System.out.println(codsector+"\t"+sector+"\t"+codzona);
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	
}
