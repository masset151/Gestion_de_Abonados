package Modelo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import BBDD.ConectarBD;
import Beans.Abonado;
import Controlador.Helper;
import Vista.tablaAbonados;

public class Abonados extends JFrame {

	static	Scanner teclado = new Scanner(System.in);
	private	int idAbonado;
	private	String nombre;
	private	String apellido1;
	private	String apellido2;
	private	int codzona;
	private	int codsector;
	private	String direcion;
	private	String telefono;
	private	int clave;
	public Object[] fila;
	
	
	
	public static ArrayList<Abonado> ListarAbonados() {
		ConectarBD.Conectar();
		ResultSet resultados = ConectarBD.EjecutarSentencia("SELECT * FROM abonado");
		ArrayList<Abonado> abonados = new Controlador.Helper().resultsetAbonado(resultados);
		return abonados;


	}

	protected void InsertarAbonado() {



		int aleatorio1 = (int) (Math.random()*10)+1;
		int aleatorio2 = (int) (Math.random()*10)+1;

		idAbonado = GeneralID();

		System.out.println("Inserte su nombre");
		nombre = teclado.next();

		System.out.println("Inserte su primer apellido");
		apellido1 = teclado.next();

		System.out.println("Inserte su segundo apellido");
		apellido2 = teclado.next();

		System.out.println("\nInserte su zona\n 1-La Campana\n 2-Sierpes\n 3-Plaza de San Francisco\n 4-Avenida de la Constitucion\n 5-Plaza Virgen de los Reyes");
		codzona = teclado.nextInt();

		System.out.println();

		System.out.println("inserte su direccion");
		System.out.println();
		System.out.println();
		direcion = teclado.next();

		System.out.println("Inserte su telefono");
		telefono = teclado.next();

		System.out.println("Inserte el codigo de su zona");

		switch (codzona) {
		case 1:
			System.out.println("Elige Zona \n 0-PALQUILLO\n 1-TRIBUNA A \n 2-TRIBUNA B \n 3-DUQUE");
			codsector = teclado.nextInt();
			break;

		case 2:
			System.out.println("la Calle sierpes solo tiene un sector el numero 4");
			codsector = 4;
			break;

		case 3:
			System.out.println("Elige Zona \n 5-SECTOR A \n 6-SECTOR B\n 7-SECTOR C");
			codsector = teclado.nextInt();
			break;

		case 4:
			System.out.println("Elige Zona \n 8-PALCOS AVENIDA \n 9-BANCO DE ESPAÑA \n 10-TRAMO 40\n 11-TRAMO 50\n 12- TRAMO 60 \n 13-TRAMO 70");
			codsector = teclado.nextInt();
			break;

		case 6:
			System.out.println("Elige Zona \n 14-FUENTE \n 15-CATEDRAL");
			codsector = teclado.nextInt();


		}



		clave = codzona+codsector+aleatorio1+aleatorio2;



		ConectarBD.ejecutarUpdate("INSERT INTO ABONADO VALUES ('"+idAbonado+"','"+nombre+"','"+apellido1+"','"+apellido2+"','"+codzona+"','"+direcion+"','"+telefono+"','"+clave+"','"+codsector+"')");
		ConectarBD.ejecutarUpdate("INSERT INTO ZONA_ABONADO VALUES ('"+idAbonado+"','"+codzona+"','"+codsector+"')");
	}



	private int GeneralID()  {
		ConectarBD.Conectar();

		ResultSet selectAll = ConectarBD.EjecutarSentencia("SELECT * FROM ABONADO");


		try {
			while(selectAll.next()) {
				idAbonado = selectAll.getInt("ID_ABONADO");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		idAbonado++;

		return idAbonado;
	}

	protected void BorrarAbonado() {
		System.out.println("Inserte la id del Abonado que se da de baja");
		int num = teclado.nextInt();
		ConectarBD.Conectar();
		ConectarBD.ejecutarUpdate("DELETE FROM ABONADO WHERE ID_ABONADO = "+num);
		ConectarBD.ejecutarUpdate("DELETE FROM ZONA_ABONADO WHERE ID_ABONADO ="+num);
	}

	public void ListarAbonados(int codzona) {
		ConectarBD.Conectar();
		ResultSet selectAll = ConectarBD.EjecutarSentencia("SELECT * FROM ABONADO WHERE CODZONA ="+codzona);
		System.out.println("ID_ABONADO\t NOMBRE \t Apellido \t Apellido2\t Direccion \t Zona \t Telefono \t Clave \t Sector");
		try {
			while(selectAll.next()) {

				idAbonado = selectAll.getInt("id_abonado");
				nombre = selectAll.getString("nombre");
				apellido1 = selectAll.getString("apellido1");
				apellido2 = selectAll.getString("apellido2");
				codzona = selectAll.getInt("codzona");
				direcion = selectAll.getString("DIRECCION");
				telefono = selectAll.getString("Telefono");
				clave = selectAll.getInt("clave");
				codsector = selectAll.getInt("codsector");

				System.out.println(idAbonado+"\t"+nombre+"\t"+apellido1+"\t"+apellido2+"\t"+direcion+"\t"+codzona+"\t"+telefono+"\t"+clave+"\t"+codsector);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

	@Override
	public String toString() {
		return "Abonados [idAbonado=" + idAbonado + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2="
				+ apellido2 + ", codzona=" + codzona + ", codsector=" + codsector + ", direcion=" + direcion
				+ ", telefono=" + telefono + ", clave=" + clave + ", fila=" + Arrays.toString(fila) + "]";
	}

	
	
}
