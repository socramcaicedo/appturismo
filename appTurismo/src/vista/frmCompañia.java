package vista;

import java.awt.EventQueue;
import Model.Compañia;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import javax.swing.ImageIcon;

public class frmCompañia extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nomComp;
	private JTextField idCom;
	private JTextField direcCom;
	private JTextField correo;
	private JTextField telefono;
	private JTextField fechCreacion;
	private JTextField direcWeb;
	private JLabel lblIdDeLa_1;
	private JButton btnEliminar;
	private JTextField txtCamEli;
	private JLabel lblNewLabel_1;
	Compañia compa = new Compañia();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmCompañia frame = new frmCompañia();
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
	public frmCompañia() {
		setTitle("REGISTRA NUEVA COMPAÑIA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 805, 421);
		contentPane = new JPanel();
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//aquiiiiiiiiiiiiiiiiii jtex
				txtCamEli.setText(idCom.getText());
			}
		});
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		nomComp = new JTextField();
		nomComp.setBounds(20, 29, 389, 20);
		contentPane.add(nomComp);
		nomComp.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("NOMBRE DE LA COMPAÑIA");
		lblNewLabel.setBounds(34, 14, 134, 14);
		contentPane.add(lblNewLabel);
		
		idCom = new JTextField();
		idCom.setColumns(10);
		idCom.setBounds(20, 72, 389, 20);
		contentPane.add(idCom);
		
		direcCom = new JTextField();
		direcCom.setColumns(10);
		direcCom.setBounds(20, 114, 389, 20);
		contentPane.add(direcCom);
		
		correo = new JTextField();
		correo.setColumns(10);
		correo.setBounds(20, 154, 389, 20);
		contentPane.add(correo);
		
		telefono = new JTextField();
		telefono.setColumns(10);
		telefono.setBounds(20, 195, 389, 20);
		contentPane.add(telefono);
		
		fechCreacion = new JTextField();
		fechCreacion.setColumns(10);
		fechCreacion.setBounds(20, 230, 389, 20);
		contentPane.add(fechCreacion);
		
		direcWeb = new JTextField();
		direcWeb.setColumns(10);
		direcWeb.setBounds(20, 276, 389, 20);
		contentPane.add(direcWeb);
		
		JLabel lblNewLabel_1_1 = new JLabel("DIRECCION");
		lblNewLabel_1_1.setBounds(20, 102, 134, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("CORREO");
		lblNewLabel_1_2.setBounds(20, 141, 134, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("TELEFONO");
		lblNewLabel_1_3.setBounds(20, 180, 134, 14);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("FECHA DE CREACION");
		lblNewLabel_1_4.setBounds(20, 218, 134, 14);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("DIRECCION WEB");
		lblNewLabel_1_5.setBounds(20, 261, 134, 14);
		contentPane.add(lblNewLabel_1_5);
		
		JButton btnGuardar = new JButton("REGISTRAR");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
		
				//AQUIII
				Compañia compa = new Compañia( nomComp.getText(),direcCom.getText(),correo.getText(),telefono.getText(),fechCreacion.getText(),direcWeb.getText());
				
				compa.insertar(nomComp.getText(),direcCom.getText(),correo.getText(),telefono.getText(),fechCreacion.getText(),direcWeb.getText());
				
								 
			}
		});
		btnGuardar.setBounds(152, 317, 89, 23);
		contentPane.add(btnGuardar);
		
		lblIdDeLa_1 = new JLabel("REGISTRO BD");
		lblIdDeLa_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblIdDeLa_1.setBounds(536, 156, 148, 14);
		contentPane.add(lblIdDeLa_1);
		
		btnEliminar = new JButton("ELIMINAR ");
		btnEliminar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\ADSO CAICEDO\\icons8-eliminar-24.png"));
		btnEliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//AQUIIIIIIIIIIIIIIIIIII BOTON
				Compañia compa = new Compañia(Integer.parseInt(txtCamEli.getText()));
				compa.eliminar(Integer.parseInt(txtCamEli.getText()));
			}
		});
		btnEliminar.setBounds(573, 214, 111, 23);
		contentPane.add(btnEliminar);
		
		txtCamEli = new JTextField();
		txtCamEli.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				txtCamEli.setText(idCom.getText());
			}
		});
		txtCamEli.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		txtCamEli.setColumns(10);
		txtCamEli.setBounds(499, 243, 141, 32);
		contentPane.add(txtCamEli);
		
		lblNewLabel_1 = new JLabel("ID COMPAÑIA");
		lblNewLabel_1.setBounds(20, 57, 134, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButtonConsultar = new JButton("");
		btnNewButtonConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButtonConsultar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				compa.consultar(Integer.parseInt(txtCamEli.getText()), nomComp, direcCom, telefono, fechCreacion, correo, direcWeb);
				
				 idCom.setText(txtCamEli.getText());
				
				 
				
			}
		});
		btnNewButtonConsultar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\icons8-magnifying-glass-tilted-right-48.png"));
		btnNewButtonConsultar.setBounds(474, 195, 89, 41);
		contentPane.add(btnNewButtonConsultar);
		

		JButton btnModificar = new JButton("MODIFICAR");
		btnModificar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\intercambiar-documentos (1).png"));
		btnModificar.setBounds(573, 194, 120, 23);
		contentPane.add(btnModificar);

		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					 idCom.setText(txtCamEli.getText());
				compa.modificar(Integer.parseInt(txtCamEli.getText())  ,nomComp.getText(),direcCom.getText(),correo.getText(),telefono.getText(),fechCreacion.getText(),direcWeb.getText());
					
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "ID inválido.");
				}
			}
		});
		
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
	}
	
	
	
}
