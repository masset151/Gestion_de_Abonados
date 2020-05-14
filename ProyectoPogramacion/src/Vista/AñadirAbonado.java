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
		zona.addItem("Sierpes");
		

		
		

		
		
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
				// Llamar al controlador
				
				String nom = text1.getText();
				String ap1 = text2.getText();
				String ap2 = text3.getText();
				String dire = text4.getText();
				String tele = text5.getText();
				
				
				if(zona.getSelectedItem().equals("La Campana")){

					if(sector.getSelectedItem().equals("Palquillo")) {
						
						numsector = 0;
						
					}if(sector.getSelectedItem().equals("Tribuna A")) {
						numsector = 1;
					}if (sector.getSelectedItem().equals("Tribuna B")) {
						numsector = 2;
					}if(sector.getSelectedItem().equals("Plaza del Duque")) {
						numsector = 3;
					}
					
				 
					
					
				}else {
					numzona = 0;
				}
				
				new Controlador.ControladorAbonado().insertUser(nom, ap1, ap2,numzona, dire, tele,numsector);
				System.out.println("Datos Recogidos"+nom);
				
			}
		
			
		
	}





}
