package Modelo;

import java.io.IOException;
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
	
	public static void ImprimirListadoAbonados(int codzona) throws IOException {
		ConectarBD.Conectar();
		ResultSet rs = ConectarBD.EjecutarSentencia("SELECT ID_ABONADO,NOMBRE,APELLIDO1,APELLIDO2,CODZONA,CODSECTOR FROM ABONADO WHERE CODZONA ="+codzona);
		Controlador.ControladorZona.ImprimirListadoAbonados(rs);
	}

}
