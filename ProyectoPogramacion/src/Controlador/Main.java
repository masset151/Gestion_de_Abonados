package Controlador;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import javax.crypto.spec.SecretKeySpec;

import Modelo.Abonados;
import Modelo.Sector;

public class Main {

	public static void main(String[] args) throws SQLException {
		Abonados abonado = new Abonados();
		Sector sector = new Sector();
		
		sector.ListarSectores(1);
		
		
		
		System.out.println("Todos los Abonados");
		
		abonado.ListarAbonados();
		
		System.out.println("Solo los de la Campana");
		abonado.ListarAbonados(1);
		
		System.out.println("Solo los de la Calle Sierpes");
		abonado.ListarAbonados(2);







	}





}
