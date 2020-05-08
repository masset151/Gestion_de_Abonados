package Vista;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import BBDD.ConectarBD;
import Modelo.Abonados;

public class Ventana extends JFrame implements ActionListener{
	private JMenuBar menubar;
	private JMenu menu1,menu2,menu3;
	private JMenuItem menuItem1,menuItem2,MenuItem3,MenuItem4;
	private JLabel texto;
	private JTable registros;
	private JTable tabla;
	DefaultTableModel modelo;
	String datos;
	
	public Ventana() {
		LayoutManager grid = new GridLayout(0,1);
		
		setSize(1080, 720);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		menubar = new JMenuBar();
		menubar.setLayout(grid);
		setJMenuBar(menubar);
		menubar.setSize(350,250);
		
		
		
		menu1 = new JMenu("Abonados");
		menubar.add(menu1);
		
		menu2= new JMenu("Gestionar");
		menu1.add(menu2);
		
		
		menuItem1 = new JMenuItem("Ver todos los abonados");
		menu2.add(menuItem1);
		
		menuItem1.addActionListener(this);
		
		menuItem2 = new JMenuItem("Eliminar Abonado");
		menu2.add(menuItem2);
		
		menuItem1.addActionListener(this);
		
		texto = new JLabel();
		texto.setBounds(200, 100, 640, 480);
		getContentPane().add(texto);
		

		
		
		 //tabla = new JTable(modelo);
		
		
		 //getContentPane().add(tabla);
		
	      
		 String[][] data = { 
		            { "Kundan Kumar Jha", "4031", "CSE" }, 
		            { "Anand Jha", "6014", "IT" } 
		        }; 
		 
		 
		 String[] columnNames = { "Name", "Roll Number", "Department" }; 
	      
	      
	      tabla = new JTable(data,columnNames);
	      tabla.setBounds(30, 40, 200, 300); 
	      JScrollPane scrollPane = new JScrollPane(tabla);
	      add(scrollPane);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e)  {
		Abonados abonados = new Abonados();
		ConectarBD conectar = new ConectarBD();
		conectar.Conectar();
		ResultSet rs = ConectarBD.EjecutarSentencia("SELECT * FROM ABONADO") ;
		
		 
		
		
		if(e.getSource()==menuItem1) {
			tablaAbonados tabla = new tablaAbonados();

		}

				
				
			
			
			
			
		}
			
			
				
					
				
				
				
			
			
			
			
			
		
	}
	

	
	



