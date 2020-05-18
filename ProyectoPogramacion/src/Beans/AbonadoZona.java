package Beans;

public class AbonadoZona {
	private int numAbonados;
	private String zona;
	public AbonadoZona(int numAbonados, String zona) {
		this.numAbonados = numAbonados;
		this.zona = zona;
	}

	public AbonadoZona() {

	}
	public int getNumAbonados() {
		return numAbonados;
	}
	public void setNumAbonados(int numAbonados) {
		this.numAbonados = numAbonados;
	}
	public String getZona() {
		return zona;
	}
	public void setZona(String zona) {
		this.zona = zona;
	}




}
