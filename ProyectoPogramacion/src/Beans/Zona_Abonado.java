package Beans;

public class Zona_Abonado {
	private int idabonado;
	private int codzona;
	private int codsector;

	public Zona_Abonado(int idabonado, int codzona, int codsector) {

		this.idabonado = idabonado;
		this.codzona = codzona;
		this.codsector = codsector;
	}


	public int getIdabonado() {
		return idabonado;
	}
	public void setIdabonado(int idabonado) {
		this.idabonado = idabonado;
	}
	public int getCodzona() {
		return codzona;
	}
	public void setCodzona(int codzona) {
		this.codzona = codzona;
	}
	public int getCodsector() {
		return codsector;
	}
	public void setCodsector(int codsector) {
		this.codsector = codsector;
	}



}
