package Vista;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Controlador.ControladorAbonado;

public class Registro extends JFrame  implements ActionListener{
	private JPanel paneliz,panelde,panelab,panelar,panelex;
	private JLabel usuario,contra,contra1;
	private JTextField text1;
	private JPasswordField text2,text3;
	private JButton boton;

	public Registro() {
		paneliz  = new JPanel();
		panelde  = new JPanel();
		panelab  = new JPanel();
		panelar  = new JPanel();
		panelex = new JPanel();
		usuario = new JLabel();
		contra = new JLabel();
		contra1 = new JLabel();

		text1 = new JTextField();
		text2 = new JPasswordField();
		text3 = new JPasswordField();
		boton = new JButton();

		setTitle("Registrar Usuario");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);
		setSize(1080,720);

		usuario.setText("Usuario");
		contra.setText("Contraseña");
		contra1.setText("confirmar_contraseña");

		boton = new JButton("Enviar");
		boton.setText("Enviar");

		paneliz.setLayout(new GridLayout(4,4));
		paneliz.add(usuario);
		paneliz.add(contra);
		paneliz.add(contra1);

		panelde.setLayout(new GridLayout(4,4));
		panelde.add(text1);
		panelde.add(text2);
		panelde.add(text3);


		panelar.setLayout(new GridLayout(1,1));
		panelar.setPreferredSize(new Dimension(540,100));
		panelar.add(paneliz);
		panelar.add(panelde);

		panelab.setLayout(new FlowLayout());
		panelab.setPreferredSize(new Dimension(200,50));
		boton.addActionListener(this);
		panelab.add(boton);


		panelex.setLayout(new GridLayout(2,0));
		panelex.add(panelar);
		panelex.add(panelab);


		add(panelex);


	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String user;
		String pass;
		String passCheck;
		
		
		



		if(e.getSource()==boton) {
			user = text1.getText();
			pass = text2.getText();
			Controlador.Usuarios.Registro(user, pass);
		}


			
		

	}

}
