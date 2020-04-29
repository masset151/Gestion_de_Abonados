package Controlador;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import Modelo.Abonados;

public class Main {

	public static void main(String[] args) throws SQLException {
		Abonados abonado = new Abonados();
		
		
		
		System.out.println("Todos los Abonados");
		
		abonado.ListarAbonados();
		
		System.out.println("Solo los de la Campana");
		abonado.ListarAbonados(1);
		
		System.out.println("Solo los de la Calle Sierpes");
		abonado.ListarAbonados(2);







	}





}
