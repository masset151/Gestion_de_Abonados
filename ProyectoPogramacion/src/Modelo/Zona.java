package Modelo;

import java.sql.ResultSet;
import java.util.ArrayList;

import BBDD.ConectarBD;
import Beans.Abonado;

public class Zona {
	private int codzona;
	private String ubicacion;


	public static ArrayList<Beans.Zona> ListarZonas() {
		ConectarBD.Conectar();
		ResultSet resultados = ConectarBD.EjecutarSentencia("SELECT * FROM zona");
		ArrayList<Beans.Zona> zona = new Controlador.Helper().Zona(resultados);
		return zona;


	}

}
