package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.TipoVehiculo;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class frmTipoVehiculo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField txtnombre;
	private JTextField txtdescripcion;
	private JTextField txtCamEli;
	TipoVehiculo tpVehiculo = new TipoVehiculo();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmTipoVehiculo frame = new frmTipoVehiculo();
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
	public frmTipoVehiculo() {
		setTitle("TIPO DE VEHICULO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 729, 300);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TIPO DE VEHICULO:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(172, 11, 145, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNombreDeTipo = new JLabel("NOMBRE DE TIPO DE VEHICULO");
		lblNombreDeTipo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNombreDeTipo.setBounds(28, 69, 207, 24);
		contentPane.add(lblNombreDeTipo);
		
		JLabel lblDescripcion = new JLabel("DESCRIPCION");
		lblDescripcion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDescripcion.setBounds(28, 133, 89, 24);
		contentPane.add(lblDescripcion);
		
		txtnombre = new JTextField();
		txtnombre.setColumns(10);
		txtnombre.setBounds(89, 89, 325, 20);
		contentPane.add(txtnombre);
		
		txtdescripcion = new JTextField();
		txtdescripcion.setColumns(10);
		txtdescripcion.setBounds(89, 155, 325, 48);
		contentPane.add(txtdescripcion);
		
		JButton btnGuardar = new JButton("REGISTRAR");
		btnGuardar.setActionCommand("REGISTRAR");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				//AQUI VA LA VUELTA
				TipoVehiculo tpVehiculo = new TipoVehiculo(txtnombre.getText(),txtdescripcion.getText());
				
				tpVehiculo.insertar(txtnombre.getText(),txtdescripcion.getText());
				txtnombre.setText("");
				txtdescripcion.setText("");
				
				
			}
		});
	
		btnGuardar.setBounds(184, 214, 89, 23);
		contentPane.add(btnGuardar);
		
		JLabel lblIdDeLa_1 = new JLabel(" REGISTRO BD");
		lblIdDeLa_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblIdDeLa_1.setBounds(492, 69, 148, 14);
		contentPane.add(lblIdDeLa_1);
		
		JButton btnEliminar = new JButton("ELIMINAR ");
		btnEliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TipoVehiculo tpVehiculo = new TipoVehiculo(Integer.parseInt(txtCamEli.getText()));
				
				tpVehiculo.eliminar(Integer.parseInt(txtCamEli.getText()));
				
				
			}
		});
		btnEliminar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\ADSO CAICEDO\\icons8-eliminar-24.png"));
		btnEliminar.setBounds(580, 108, 113, 23);
		contentPane.add(btnEliminar);
		
		txtCamEli = new JTextField();
		txtCamEli.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		txtCamEli.setColumns(10);
		txtCamEli.setBounds(499, 128, 141, 32);
		contentPane.add(txtCamEli);
		
		JLabel lblIdTipoVehiculo = new JLabel("ID TIPO VEHICULO");
		lblIdTipoVehiculo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIdTipoVehiculo.setBounds(509, 165, 148, 24);
		contentPane.add(lblIdTipoVehiculo);
		
		JButton btnNewButtonConsultar = new JButton("");
		btnNewButtonConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButtonConsultar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				tpVehiculo.consultar(Integer.parseInt(txtCamEli.getText()), txtnombre, txtdescripcion);
				
				 
				
			}
		});
		btnNewButtonConsultar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\icons8-magnifying-glass-tilted-right-48.png"));
		btnNewButtonConsultar.setBounds(481, 89, 89, 41);
		contentPane.add(btnNewButtonConsultar);
		
		JButton btnModificar = new JButton("MODIFICAR");
		btnModificar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\intercambiar-documentos (1).png"));
		btnModificar.setBounds(574, 88, 130, 23);
		contentPane.add(btnModificar);

		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					tpVehiculo.modificar(Integer.parseInt(txtCamEli.getText()) ,txtnombre.getText(),txtdescripcion.getText());
					
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
