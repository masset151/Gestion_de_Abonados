package Beans;

public class Sector {

	private int codsector;
	private String sector;
	private int codzona;
	
	
	public Sector(int codsector, String sector, int codzona) {
		this.codsector = codsector;
		this.sector = sector;
		this.codzona = codzona;
	}
	
	
	
	public int getCodsector() {
		return codsector;
	}
	public void setCodsector(int codsector) {
		this.codsector = codsector;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public int getCodzona() {
		return codzona;
	}
	public void setCodzona(int codzona) {
		this.codzona = codzona;
	}






}
