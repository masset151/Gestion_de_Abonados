package Vista;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

import Modelo.Sector;
import Modelo.Zona;

public class TablaSector extends JFrame {
Sector sector = new Sector();
private JTable tabla;
DefaultTableModel modelo;
Object[] fila = new Object[3];

public TablaSector() {
	Sector datos = new Sector();
	modelo = new DefaultTableModel();
	tabla = new JTable(modelo);
	ArrayList<Beans.Sector> sector ;
	sector = Sector.listarSectores();
	Sector[] fila = new Sector[sector.size()];
	
	
	modelo.addColumn("CODSector");
	modelo.addColumn("Sector");
	modelo.addColumn("CodZona");
	
	
	JScrollPane sp = new JScrollPane(tabla); 
	add(sp);

	
	setSize(500, 200); 
	setVisible(true); 
	
	for (int i = 0; i < sector.size(); i++) {
		modelo.addRow((new Object[] {sector.get(i).getCodsector(),sector.get(i).getSector(),sector.get(i).getCodzona()}));
	}
	

}

public TablaSector(int num) {
	Sector datos = new Sector();
	modelo = new DefaultTableModel();
	tabla = new JTable(modelo);
	ArrayList<Beans.Sector> sector ;
	sector = Sector.listarSectores(num);
	Sector[] fila = new Sector[sector.size()];
	
	
	modelo.addColumn("CODSector");
	modelo.addColumn("Sector");
	modelo.addColumn("CodZona");
	
	
	JScrollPane sp = new JScrollPane(tabla); 
	add(sp);

	
	setSize(500, 200); 
	setVisible(true); 
	
	for (int i = 0; i < sector.size(); i++) {
		modelo.addRow((new Object[] {sector.get(i).getCodsector(),sector.get(i).getSector(),sector.get(i).getCodzona()}));
	}
	

}



}
