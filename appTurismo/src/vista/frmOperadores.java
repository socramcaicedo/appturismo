package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Operadores;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class frmOperadores extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTpD;
	private JTextField txtNombre;
	private JTextField txtDireccion;
	private JTextField txtTelefono;
	private JTextField txtNumDoc;
	private JTextField txtApellidos;
	private JTextField txtCorreo;
	private JTextField txtIdVehiculo;
	private JTextField txtCamEli;
	Operadores ope= new Operadores();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmOperadores frame = new frmOperadores();
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
	public frmOperadores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 839, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnGuardar = new JButton("REGISTRAR");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
							
				//aquii
				Operadores operador = new Operadores(Integer.parseInt(txtNumDoc.getText()),txtTpD.getText(), txtNombre.getText(),txtApellidos.getText(),txtDireccion.getText(),txtCorreo.getText(),Integer.parseInt(txtTelefono.getText()),Integer.parseInt(txtIdVehiculo.getText()));
				operador.insertar(txtTpD.getText(),Integer.parseInt(txtNumDoc.getText()),	 txtNombre.getText(),txtApellidos.getText(),txtDireccion.getText(),txtCorreo.getText(),Integer.parseInt(txtTelefono.getText()),Integer.parseInt(txtIdVehiculo.getText()));
			txtApellidos.setText("");
			txtCorreo.setText("");
			txtDireccion.setText(" ");
			txtIdVehiculo.setText(" ");
			txtNombre.setText(" ");
			txtNumDoc.setText(" ");
			txtTelefono.setText(" ");
			txtTpD.setText(" ");
			}
		});
		btnGuardar.setActionCommand("REGISTRAR");
		btnGuardar.setBounds(266, 227, 89, 23);
		contentPane.add(btnGuardar);
		
		JLabel lblNewLabel = new JLabel("TABLA OPERADORES");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel.setBounds(225, 11, 170, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblTipoDocumento = new JLabel("TIPO DOCUMENTO:");
		lblTipoDocumento.setBounds(10, 43, 137, 14);
		contentPane.add(lblTipoDocumento);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(81, 72, 66, 14);
		contentPane.add(lblNombre);
		
		JLabel lblDireccion = new JLabel("Direccion:");
		lblDireccion.setBounds(96, 109, 72, 14);
		contentPane.add(lblDireccion);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setBounds(81, 149, 66, 14);
		contentPane.add(lblTelefono);
		
		JLabel lblNewLabel_5 = new JLabel("N.o documento:");
		lblNewLabel_5.setBounds(360, 43, 86, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("Apellidos:");
		lblNewLabel_5_1.setBounds(386, 72, 60, 14);
		contentPane.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_2 = new JLabel("Correo Electronico:");
		lblNewLabel_5_2.setBounds(322, 100, 124, 14);
		contentPane.add(lblNewLabel_5_2);
		
		txtTpD = new JTextField();
		txtTpD.setBounds(164, 43, 86, 20);
		contentPane.add(txtTpD);
		txtTpD.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(164, 69, 86, 20);
		contentPane.add(txtNombre);
		
		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(164, 106, 148, 20);
		contentPane.add(txtDireccion);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(157, 146, 86, 20);
		contentPane.add(txtTelefono);
		
		txtNumDoc = new JTextField();
		txtNumDoc.setColumns(10);
		txtNumDoc.setBounds(451, 40, 112, 20);
		contentPane.add(txtNumDoc);
		
		txtApellidos = new JTextField();
		txtApellidos.setColumns(10);
		txtApellidos.setBounds(456, 69, 107, 20);
		contentPane.add(txtApellidos);
		
		txtCorreo = new JTextField();
		txtCorreo.setColumns(10);
		txtCorreo.setBounds(451, 97, 131, 20);
		contentPane.add(txtCorreo);
		
		txtIdVehiculo = new JTextField();
		txtIdVehiculo.setColumns(10);
		txtIdVehiculo.setBounds(451, 146, 86, 20);
		contentPane.add(txtIdVehiculo);
		
		JLabel lblIdVehiculo = new JLabel("ID vehiculo:");
		lblIdVehiculo.setBounds(361, 149, 72, 14);
		contentPane.add(lblIdVehiculo);
		
		JButton btnEliminar = new JButton("ELIMINAR ");
		btnEliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Operadores ope= new Operadores(Integer.parseInt(txtCamEli.getText()));
				ope.eliminar(Integer.parseInt(txtCamEli.getText()));
				
			}
		});
		btnEliminar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\ADSO CAICEDO\\icons8-eliminar-24.png"));
		btnEliminar.setBounds(700, 131, 113, 23);
		contentPane.add(btnEliminar);
		
		JLabel lblIdDeLa_1 = new JLabel("REGISTRO BD");
		lblIdDeLa_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblIdDeLa_1.setBounds(648, 90, 148, 14);
		contentPane.add(lblIdDeLa_1);
		
		txtCamEli = new JTextField();
		txtCamEli.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		txtCamEli.setColumns(10);
		txtCamEli.setBounds(629, 160, 141, 32);
		contentPane.add(txtCamEli);
		
		JLabel lblIdOperador = new JLabel("ID OPERADOR");
		lblIdOperador.setBounds(660, 196, 107, 14);
		contentPane.add(lblIdOperador);
		
		JButton btnNewButtonConsultar = new JButton("");
		btnNewButtonConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButtonConsultar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			ope.consultar(Integer.parseInt(txtCamEli.getText()),txtTpD, txtNumDoc,  txtNombre, txtApellidos, txtDireccion, txtCorreo, txtTelefono, txtIdVehiculo);
			
				
				 
				
			}
		});
		btnNewButtonConsultar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\icons8-magnifying-glass-tilted-right-48.png"));
		btnNewButtonConsultar.setBounds(601, 115, 89, 41);
		contentPane.add(btnNewButtonConsultar);
	
		
		
		JButton btnModificar = new JButton("MODIFICAR");
		btnModificar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\intercambiar-documentos (1).png"));
		btnModificar.setBounds(693, 105, 130, 23);
		contentPane.add(btnModificar);

		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				ope.modoficar(Integer.parseInt(txtCamEli.getText()),txtTpD.getText(),Integer.parseInt(txtNumDoc.getText()), txtNombre.getText(),txtApellidos.getText(),txtDireccion.getText(),txtCorreo.getText(),Integer.parseInt(txtTelefono.getText()),Integer.parseInt(txtIdVehiculo.getText()));
				
					
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "ID inválido.");
				}
			}
		});
		
	}
}
