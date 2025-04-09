package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Agencias;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.ImageIcon;

public class frmAgencias extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNomAgencia;
	private JTextField textIdAgencia;
	private JTextField textIdComp;
	private JTextField textCorreo;
	private JTextField textTelefono;
	private JTextField textDireccion;
	private JTextField textweb;
	private JTextField txtCamEli;
	Agencias agen =new Agencias();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmAgencias frame = new frmAgencias();
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
	public frmAgencias() {
		setTitle("REGISTRAR AGENCIA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 705, 566);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NOMBRE DE LA AGENCIA");
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setToolTipText("");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 45, 438, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblIdDeLa = new JLabel("ID DE LA AGENCIA");
		lblIdDeLa.setForeground(new Color(0, 0, 0));
		lblIdDeLa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIdDeLa.setBounds(10, 92, 438, 14);
		contentPane.add(lblIdDeLa);
		
		JLabel lblIdDeLa_1 = new JLabel("ID DE LA COMPAÑIA ASOCIADA");
		lblIdDeLa_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIdDeLa_1.setBounds(10, 152, 438, 14);
		contentPane.add(lblIdDeLa_1);
		
		JLabel lblCorreo = new JLabel("CORREO");
		lblCorreo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCorreo.setBounds(10, 199, 438, 23);
		contentPane.add(lblCorreo);
		
		JLabel lblTelefono = new JLabel("TELEFONO");
		lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTelefono.setBounds(10, 274, 438, 23);
		contentPane.add(lblTelefono);
		
		JLabel lblDireccionWeb = new JLabel("DIRECCION WEB");
		lblDireccionWeb.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDireccionWeb.setBounds(10, 391, 438, 23);
		contentPane.add(lblDireccionWeb);
		
		JLabel lblDireecion = new JLabel("DIREECION");
		lblDireecion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDireecion.setBounds(10, 333, 438, 23);
		contentPane.add(lblDireecion);
		
		textNomAgencia = new JTextField();
		textNomAgencia.setBounds(10, 60, 438, 32); 
		contentPane.add(textNomAgencia);
		textNomAgencia.setColumns(10);
		
		textIdAgencia = new JTextField();
		textIdAgencia.setColumns(10);
		textIdAgencia.setBounds(10, 110, 438, 32);
		contentPane.add(textIdAgencia);
		
		textIdComp = new JTextField();
		textIdComp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtCamEli.setText(textIdAgencia.getText());
				
			}
		});
		textIdComp.setColumns(10);
		textIdComp.setBounds(10, 165, 438, 32);
		contentPane.add(textIdComp);
		
		textCorreo = new JTextField();
		textCorreo.setColumns(10);
		textCorreo.setBounds(10, 221, 438, 32);
		contentPane.add(textCorreo);
		
		textTelefono = new JTextField();
		textTelefono.setColumns(10);
		textTelefono.setBounds(10, 299, 438, 32);
		contentPane.add(textTelefono);
		
		textDireccion = new JTextField();
		textDireccion.setColumns(10);
		textDireccion.setBounds(10, 357, 438, 32);
		contentPane.add(textDireccion);
		
		textweb = new JTextField();
		textweb.setColumns(10);
		textweb.setBounds(10, 416, 438, 32);
		contentPane.add(textweb);
		
		JButton btnGuardar =  new JButton("REGISTRAR");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			//aquiii	
				Agencias agen =new Agencias(Integer.parseInt(textIdAgencia.getText()),Integer.parseInt(textIdComp.getText()),textNomAgencia.getText(),textDireccion.getText(),textCorreo.getText(),textTelefono.getText(),textweb.getText());
				
				agen.insertar(Integer.parseInt(textIdAgencia.getText()),Integer.parseInt(textIdComp.getText()),textNomAgencia.getText(),textDireccion.getText(),textCorreo.getText(),textTelefono.getText(),textweb.getText());
				
			}
		});
		
		btnGuardar.setBounds(201, 472, 89, 23);
		contentPane.add(btnGuardar);
		
		JButton btnEliminar = new JButton("ELIMINAR ");
		btnEliminar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\ADSO CAICEDO\\icons8-eliminar-24.png"));
		btnEliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//aquiiiii
				Agencias agen =new Agencias();
           agen.eliminar(Integer.parseInt(txtCamEli.getText()));
          
				
			}
		});
		btnEliminar.setBounds(470, 226, 114, 23);
		contentPane.add(btnEliminar);
		
		JLabel lblIdDeLa_1_1 = new JLabel("REGISTRO");
		lblIdDeLa_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblIdDeLa_1_1.setBounds(520, 183, 148, 14);
		contentPane.add(lblIdDeLa_1_1);
		
		JLabel lblIdDeLa_1_1_1 = new JLabel("AGENCIA");
		lblIdDeLa_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblIdDeLa_1_1_1.setBounds(572, 299, 72, 14);
		contentPane.add(lblIdDeLa_1_1_1);
		
		txtCamEli = new JTextField();
		txtCamEli.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		txtCamEli.setColumns(10);
		txtCamEli.setBounds(527, 260, 141, 32);
		contentPane.add(txtCamEli);
		
		JButton btnNewButtonConsultar = new JButton("");
		btnNewButtonConsultar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Agencias agen =new Agencias();
				agen.consultar(Integer.parseInt(txtCamEli.getText()),textNomAgencia ,textIdComp, textDireccion, textCorreo, textTelefono, textweb);
				
				 
				
			}
		});
		btnNewButtonConsultar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\icons8-magnifying-glass-tilted-right-48.png"));
		btnNewButtonConsultar.setBounds(590, 208, 89, 41);
		contentPane.add(btnNewButtonConsultar);
		
		

		JButton btnModificar = new JButton("MODIFICAR");
		btnModificar.setBounds(559, 245, 120, 23);
		contentPane.add(btnModificar);
		
		JButton btnNewButton = new JButton("REGRESAR");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Menu sale = new Menu ();
				sale.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(548, 11, 120, 23);
		contentPane.add(btnNewButton);

		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
				

					agen.modificar(Integer.parseInt(textIdAgencia.getText()),Integer.parseInt(textIdComp.getText()),textNomAgencia.getText(),
							textDireccion.getText(),textCorreo.getText(),textTelefono.getText(),textweb.getText());

					
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "ID inválido.");
				}
			}
		});
		
		
	}
}
