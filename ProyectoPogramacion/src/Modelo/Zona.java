package Modelo;

import java.sql.ResultSet;

import Controlador.ConectarBD;

public class Zona {
	private int codzona;
	private String ubicacion;


	public void listarZona() {
		ConectarBD.Conectar();
		ResultSet selectAll	= ConectarBD.EjecutarSentencia("SELECT * FROM ZONA");
		try {
			
			System.out.println("codzona"+"\t"+"ubicacion");
			
			while(selectAll.next()) {
				codzona = selectAll.getInt("codzona");
				ubicacion = selectAll.getString("ubicacion");
				
				System.out.println(codzona+"\t"+ubicacion);
			}

		}catch (Exception e) {
			// TODO: handle exception
		}
		

	}

}
