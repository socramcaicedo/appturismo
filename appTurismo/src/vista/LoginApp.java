package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Promotores;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class LoginApp extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtdocumento;
	private JPasswordField txtcontraseña;
	Promotores pro = new Promotores();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginApp frame = new LoginApp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 408, 316);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("INICIO DE SESION");
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		lblNewLabel.setBounds(162, 25, 239, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblUsuario = new JLabel("USUARIO");
		lblUsuario.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		lblUsuario.setBounds(40, 80, 96, 21);
		contentPane.add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("CONTRASEÑA");
		lblContrasea.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		lblContrasea.setBounds(7, 153, 129, 21);
		contentPane.add(lblContrasea);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				pro.Usuario(Integer.parseInt(txtdocumento.getText()),txtcontraseña.getText());
				
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\acceso.png"));
		btnNewButton.setBounds(315, 209, 36, 40);
		contentPane.add(btnNewButton);
		
		txtdocumento = new JTextField();
		txtdocumento.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtdocumento.setBounds(124, 71, 135, 30);
		contentPane.add(txtdocumento);
		txtdocumento.setColumns(10);
		
		txtcontraseña = new JPasswordField();
		txtcontraseña.setBounds(124, 153, 150, 21);
		contentPane.add(txtcontraseña);
	}
}
