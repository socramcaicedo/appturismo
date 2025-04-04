package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Vehiculos;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class frmVehiculos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTpVehiculo;
	private JTextField txtMatricula;
	private JTextField txtCapacidad;
	private JTextField txtCatego;
	private JTextField txtIdVehiculo;
	private JTextField txtMarca;
	private JTextField txtModelo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmVehiculos frame = new frmVehiculos();
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
	public frmVehiculos() {
		setTitle("VEHICULOS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 629, 321);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBounds(10, 11, 592, 261);
		contentPane.add(contentPane_1);
		
		JButton btnGuardar = new JButton("REGISTRAR");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("unused")
			@Override
			public void mouseClicked(MouseEvent e) {
				Vehiculos vehiculo = new Vehiculos(Integer.parseInt(txtTpVehiculo.getText()),Integer.parseInt(txtIdVehiculo.getText()),Integer.parseInt(txtMatricula.getText()),txtMarca.getText()  ,txtCapacidad.getText(),txtModelo.getText(),txtCatego.getText());
				vehiculo.insertar(Integer.parseInt(txtTpVehiculo.getText()),Integer.parseInt(txtIdVehiculo.getText()),Integer.parseInt(txtMatricula.getText()),txtMarca.getText()  ,txtCapacidad.getText(),txtModelo.getText(),txtCatego.getText());
	         // txtCapacidad.setText(" ");
	         // txtCatego.setText(" ");
	         // txtIdVehiculo.setText(" ");
	         // txtMarca.setText(" ");
	         // txtMatricula.setText(" ");
	         // txtModelo.setText(" ");
	          //txtTpVehiculo.setText(" ");
			
			}
		});
		btnGuardar.setActionCommand("REGISTRAR");
		btnGuardar.setBounds(266, 227, 89, 23);
		contentPane_1.add(btnGuardar);
		
		JLabel lblTablaVehiculos = new JLabel("TABLA VEHICULOS");
		lblTablaVehiculos.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblTablaVehiculos.setBounds(225, 11, 170, 21);
		contentPane_1.add(lblTablaVehiculos);
		
		JLabel lblCodigoDeTipo = new JLabel("CODIGO DE TIPO VEHICULO:");
		lblCodigoDeTipo.setBounds(0, 43, 147, 14);
		contentPane_1.add(lblCodigoDeTipo);
		
		JLabel lblMatricula = new JLabel("MATRICULA:");
		lblMatricula.setBounds(76, 72, 110, 14);
		contentPane_1.add(lblMatricula);
		
		JLabel lblCapacidad = new JLabel("CAPACIDAD:");
		lblCapacidad.setBounds(96, 109, 72, 14);
		contentPane_1.add(lblCapacidad);
		
		JLabel lblNewLabel = new JLabel("CATEGORIA:");
		lblNewLabel.setBounds(76, 149, 71, 14);
		contentPane_1.add(lblNewLabel);
		
		JLabel lblNewLabel_5 = new JLabel("ID VEHICULO");
		lblNewLabel_5.setBounds(339, 46, 86, 14);
		contentPane_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("MARCA:");
		lblNewLabel_5_1.setBounds(359, 75, 46, 14);
		contentPane_1.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_2 = new JLabel("MODELO:");
		lblNewLabel_5_2.setBounds(364, 109, 61, 14);
		contentPane_1.add(lblNewLabel_5_2);
		
		txtTpVehiculo = new JTextField();
		txtTpVehiculo.setColumns(10);
		txtTpVehiculo.setBounds(164, 43, 86, 20);
		contentPane_1.add(txtTpVehiculo);
		
		txtMatricula = new JTextField();
		txtMatricula.setColumns(10);
		txtMatricula.setBounds(164, 69, 86, 20);
		contentPane_1.add(txtMatricula);
		
		txtCapacidad = new JTextField();
		txtCapacidad.setColumns(10);
		txtCapacidad.setBounds(164, 106, 86, 20);
		contentPane_1.add(txtCapacidad);
		
		txtCatego = new JTextField();
		txtCatego.setColumns(10);
		txtCatego.setBounds(157, 146, 86, 20);
		contentPane_1.add(txtCatego);
		
		txtIdVehiculo = new JTextField();
		txtIdVehiculo.setColumns(10);
		txtIdVehiculo.setBounds(410, 43, 112, 20);
		contentPane_1.add(txtIdVehiculo);
		
		txtMarca = new JTextField();
		txtMarca.setColumns(10);
		txtMarca.setBounds(415, 72, 107, 20);
		contentPane_1.add(txtMarca);
		
		txtModelo = new JTextField();
		txtModelo.setColumns(10);
		txtModelo.setBounds(412, 106, 131, 20);
		contentPane_1.add(txtModelo);
	}
}
