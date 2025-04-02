package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.TipoVehiculo;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class frmTipoVehiculo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField txtnombre;
	private JTextField txtdescripcion;

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
		setBounds(100, 100, 485, 300);
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
	}
}
