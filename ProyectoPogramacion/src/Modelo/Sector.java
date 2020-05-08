package Modelo;

import java.sql.ResultSet;

import BBDD.ConectarBD;

public class Sector {

	private int codsector;
	private String sector;
	private int codzona;
	
	
	public void ListarSectores() {
		ConectarBD.Conectar();
		ResultSet selectAll = ConectarBD.EjecutarSentencia("SELECT * FROM SECTOR");
		
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
