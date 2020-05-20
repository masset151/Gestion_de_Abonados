package Vista;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Beans.Abonado;
import Modelo.Abonados;
import Modelo.Zona;

public class tablazona extends JFrame {

	Zona zona = new Zona();
	private JTable tabla;
	DefaultTableModel modelo;
	Object[] fila = new Object[2];
	
	
	
	public tablazona() {
		Zona datos = new Zona();
		modelo = new DefaultTableModel();
		tabla = new JTable(modelo);
		ArrayList<Beans.Zona> zona ;
		zona = Zona.ListarZonas();
		Zona[] fila = new Zona[zona.size()];
		
		//fila = zona.toArray(fila);
		
		
	

	
	
	modelo.addColumn("codzona");
	modelo.addColumn("ubicacion");
	
	
	
	JScrollPane sp = new JScrollPane(tabla); 
	add(sp);

	
	setSize(500, 200); 
	setVisible(true); 
	
	
	
		for (int i = 0; i < zona.size(); i++) {
			modelo.addRow((new Object[] {zona.get(i).getCodzona(),zona.get(i).getUbicacion()}));
		}

	
	
	}
	
	
	
}
