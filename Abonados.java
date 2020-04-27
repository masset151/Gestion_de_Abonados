import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Abonados {
	
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

	protected void ListarAbonados() {

		ConectarBD.Conectar();

		ResultSet selectAll = ConectarBD.EjecutarSentencia("SELECT * FROM ABONADO");

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
			System.out.println("Elige Zona \n 0-Palquillo\n 1-Santa Maria de Gracia\n 2-Tribuna1,3-Tribuna2");
			codsector = teclado.nextInt();
			break;

		default:
			System.out.println(" No disponible");
			break;
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
	ConectarBD.ejecutarUpdate("DELETE FROM ZONA_ABONADO WHERE ID_ABONADO ="+num);
	ConectarBD.ejecutarUpdate("DELETE FROM ABONADO WHERE ID_ABONADO = "+num);
}


}