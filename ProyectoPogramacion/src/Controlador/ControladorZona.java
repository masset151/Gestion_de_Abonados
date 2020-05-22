package Controlador;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ControladorZona {

	public static void ImprimirListadoAbonados(ResultSet rs) throws IOException {
		File f = new File("ListaAbonado.txt");
		FileWriter fw = new FileWriter(f);
		int idabonado = 0;
		String nombre,apellido1,apellido2;
		int codzona,codsector = 0;


		try {
			//fw.write("ID_ABONADO \t NOMBRE \t APELLIDO 1 \t APELLIDO 2 \t CODZONA \t CODSECTOR \n");
			while(rs.next()) {
				idabonado = rs.getInt("ID_ABONADO");
				 nombre = rs.getString("NOMBRE");
				 apellido1 = rs.getString("APELLIDO1");
				 apellido2 = rs.getString("APELLIDO2");
				 codzona = rs.getInt("CODZONA");
				 codsector = rs.getInt("CODSECTOR");
				 
				 fw.write(idabonado+"\t"+nombre+"\t"+apellido1+"\t"+apellido2+"\t"+codzona+"\t"+codsector+"\n");
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			fw.close();
			Desktop fichero = Desktop.getDesktop();
			fichero.open(new File("ListaAbonado.txt"));
		}

	}

}
