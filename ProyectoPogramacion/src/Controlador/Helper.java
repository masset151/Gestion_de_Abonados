package Controlador;

import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import BBDD.ConectarBD;
import Beans.Abonado;
import Beans.AbonadoZona;

public class Helper {

	ArrayList<Abonado> arraylist ;
	static ArrayList<AbonadoZona>abonadosZona;
	public ArrayList<Abonado> resultsetAbonado(ResultSet rs){
		arraylist = new ArrayList<Abonado>();

		try {

			while (rs.next()) {
				int idAbonado = rs.getInt("id_abonado");
				String nombre = rs.getString("nombre");
				String apellido1 = rs.getString("apellido1");
				String apellido2 = rs.getString("apellido2");
				int codzona = rs.getInt("codzona");
				String direcion = rs.getString("DIRECCION");
				String telefono = rs.getString("Telefono");
				int clave = rs.getInt("clave");
				int codsector = rs.getInt("codsector");

				arraylist.add(new Abonado(idAbonado,nombre,apellido1,apellido2,codzona,direcion,telefono,clave,codsector));
			}




		}catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Error en la consulta");
		}
		System.out.println(arraylist.size());
		return arraylist;

	}


	public ArrayList<Abonado> resultsetAbonado(ResultSet rs,int zona) {
		arraylist = new ArrayList<Abonado>();

		try {

			while (rs.next()) {
				int idAbonado = rs.getInt("id_abonado");
				String nombre = rs.getString("nombre");
				String apellido1 = rs.getString("apellido1");
				String apellido2 = rs.getString("apellido2");
				int codzona = rs.getInt("codzona");
				String direcion = rs.getString("DIRECCION");
				String telefono = rs.getString("Telefono");
				int clave = rs.getInt("clave");
				int codsector = rs.getInt("codsector");

				arraylist.add(new Abonado(idAbonado,nombre,apellido1,apellido2,codzona,direcion,telefono,clave,codsector));
			}




		}catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Error en la consulta");
		}
		System.out.println(arraylist.size());
		return arraylist;


	}



	public static ArrayList<AbonadoZona> AbonadosZona(ResultSet rs) {
		abonadosZona = new ArrayList<AbonadoZona>();

		try {

			while (rs.next()) {
				int numabonados = rs.getInt("num_abonados");
				String ubicacion = rs.getString("UBICACION");


				abonadosZona.add(new AbonadoZona(numabonados,ubicacion));
			}




		}catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Error en la consulta");
		}
		System.out.println(abonadosZona.size());
		return abonadosZona;


	}






}







