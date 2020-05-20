package Vista;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
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
	private JMenu menu1,menu2,menu3,menu4;
	private JMenuItem menuItem1,menuItem2,MenuItem3,MenuItem4,menuItem5,menuItem6,menuItem7;
	private JLabel labelzona,labelconsejo,labeleliminar,labelImprimir;
	private JTextField zona;
	private JTable registros;
	private JTable tabla;
	private JButton boton,boton1,boton2,registrar,imprimir;
	private JPanel panel;
	DefaultTableModel modelo;
	String datos;
	int num;
	
	
	ImageIcon iconobtn = new ImageIcon("src/Imagenes/nuevousuario.png");
	ImageIcon iconoimpr = new ImageIcon("src/Imagenes/imprimir.png");
	ImageIcon banner = new ImageIcon("src/Imagenes/consejo.png");
	
	public Ventana() {
		LayoutManager grid = new GridLayout(0,1);
		
		setSize(800, 500);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		menubar = new JMenuBar();
		menubar.setLayout(grid);
		setJMenuBar(menubar);
		menubar.setSize(350,250);
		
		
		
		menu1 = new JMenu("Abonados");
		menubar.add(menu1);
		
		menu3 = new JMenu("Zona");
		menubar.add(menu3);
		
		
		menu2= new JMenu("Gestionar");
		menu1.add(menu2);
		
		menuItem7 = new JMenuItem("Ver Zonas");
		menu3.add(menuItem7);
		
		
		menuItem1 = new JMenuItem("Ver todos los abonados");
		menu2.add(menuItem1);
		
		menuItem1.addActionListener(this);
		
		menuItem2 = new JMenuItem("Listar Abonado por Zona");
		menu2.add(menuItem2);
		MenuItem4 = new JMenuItem("Eliminar Abonado");
		menu2.add(MenuItem4);
		menuItem5 = new JMenuItem("Resumen de Abonados por Zona");
		menu2.add(menuItem5);
		
		menuItem1.addActionListener(this);
		menuItem2.addActionListener(this);
		MenuItem4.addActionListener(this);
		menuItem5.addActionListener(this);
		menuItem7.addActionListener(this);
		
		labelconsejo = new JLabel();
		labelzona = new JLabel();
		labeleliminar = new JLabel();
		
		labelconsejo.setText("Consejo General de Hermandad y Cofradias");
		labelconsejo.setBounds(115,350, 480, 60);
		
		getContentPane().add(labelconsejo);
		
		
		labelImprimir = new JLabel("inserte el numero del abonado");
		labelImprimir.setBounds(200, 30, 220, 100);
		getContentPane().add(labelImprimir);
		labelImprimir.setVisible(false);
		
		labelzona.setText("Introduzca el codigo de la zona");
		labelzona.setBounds(200, 100, 640, 480);
		getContentPane().add(labelzona);
		labelzona.setVisible(false);
		
		labeleliminar.setText("Introduzca el codigo del abonado que desee eliminar");
		labeleliminar.setBounds(150, 30, 360, 100);
		
		getContentPane().add(labeleliminar);
		labeleliminar.setVisible(false);
		
		zona = new JTextField();
		zona.setBounds(200,130,100,30);
		getContentPane().add(zona);
		zona.setVisible(false);
	
		boton = new JButton("Enviar");
		boton.setBounds(200,470,120,20);
		add(boton);
		getContentPane().add(boton);
		boton.addActionListener(this);
		boton.setVisible(false);
		
		boton1 = new JButton("Eliminar");
		boton1.setBounds(190, 210, 120, 20);
		add(boton1);
		boton1.addActionListener(this);
		boton1.setVisible(false);
		
		boton2 = new JButton("Imprimir");
		boton2.setBounds(190, 210, 120, 20);
		add(boton2);
		boton2.addActionListener(this);
		boton2.setVisible(false);
		
		registrar = new JButton("Añadir");
		registrar.setBounds(100, 70, 200, 150);
		add(registrar);
		
		imprimir = new JButton("Imprimir Abono");
		imprimir.setBounds(390,70,200,150);
		add(imprimir);
		
		
		
	
		
		registrar.setIcon(iconobtn);
        registrar.setIconTextGap(2);
        registrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registrar.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        registrar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        registrar.setVerticalTextPosition(javax.swing.SwingConstants.CENTER);
        
    	Icon icono = new ImageIcon(iconobtn.getImage().getScaledInstance(registrar.getWidth(), registrar.getHeight(), Image.SCALE_DEFAULT));
		registrar.setIcon(icono);
		this.repaint();
        
		registrar.addActionListener(this);
		
		imprimir.setIcon(iconoimpr);
        imprimir.setIconTextGap(2);
        imprimir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imprimir.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        imprimir.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        imprimir.setVerticalTextPosition(javax.swing.SwingConstants.CENTER);
        
        imprimir.addActionListener(this);
        
    	Icon icono1 = new ImageIcon(iconoimpr.getImage().getScaledInstance(imprimir.getWidth(), imprimir.getHeight(), Image.SCALE_DEFAULT));
		imprimir.setIcon(icono1);
		this.repaint();
        
		registrar.addActionListener(this);
		
		labelconsejo.setIcon(banner);
        labelconsejo.setIconTextGap(2);
        labelconsejo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelconsejo.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        labelconsejo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        labelconsejo.setVerticalTextPosition(javax.swing.SwingConstants.CENTER);
        
    	Icon icono2 = new ImageIcon(banner.getImage().getScaledInstance(labelconsejo.getWidth(), labelconsejo.getHeight(), Image.SCALE_DEFAULT));
		labelconsejo.setIcon(icono2);
		this.repaint();
       
		
		 
	      
		
	}
	

	
	
	@Override
	public void actionPerformed(ActionEvent e)  {
		
		
		if(e.getSource()==registrar) {
			
			AñadirAbonado abonado = new AñadirAbonado();
			
		}
		
		if(e.getSource()==menuItem2) {
			labelconsejo.setVisible(false);
			labeleliminar.setVisible(false);
			registrar.setVisible(false);
			imprimir.setVisible(false);
			labelzona.setVisible(true);
			zona.setVisible(true);
			boton.setVisible(true);
			

			
			






		}if(e.getSource()==boton) {
			
			datos = zona.getText();
			num = Integer.parseInt(datos);
			
			
			tablaAbonados abonado = new tablaAbonados(num);
			
			labelconsejo.setVisible(true);
			labeleliminar.setVisible(false);
			registrar.setVisible(true);
			imprimir.setVisible(true);
			labelzona.setVisible(false);
			zona.setVisible(false);
			boton.setVisible(false);
			
			
		}
		
		
		if(e.getSource()==menuItem1) {
			tablaAbonados tabla = new tablaAbonados();

		}
		
		
		if(e.getSource()==MenuItem4) {
			labeleliminar.setVisible(true);
			labelImprimir.setVisible(false);
			boton2.setVisible(false);
			labelconsejo.setVisible(false);
			registrar.setVisible(false);
			imprimir.setVisible(false);
			zona.setVisible(true);
			boton1.setVisible(true);
		
		}if(e.getSource()==boton1) {
			 datos = zona.getText();
			 int num1 = Integer.parseInt(datos);
			 Controlador.ControladorAbonado.deleteUser(num1);
			 labeleliminar.setVisible(false);
			 zona.setVisible(false);
			 boton1.setVisible(false);
			 registrar.setVisible(true);
			 imprimir.setVisible(true);
			 
		}

		
		if(e.getSource()==menuItem5) {
			labelconsejo.setVisible(false);
			tablaAbonados abonado = new tablaAbonados(true);
		}
				
		
		if(e.getSource()==imprimir) {
			labeleliminar.setVisible(false);
			boton1.setVisible(false);
			labelconsejo.setVisible(false);
			registrar.setVisible(false);
			imprimir.setVisible(false);
			labelImprimir.setVisible(true);
			zona.setVisible(true);
			boton2.setVisible(true);
			
			
		}if(e.getSource()==boton2) {
			
			String datos = zona.getText();
			int num = Integer.parseInt(datos);
			labelconsejo.setVisible(true);
			registrar.setVisible(true);
			imprimir.setVisible(true);
			labelImprimir.setVisible(false);
			zona.setVisible(false);
			boton2.setVisible(false);
			
			
			
			try {
				
				Modelo.Abonados.imprimirAbono(num);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
			
		if(e.getSource()==menuItem7) {
			tablazona zona = new tablazona();
		}
			
			
			
			
		}


	
			
			
				
					
				
				
				
			
			
			
			
			
		
	}
	

	
	



