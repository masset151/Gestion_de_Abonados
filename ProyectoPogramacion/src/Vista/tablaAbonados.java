package Vista;

import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane; 
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import BBDD.ConectarBD;
import Beans.Abonado;
import Controlador.Helper;
import Modelo.Abonados; 
public class tablaAbonados extends JFrame {

	Abonados abonados = new Abonados();
	private JTable tabla;
	DefaultTableModel modelo;
	Object[] fila = new Object[9];

	// Constructor 
	public tablaAbonados() { 
Abonado datos = new Abonado();
		modelo = new DefaultTableModel();
		tabla = new JTable(modelo);
		ArrayList<Abonado> abonado ;
		abonado = Abonados.ListarAbonados();
		Abonado[] fila = new Abonado[abonado.size()];
		
		fila = abonado.toArray(fila);
		
		
	

	// Column Names 
	
	modelo.addColumn("id_abonado");
	modelo.addColumn("nombre");
	modelo.addColumn("apellido1");
	modelo.addColumn("apellido2");
	modelo.addColumn("codzona");
	modelo.addColumn("direccion");
	modelo.addColumn("telefono");
	modelo.addColumn("clave");
	modelo.addColumn("codsector");

 
	JScrollPane sp = new JScrollPane(tabla); 
	add(sp);

	// adding it to JScrollPane 
	setSize(500, 200); 
	setVisible(true); 
	
	
	
		for (int i = 0; i < abonado.size(); i++) {
			modelo.addRow((new Object[] {abonado.get(i).getIdAbonado(),abonado.get(i).getNombre(),abonado.get(i).getApellido1(),abonado.get(i).getApellido2(),abonado.get(i).getCodzona(),abonado.get(i).getDirecion(),abonado.get(i).getTelefono(),abonado.get(i).getClave(),abonado.get(i).getCodsector()}));
		}

	
	
		
	
	
	
} 
	
	public tablaAbonados(int num) { 
		Abonado datos = new Abonado();
				modelo = new DefaultTableModel();
				tabla = new JTable(modelo);
				ArrayList<Abonado> abonado ;
				abonado = Abonados.ListarAbonados(num);
				Abonado[] fila = new Abonado[abonado.size()];
				
				fila = abonado.toArray(fila);
				
				
			

			// Column Names 
			
			modelo.addColumn("id_abonado");
			modelo.addColumn("nombre");
			modelo.addColumn("apellido1");
			modelo.addColumn("apellido2");
			modelo.addColumn("codzona");
			modelo.addColumn("direccion");
			modelo.addColumn("telefono");
			modelo.addColumn("clave");
			modelo.addColumn("codsector");

		 
			JScrollPane sp = new JScrollPane(tabla); 
			add(sp);

			// adding it to JScrollPane 
			setSize(500, 200); 
			setVisible(true); 
			
			
			
				for (int i = 0; i < abonado.size(); i++) {
					modelo.addRow((new Object[] {abonado.get(i).getIdAbonado(),abonado.get(i).getNombre(),abonado.get(i).getApellido1(),abonado.get(i).getApellido2(),abonado.get(i).getCodzona(),abonado.get(i).getDirecion(),abonado.get(i).getTelefono(),abonado.get(i).getClave(),abonado.get(i).getCodsector()}));
				}

			
			
				
			
			
			
		} 
	
	
	public tablaAbonados(String cod) { 
	
		int num = Integer.parseInt(cod);
		
		
		Abonado datos = new Abonado();
				modelo = new DefaultTableModel();
				tabla = new JTable(modelo);
				ArrayList<Abonado> abonado ;
				abonado = Abonados.ListarAbonados(num);
				Abonado[] fila = new Abonado[abonado.size()];
				
				fila = abonado.toArray(fila);
				
				
			

			// Column Names 
			
			modelo.addColumn("id_abonado");
			modelo.addColumn("nombre");
			modelo.addColumn("apellido1");
			modelo.addColumn("apellido2");
			modelo.addColumn("codzona");
			modelo.addColumn("direccion");
			modelo.addColumn("telefono");
			modelo.addColumn("clave");
			modelo.addColumn("codsector");

		 
			JScrollPane sp = new JScrollPane(tabla); 
			add(sp);

			// adding it to JScrollPane 
			setSize(500, 200); 
			setVisible(true); 
			
			
			
				for (int i = 0; i < abonado.size(); i++) {
					modelo.addRow((new Object[] {abonado.get(i).getIdAbonado(),abonado.get(i).getNombre(),abonado.get(i).getApellido1(),abonado.get(i).getApellido2(),abonado.get(i).getCodzona(),abonado.get(i).getDirecion(),abonado.get(i).getTelefono(),abonado.get(i).getClave(),abonado.get(i).getCodsector()}));
				}

			
			
				
			
			
			
		} 
	



}
