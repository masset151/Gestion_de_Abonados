package Modelo;
import java.awt.HeadlessException;
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


	public Abonados() {

	}
	
	

	public Abonados(int idAbonado, String nombre, String apellido1, String apellido2, int codzona, int codsector,
			String direcion, String telefono, int clave, Object[] fila) throws HeadlessException {
		this.idAbonado = idAbonado;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.codzona = codzona;
		this.codsector = codsector;
		this.direcion = direcion;
		this.telefono = telefono;
		this.clave = clave;
		this.fila = fila;
	}

	public static ArrayList<Abonado> ListarAbonados() {
		ConectarBD.Conectar();
		ResultSet resultados = ConectarBD.EjecutarSentencia("SELECT * FROM abonado");
		ArrayList<Abonado> abonados = new Controlador.Helper().resultsetAbonado(resultados);
		return abonados;


	}

	public void InsertarAbonado(int idAbonado, String nombre, String apellido1, String apellido2, int codzona,
			String direcion, String telefono, int clave,int codsector) {



		int aleatorio1 = (int) (Math.random()*10)+1;
		int aleatorio2 = (int) (Math.random()*10)+1;

		idAbonado = GeneralID();
/*
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

*/

		clave = codzona+codsector+aleatorio1+aleatorio2;

		ConectarBD.Conectar();

		ConectarBD.ejecutarUpdate("INSERT INTO ABONADO VALUES ('"+idAbonado+"','"+nombre+"','"+apellido1+"','"+apellido2+"','"+codzona+"','"+direcion+"','"+telefono+"','"+clave+"','"+codsector+"')");
		ConectarBD.ejecutarUpdate("INSERT INTO ZONA_ABONADO VALUES ('"+idAbonado+"','"+codzona+"','"+codsector+"')");
		
		System.out.println("Abonado añadido");
	}



	public int GeneralID()  {
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

	public static void BorrarAbonado(int num) {
		ConectarBD.Conectar();
		ConectarBD.ejecutarUpdate("DELETE FROM ZONA_ABONADO WHERE ID_ABONADO ="+num);
		ConectarBD.ejecutarUpdate("DELETE FROM ABONADO WHERE ID_ABONADO = "+num);
		System.out.println("Borrado");
	}

	public static  ArrayList<Abonado> ListarAbonados(int zona) {
		ConectarBD.Conectar();
		ResultSet resultados = ConectarBD.EjecutarSentencia("SELECT * FROM abonado WHERE codzona ="+zona);
		ArrayList<Abonado> abonados = new Controlador.Helper().resultsetAbonado(resultados);
		return abonados;

		

	}

	@Override
	public String toString() {
		return "Abonados [idAbonado=" + idAbonado + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2="
				+ apellido2 + ", codzona=" + codzona + ", codsector=" + codsector + ", direcion=" + direcion
				+ ", telefono=" + telefono + ", clave=" + clave + ", fila=" + Arrays.toString(fila) + "]";
	}



}
