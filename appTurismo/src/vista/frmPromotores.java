 package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Promotores;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;

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
	private JTextField txtCamEli;
	Promotores pro = new Promotores();
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
		setBounds(100, 100, 863, 373);
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
		btnGuardar.setBounds(309, 212, 89, 23);
		contentPane.add(btnGuardar);
		
		JLabel lblTipoDocumento = new JLabel("TIPO DOCUMENTO:");
		lblTipoDocumento.setBounds(20, 117, 101, 14);
		contentPane.add(lblTipoDocumento);
		
		txtNunDoc = new JTextField();
		txtNunDoc.setColumns(10);
		txtNunDoc.setBounds(434, 80, 86, 20);
		contentPane.add(txtNunDoc);
		
		JLabel lblNombre = new JLabel("NOMBRE:");
		lblNombre.setBounds(371, 114, 46, 14);
		contentPane.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(434, 111, 86, 20);
		contentPane.add(txtNombre);
		
		JLabel lblDireccion = new JLabel("CORREO PERSONAL:");
		lblDireccion.setBounds(36, 177, 112, 14);
		contentPane.add(lblDireccion);
		
		txtCorreoPer = new JTextField();
		txtCorreoPer.setColumns(10);
		txtCorreoPer.setBounds(128, 180, 86, 20);
		contentPane.add(txtCorreoPer);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setBounds(65, 216, 46, 14);
		contentPane.add(lblTelefono);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(121, 213, 86, 20);
		contentPane.add(txtTelefono);
		
		JLabel lblNewLabel_5 = new JLabel("N.o DOCUMENTO:");
		lblNewLabel_5.setBounds(340, 80, 112, 14);
		contentPane.add(lblNewLabel_5);
		
		txtTipoDoc = new JTextField();
		txtTipoDoc.setColumns(10);
		txtTipoDoc.setBounds(126, 114, 89, 20);
		contentPane.add(txtTipoDoc);
		
		JLabel lblNewLabel_5_1 = new JLabel("APELLIDO:");
		lblNewLabel_5_1.setBounds(51, 148, 63, 14);
		contentPane.add(lblNewLabel_5_1);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(124, 145, 107, 20);
		contentPane.add(txtApellido);
		
		JLabel lblNewLabel_5_2 = new JLabel("CORREO CORP:");
		lblNewLabel_5_2.setBounds(325, 168, 112, 14);
		contentPane.add(lblNewLabel_5_2);
		
		txtCorreoCorp = new JTextField();
		txtCorreoCorp.setColumns(10);
		txtCorreoCorp.setBounds(431, 165, 131, 20);
		contentPane.add(txtCorreoCorp);
		
		JLabel lblIdVehiculo = new JLabel("ID PROMOTORES:");
		lblIdVehiculo.setBounds(31, 89, 101, 14);
		contentPane.add(lblIdVehiculo);
		
		txtIdPro = new JTextField();
		txtIdPro.setColumns(10);
		txtIdPro.setBounds(136, 86, 86, 20);
		contentPane.add(txtIdPro);
		
		JLabel lblIdVehiculo_1 = new JLabel("DIRECCION:");
		lblIdVehiculo_1.setBounds(340, 142, 72, 14);
		contentPane.add(lblIdVehiculo_1);
		
		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(430, 139, 86, 20);
		contentPane.add(txtDireccion);
		
		JLabel lblTablaDePromotores = new JLabel("TABLA DE PROMOTORES");
		lblTablaDePromotores.setBounds(314, 33, 164, 14);
		contentPane.add(lblTablaDePromotores);
		
		JLabel lblIdDeLa_1 = new JLabel("REGISTRO BD");
		lblIdDeLa_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblIdDeLa_1.setBounds(636, 167, 148, 14);
		contentPane.add(lblIdDeLa_1);
		
		JButton btnEliminar = new JButton("ELIMINAR ");
		btnEliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Promotores pro = new Promotores();
				pro.eliminar(Integer.parseInt(txtCamEli.getText()));
			}
			
	
		});
		btnEliminar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\ADSO CAICEDO\\icons8-eliminar-24.png"));
		btnEliminar.setBounds(659, 212, 113, 23);
		contentPane.add(btnEliminar);
		
		txtCamEli = new JTextField();
		txtCamEli.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//aquiiiiiiiiiiii jtex
				
				txtCamEli.setText(txtIdPro.getText());
			}
		});
		txtCamEli.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		txtCamEli.setColumns(10);
		txtCamEli.setBounds(605, 236, 141, 32);
		contentPane.add(txtCamEli);
		JButton btnNewButtonConsultar = new JButton("");
		btnNewButtonConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButtonConsultar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pro.consultar(Integer.parseInt(txtCamEli.getText()), txtTipoDoc,txtNunDoc , txtNombre, txtApellido, txtDireccion, txtCorreoPer, txtCorreoCorp, txtTelefono);
				
				txtIdPro.setText(txtCamEli.getText());
				
				 
				
			}
		});
		btnNewButtonConsultar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\icons8-magnifying-glass-tilted-right-48.png"));
		btnNewButtonConsultar.setBounds(570, 192, 89, 41);
		contentPane.add(btnNewButtonConsultar);
		
		JButton btnModificar = new JButton("MODIFICAR");
		btnModificar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\intercambiar-documentos (1).png"));
		btnModificar.setBounds(659, 190, 130, 23);
		contentPane.add(btnModificar);

		
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					txtIdPro.setText(txtCamEli.getText());
					pro.modificar(Integer.parseInt(txtIdPro.getText()),txtTipoDoc.getText() ,Integer.parseInt(txtNunDoc.getText()),txtNombre.getText(),txtApellido.getText(),txtDireccion.getText(),txtCorreoPer.getText(),txtCorreoPer.getText(),txtTelefono.getText());
					
				
					
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
