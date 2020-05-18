package Vista;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AñadirAbonado extends JFrame implements ActionListener {
	
	JFrame frame;
	JPanel paneliz,panelde,panelab,panelar,panelex;
	    JLabel nombre,apellido1,apellido2,telefono,direcion;
	    JTextField text1,text2,text3,text4,text5;
	    JButton boton1,boton2;
	    JComboBox<String> zona,sector;
	    
	    int numzona,numsector;
	    int plazasrestantes;


	public AñadirAbonado() {
 
		
		paneliz  = new JPanel();
        panelde  = new JPanel();
        panelab  = new JPanel();
        panelar  = new JPanel();
        panelex = new JPanel();
        nombre = new JLabel();
        apellido1 = new JLabel();
        apellido2 = new JLabel();
        telefono = new JLabel();
        direcion = new JLabel();
    	text1 = new JTextField();
		text2 = new JTextField();
		text3 = new JTextField();
		text4 = new JTextField();
		text5 = new JTextField();
		zona = new JComboBox<String>();
		sector = new JComboBox<String>();
		
		 boton1 = new JButton();
	     boton2 = new JButton();
	     
	     
		
		setTitle("Añadir Abonados");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);
		setSize(1080,720);
		
		
		
		
		nombre.setText("Nombre");
		apellido1.setText("Apellido1");
        apellido2.setText("Apellido2");
		direcion.setText("telefono");
		telefono.setText("Direction");
		
		zona.addItem("La Campana");
		
		sector.addItem("Palquillo");
		sector.addItem("Tribuna A");
		sector.addItem("Tribuna B");
		sector.addItem("Plaza del Duque");
		sector.addItem("Sierpes");
		sector.addItem("Sector A");
		sector.addItem("Sector B");
		sector.addItem("Sector C");
		sector.addItem("Palcos Avenida");
		sector.addItem("Banco de España");
		sector.addItem("Tramo 40");
		sector.addItem("Tramo 50");
		sector.addItem("Tramo 60");
		sector.addItem("Tramo 70");
		sector.addItem("Fuente");
		sector.addItem("Catedral");
		
		zona.addItem("Sierpes");
		zona.addItem("Plaza de San Francisco");
		zona.addItem("Avenida de la Constitucion");
		zona.addItem("Plaza Virgen de los Reyes");

		
		

		
		
		boton1.setText("Enviar");
		boton2.setText("Cancelar");
		
		
		

		
		 paneliz.setLayout(new GridLayout(4,4));
	        paneliz.add(nombre);
	        paneliz.add(apellido1);
	        paneliz.add(apellido2);
	        paneliz.add(telefono);
	        paneliz.add(direcion);
	        
	         
	        panelde.setLayout(new GridLayout(4,4));
	        panelde.add(text1);
	        panelde.add(text2);
	        panelde.add(text3);
	        panelde.add(text4);
	        panelde.add(text5);
	        panelde.add(zona);
	        panelde.add(sector);
	       
	        panelar.setLayout(new GridLayout(1,1));
	        panelar.setPreferredSize(new Dimension(540,100));
	        panelar.add(paneliz);
	        panelar.add(panelde);
	        
	                 
	        panelab.setLayout(new FlowLayout());
	        panelab.setPreferredSize(new Dimension(200,50));
	        boton1.addActionListener(this);
	        panelab.add(boton1);
	        panelab.add(boton2);
	      
	        panelex.setLayout(new GridLayout(2,0));
	        panelex.add(panelar);
	        panelex.add(panelab);
	        
 
	        add(panelex);
	        
	        


	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		
			if(e.getSource()==boton1) {
				
				
				String nom = text1.getText();
				String ap1 = text2.getText();
				String ap2 = text3.getText();
				String dire = text4.getText();
				String tele = text5.getText();
				
				String selecionado = (String)zona.getSelectedItem();
				
				
				if("Campana".equals(selecionado)) {
					numzona = 1;
					
					
					
				
				}
				
				
				if("Sierpes".equals(selecionado)) {
					numzona =2;
					numsector = 4;
					
				
				}
				if("Plaza de San Francisco".equals(selecionado)) {
					numzona =3;
					
				
				}
				
				if("Avenida de la Constitucion".equals(selecionado)) {
					numzona =4;
					
				
				}
				
				if("Plaza Virgen de los Reyes".equals(selecionado)) {
					numzona =5;
					
				
				}
				
				
				
				
				String sectosel = (String) sector.getSelectedItem();
				
				if("Palquillo".equals(sectosel)) {
					
					
					numzona = 1;
					numsector = 0;
					
					
					
					
					System.out.println(sectosel);
				}if("Tribuna A".equals(sectosel)) {
					numzona = 1;
					numsector = 1;
					System.out.println(sectosel);
				}if("Tribuna B".equals(sectosel)) {
					numzona = 1;
					numsector = 2;
					System.out.println(sectosel);
				}if("Plaza del Duque".equals(sectosel)) {
					numzona = 1;
					numsector = 3	;
					System.out.println(sectosel);
				}if("Sector A".equals(sectosel)) {
					numzona = 3;
					numsector = 5;
				}if("Sector B".equals(sectosel)) {
					numzona = 3;
					numsector = 6;
				}if("Sector C".equals(sectosel)) {
					numzona = 3;
					numsector = 7;
				}if("Palcos Avenida".equals(sectosel)) {
					numzona = 4;
					numsector = 8;
				}if("Banco de España".equals(sectosel)) {
					numzona = 4;
					numsector = 9;
				}if("Tramo 40".equals(sectosel)) {
					numzona = 4;
					numsector = 10;
				}if("Tramo 50".equals(sectosel)) {
					numzona = 4;
					numsector = 11;
				}if("Tramo 60".equals(sectosel)) {
					numzona = 4;
					numsector = 12;
				}if("Tramo 70".equals(sectosel)) {
					numzona = 4;
					numsector = 13;
				}if("Fuente".equals(sectosel)) {
					numzona = 5;
					numsector = 14;
				}if("Catedral".equals(sectosel)) {
					numzona = 5;
					numsector = 15;
				}
				
				
				
				
				
				new Controlador.ControladorAbonado().insertUser(nom, ap1, ap2,numzona, dire, tele,numsector);
				System.out.println("Datos Recogidos"+nom);
				
			}
		
			
		
	}





}
