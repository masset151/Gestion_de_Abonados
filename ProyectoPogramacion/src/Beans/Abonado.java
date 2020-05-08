package Beans;

public class Abonado {
	private	int idAbonado;
	private	String nombre;
	private	String apellido1;
	private	String apellido2;
	private	int codzona;
	private	int codsector;
	private	String direcion;
	private	String telefono;
	private	int clave;
	
	public Abonado() {
		
	}
	
	public Abonado(int idAbonado, String nombre, String apellido1, String apellido2, int codzona,
			String direcion, String telefono, int clave,int codsector) {
		super();
		this.idAbonado = idAbonado;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.codzona = codzona;
		this.direcion = direcion;
		this.telefono = telefono;
		this.clave = clave;
		this.codsector = codsector;
	}

	public int getIdAbonado() {
		return idAbonado;
	}

	public void setIdAbonado(int idAbonado) {
		this.idAbonado = idAbonado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
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

	public String getDirecion() {
		return direcion;
	}

	public void setDirecion(String direcion) {
		this.direcion = direcion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public int getClave() {
		return clave;
	}

	public void setClave(int clave) {
		this.clave = clave;
	}
	
	
	
	
	
}
