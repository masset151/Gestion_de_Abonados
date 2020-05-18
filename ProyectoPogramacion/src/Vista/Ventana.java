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

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.xml.soap.Text;

import BBDD.ConectarBD;
import Controlador.ControladorAbonado;
import Modelo.Abonados;

public class Ventana extends JFrame implements ActionListener{
	private JMenuBar menubar;
	private JMenu menu1,menu2,menu3;
	private JMenuItem menuItem1,menuItem2,MenuItem3,MenuItem4;
	private JLabel labelzona,labelconsejo,labeleliminar;
	private JTextField zona;
	private JTable registros;
	private JTable tabla;
	private JButton boton,boton1;
	DefaultTableModel modelo;
	String datos;
	int num;
	
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
		
		menuItem2 = new JMenuItem("Listar Abonado por Zona");
		menu2.add(menuItem2);
		MenuItem3 = new JMenuItem("Añadir Abonados");
		menu2.add(MenuItem3);
		MenuItem4 = new JMenuItem("Eliminar Abonado");
		menu2.add(MenuItem4);
		
		menuItem1.addActionListener(this);
		menuItem2.addActionListener(this);
		MenuItem3.addActionListener(this);
		MenuItem4.addActionListener(this);
		
		labelconsejo = new JLabel();
		labelzona = new JLabel();
		labeleliminar = new JLabel();
		
		labelconsejo.setText("Consejo General de Hermandad y Cofradias");
		labelconsejo.setBounds(200, 100, 640, 480);
		getContentPane().add(labelconsejo);
		
		
		
		
		labelzona.setText("Introduzca el codigo de la zona");
		labelzona.setBounds(200, 100, 640, 480);
		getContentPane().add(labelzona);
		labelzona.setVisible(false);
		
		labeleliminar.setText("Introduzca el codigo del abonado que desee eliminar");
		labeleliminar.setBounds(200, 100, 640, 480);
		getContentPane().add(labeleliminar);
		labeleliminar.setVisible(false);
		
		zona = new JTextField();
		zona.setBounds(200,370,120,20);
		getContentPane().add(zona);
		zona.setVisible(false);
	
		boton = new JButton("Enviar");
		boton.setBounds(200,470,120,20);
		add(boton);
		getContentPane().add(boton);
		boton.addActionListener(this);
		boton.setVisible(false);
		
		boton1 = new JButton("Eliminar");
		boton1.setBounds(200, 470, 120, 20);
		add(boton1);
		boton1.addActionListener(this);
		boton1.setVisible(false);
		
		
		
		

		
		
		 
	      
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e)  {
		
		
		if(e.getSource()==MenuItem3) {
			
			AñadirAbonado abonado = new AñadirAbonado();
			
		}
		
		if(e.getSource()==menuItem2) {
			labelconsejo.setVisible(false);
			labelzona.setVisible(true);
			zona.setVisible(true);
			boton.setVisible(true);
			

			
			






		}if(e.getSource()==boton) {
			
			datos = zona.getText();
			num = Integer.parseInt(datos);
			tablaAbonados abonado = new tablaAbonados(num);
			
		}
		
		
		if(e.getSource()==menuItem1) {
			tablaAbonados tabla = new tablaAbonados();

		}
		
		if(e.getSource()==MenuItem4) {
			labeleliminar.setVisible(true);
			labelconsejo.setVisible(false);
			zona.setVisible(true);
			boton1.setVisible(true);
		}if(e.getSource()==boton1) {
			 datos = zona.getText();
			 int num1 = Integer.parseInt(datos);
			 Controlador.ControladorAbonado.deleteUser(num1);
		}

				
			
			
			
			
			
		}


	
			
			
				
					
				
				
				
			
			
			
			
			
		
	}
	

	
	



