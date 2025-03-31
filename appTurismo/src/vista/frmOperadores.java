package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Operadores;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
		setBounds(100, 100, 608, 300);
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
		
		JLabel lblTipoDocumento = new JLabel("TIPO DOCUMENT0O");
		lblTipoDocumento.setBounds(40, 43, 107, 14);
		contentPane.add(lblTipoDocumento);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(101, 72, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblDireccion = new JLabel("Direccion:");
		lblDireccion.setBounds(96, 109, 72, 14);
		contentPane.add(lblDireccion);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setBounds(101, 149, 46, 14);
		contentPane.add(lblTelefono);
		
		JLabel lblNewLabel_5 = new JLabel("N.o documento:");
		lblNewLabel_5.setBounds(360, 43, 86, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("Apellidos:");
		lblNewLabel_5_1.setBounds(400, 72, 46, 14);
		contentPane.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_2 = new JLabel("Correo Electronico:");
		lblNewLabel_5_2.setBounds(345, 100, 101, 14);
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
		txtDireccion.setBounds(164, 106, 86, 20);
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
	}
}
