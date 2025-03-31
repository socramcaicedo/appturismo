package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Clientes;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmClientes extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtid;
	private JTextField txtNombre;
	private JTextField txtApellidos;
	private JTextField txtCorreo;
	private JTextField txttelefono;
	private JTextField txtNumDocumento;
	private JTextField txtTipoDocumento;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmClientes frame = new frmClientes();
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
	public frmClientes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 691, 449);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnGuardar = new JButton("REGISTRAR");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//AQUIIII 
				//JOptionPane.showMessageDialog(null,+ String.valueOf(cboxTipoDocumento.ge));
				//JOptionPane.showConfirmDialog(null, String.valueOf(cboxTipoDocumento  ));
       Clientes cliente =new Clientes(Integer.parseInt(txtid.getText()),txtTipoDocumento.getText(),Integer.parseInt(txtNumDocumento.getText()),txtNombre.getText(),txtApellidos.getText(),txtCorreo.getText(),Integer.parseInt(txttelefono.getText()));
		cliente.insertar(Integer.parseInt(txtid.getText()),txtTipoDocumento.getText(),Integer.parseInt(txtNumDocumento.getText()),txtNombre.getText(),txtApellidos.getText(),txtCorreo.getText(),Integer.parseInt(txttelefono.getText()));
			}
		});
		btnGuardar.setActionCommand("REGISTRAR");
		btnGuardar.setBounds(563, 315, 89, 23);
		contentPane.add(btnGuardar);
		
		txtid = new JTextField();
		txtid.setBounds(194, 138, 104, 20);
		contentPane.add(txtid);
		txtid.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("ID CLIENTE");
		lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 14));
		lblNewLabel.setBounds(80, 135, 104, 23);
		contentPane.add(lblNewLabel);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(184, 238, 313, 20);
		contentPane.add(txtNombre);
		
		JLabel lblNomre = new JLabel("NOMBRE");
		lblNomre.setFont(new Font("Tahoma", Font.ITALIC, 14));
		lblNomre.setBounds(80, 235, 104, 23);
		contentPane.add(lblNomre);
		
		txtApellidos = new JTextField();
		txtApellidos.setColumns(10);
		txtApellidos.setBounds(194, 282, 313, 20);
		contentPane.add(txtApellidos);
		
		JLabel txtApellido = new JLabel("APELLIDO");
		txtApellido.setFont(new Font("Tahoma", Font.ITALIC, 14));
		txtApellido.setBounds(90, 279, 104, 23);
		contentPane.add(txtApellido);
		
		txtCorreo = new JTextField();
		txtCorreo.setColumns(10);
		txtCorreo.setBounds(194, 316, 313, 20);
		contentPane.add(txtCorreo);
		
		JLabel lblCorreo = new JLabel("CORREO");
		lblCorreo.setFont(new Font("Tahoma", Font.ITALIC, 14));
		lblCorreo.setBounds(90, 313, 104, 23);
		contentPane.add(lblCorreo);
		
		JLabel lblRegistroDeClientes = new JLabel("Registro de Clientes");
		lblRegistroDeClientes.setForeground(new Color(64, 0, 64));
		lblRegistroDeClientes.setVerticalAlignment(SwingConstants.TOP);
		lblRegistroDeClientes.setToolTipText("");
		lblRegistroDeClientes.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblRegistroDeClientes.setBounds(279, 11, 120, 23);
		contentPane.add(lblRegistroDeClientes);
		
		JLabel lblNewLabel_1_1 = new JLabel("TIPO DOCUMENTO");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.ITALIC, 14));
		lblNewLabel_1_1.setBounds(303, 135, 120, 23);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblCorreo_1 = new JLabel("TELEFONO:");
		lblCorreo_1.setFont(new Font("Tahoma", Font.ITALIC, 14));
		lblCorreo_1.setBounds(90, 347, 104, 23);
		contentPane.add(lblCorreo_1);
		
		txttelefono = new JTextField();
		txttelefono.setColumns(10);
		txttelefono.setBounds(194, 350, 313, 20);
		contentPane.add(txttelefono);
		
		JLabel lblNoDocoumento = new JLabel("No. DOCOUMENTO");
		lblNoDocoumento.setFont(new Font("Tahoma", Font.ITALIC, 14));
		lblNoDocoumento.setBounds(53, 201, 131, 23);
		contentPane.add(lblNoDocoumento);
		
		txtNumDocumento = new JTextField();
		txtNumDocumento.setColumns(10);
		txtNumDocumento.setBounds(184, 204, 171, 20);
		contentPane.add(txtNumDocumento);
		
		txtTipoDocumento = new JTextField();
		txtTipoDocumento.setColumns(10);
		txtTipoDocumento.setBounds(433, 135, 104, 20);
		contentPane.add(txtTipoDocumento);
	}
}
