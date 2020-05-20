package Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Login extends JFrame implements ActionListener {

	private JPanel panel;
	private JTextField userimput;
	private JPasswordField contraimput;
	JButton login,registrarse;
	
	public Login() {
	setTitle("Iniciar Sesion"); 
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 setBounds(100, 100, 450, 300);
	 
	 panel = new JPanel();
	 panel.setBorder(new EmptyBorder(5,5,5,5));
	 panel.setLayout(new BorderLayout(0,0));
	 setContentPane(panel);
	 
	 JPanel pane = new JPanel();
	 panel.add(pane,BorderLayout.CENTER);
	 pane.setLayout(null);
	 
	 contraimput = new JPasswordField();
	 contraimput.setBounds(115,124,190,20);
	 pane.add(contraimput);
	 contraimput.setColumns(10);
	 
	 
	 userimput = new JTextField();
	 userimput.setBounds(115,62,190,20);
	 pane.add(userimput);
	 userimput.setColumns(10);
	 
	 JLabel usuario = new JLabel("Usuario");
	 usuario.setBounds(115, 37, 46, 14);
	 pane.add(usuario);
	 
	 JLabel contra = new JLabel("Contraseña");
	 contra.setBounds(115, 99, 76, 14);
	 pane.add(contra);
	 
	registrarse = new JButton("Registrarse");
	registrarse.setBounds(214, 168, 101, 23);
	pane.add(registrarse);
	 
	 
	 login = new JButton("Entrar");
	 login.setBounds(115,168,89,23);
	 pane.add(login);
	 
	 login.addActionListener(this);
	 registrarse.addActionListener(this);
	 
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String usuario;
		String contra;
		
		if(e.getSource()==login) {
			
			usuario = userimput.getText();
			contra = contraimput.getText();
			
			Controlador.Usuarios.login(usuario, contra);
		}
		
		if(e.getSource()==registrarse) {
			Registro registro = new Registro();
			registro.setVisible(true);
		}
	}
	
	
}
