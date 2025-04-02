 package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Promotores;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class frmPromotores extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNunDoc;
	private JTextField txtNombre;
	private JTextField txtCorreoPer;
	private JTextField txtTelefono;
	private JTextField txtTipoDoc;
	private JTextField txtApellido;
	private JTextField txtCorreoCorp;
	private JTextField txtIdPro;
	private JTextField txtDireccion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmPromotores frame = new frmPromotores();
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
	public frmPromotores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 784, 373);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnGuardar = new JButton("REGISTRAR");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//aquiiii   
				
			Promotores pro = new Promotores(Integer.parseInt(txtIdPro.getText()),txtTipoDoc.getText() ,Integer.parseInt(txtNunDoc.getText()),txtNombre.getText(),txtApellido.getText(),txtDireccion.getText(),txtCorreoPer.getText(),txtCorreoPer.getText(),txtTelefono.getText());
				
				pro.insertar(Integer.parseInt(txtIdPro.getText()),txtTipoDoc.getText() ,Integer.parseInt(txtNunDoc.getText()),txtNombre.getText(),txtApellido.getText(),txtDireccion.getText(),txtCorreoPer.getText(),txtCorreoPer.getText(),txtTelefono.getText());
				
				
				
			}
		});
		btnGuardar.setActionCommand("REGISTRAR");
		btnGuardar.setBounds(345, 286, 89, 23);
		contentPane.add(btnGuardar);
		
		JLabel lblTipoDocumento = new JLabel("TIPO DOCUMENTO:");
		lblTipoDocumento.setBounds(131, 109, 101, 14);
		contentPane.add(lblTipoDocumento);
		
		txtNunDoc = new JTextField();
		txtNunDoc.setColumns(10);
		txtNunDoc.setBounds(529, 78, 86, 20);
		contentPane.add(txtNunDoc);
		
		JLabel lblNombre = new JLabel("NOMBRE:");
		lblNombre.setBounds(466, 112, 46, 14);
		contentPane.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(529, 109, 86, 20);
		contentPane.add(txtNombre);
		
		JLabel lblDireccion = new JLabel("CORREO PERSONAL:");
		lblDireccion.setBounds(131, 175, 112, 14);
		contentPane.add(lblDireccion);
		
		txtCorreoPer = new JTextField();
		txtCorreoPer.setColumns(10);
		txtCorreoPer.setBounds(239, 172, 86, 20);
		contentPane.add(txtCorreoPer);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setBounds(176, 215, 46, 14);
		contentPane.add(lblTelefono);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(232, 212, 86, 20);
		contentPane.add(txtTelefono);
		
		JLabel lblNewLabel_5 = new JLabel("N.o DOCUMENTO:");
		lblNewLabel_5.setBounds(435, 78, 112, 14);
		contentPane.add(lblNewLabel_5);
		
		txtTipoDoc = new JTextField();
		txtTipoDoc.setColumns(10);
		txtTipoDoc.setBounds(237, 106, 89, 20);
		contentPane.add(txtTipoDoc);
		
		JLabel lblNewLabel_5_1 = new JLabel("APELLIDO:");
		lblNewLabel_5_1.setBounds(162, 140, 63, 14);
		contentPane.add(lblNewLabel_5_1);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(235, 137, 107, 20);
		contentPane.add(txtApellido);
		
		JLabel lblNewLabel_5_2 = new JLabel("CORREO CORP:");
		lblNewLabel_5_2.setBounds(420, 166, 112, 14);
		contentPane.add(lblNewLabel_5_2);
		
		txtCorreoCorp = new JTextField();
		txtCorreoCorp.setColumns(10);
		txtCorreoCorp.setBounds(526, 163, 131, 20);
		contentPane.add(txtCorreoCorp);
		
		JLabel lblIdVehiculo = new JLabel("ID PROMOTORES:");
		lblIdVehiculo.setBounds(142, 81, 101, 14);
		contentPane.add(lblIdVehiculo);
		
		txtIdPro = new JTextField();
		txtIdPro.setColumns(10);
		txtIdPro.setBounds(247, 78, 86, 20);
		contentPane.add(txtIdPro);
		
		JLabel lblIdVehiculo_1 = new JLabel("DIRECCION:");
		lblIdVehiculo_1.setBounds(435, 140, 72, 14);
		contentPane.add(lblIdVehiculo_1);
		
		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(525, 137, 86, 20);
		contentPane.add(txtDireccion);
		
		JLabel lblTablaDePromotores = new JLabel("TABLA DE PROMOTORES");
		lblTablaDePromotores.setBounds(314, 33, 164, 14);
		contentPane.add(lblTablaDePromotores);
	}
}
