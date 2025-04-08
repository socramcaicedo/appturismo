package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Paquetes;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class frmPaquetes extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtIdDestino;
	private JTextField txtFechaVenta;
	private JTextField txtHoraSalida;
	private JTextField txtPrecio;
	private JTextField txtIdAgencia;
	private JTextField txtCliente;
	private JTextField txtFechaEjecucion;
	private JTextField txtHoraVenta;
	private JTextField txtIdOrigen;
	private JTextField txtObservacion;
	private JTextField txtIdVehiculo;
	private JTextField txtIdPromotor;
	private JTextField txtIdMedios;
	private JTextField txtCamEli;
	Paquetes paq = new Paquetes();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmPaquetes frame = new frmPaquetes();
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
	public frmPaquetes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 717, 330);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnGuardar = new JButton("REGISTRAR");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 Paquetes paq = new Paquetes();
				 paq.insertar(Integer.parseInt(txtIdDestino.getText()),Integer.parseInt(txtIdOrigen.getText()),txtFechaVenta.getText(),txtHoraVenta.getText(),txtHoraSalida.getText(),
	                        txtFechaEjecucion.getText(),txtObservacion.getText(),txtPrecio.getText(),Integer.parseInt(txtIdAgencia.getText()),Integer.parseInt(txtCliente.getText()),Integer.parseInt(txtIdMedios.getText()) ,
                            Integer.parseInt(txtIdPromotor.getText()),Integer.parseInt(txtIdVehiculo.getText()));
				
			}
		});
		btnGuardar.setActionCommand("REGISTRAR");
		btnGuardar.setBounds(208, 257, 89, 23);
		contentPane.add(btnGuardar);
		
		txtIdDestino = new JTextField();
		txtIdDestino.setColumns(10);
		txtIdDestino.setBounds(106, 36, 110, 20);
		contentPane.add(txtIdDestino);
		
		txtFechaVenta = new JTextField();
		txtFechaVenta.setColumns(10);
		txtFechaVenta.setBounds(106, 64, 110, 20);
		contentPane.add(txtFechaVenta);
		
		txtHoraSalida = new JTextField();
		txtHoraSalida.setColumns(10);
		txtHoraSalida.setBounds(104, 95, 112, 20);
		contentPane.add(txtHoraSalida);
		
		txtPrecio = new JTextField();
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(106, 130, 110, 20);
		contentPane.add(txtPrecio);
		
		txtIdAgencia = new JTextField();
		txtIdAgencia.setColumns(10);
		txtIdAgencia.setBounds(101, 170, 115, 20);
		contentPane.add(txtIdAgencia);
		
		txtCliente = new JTextField();
		txtCliente.setColumns(10);
		txtCliente.setBounds(359, 121, 85, 20);
		contentPane.add(txtCliente);
		
		txtFechaEjecucion = new JTextField();
		txtFechaEjecucion.setColumns(10);
		txtFechaEjecucion.setBounds(358, 95, 86, 20);
		contentPane.add(txtFechaEjecucion);
		
		txtHoraVenta = new JTextField();
		txtHoraVenta.setColumns(10);
		txtHoraVenta.setBounds(362, 67, 86, 20);
		contentPane.add(txtHoraVenta);
		
		txtIdOrigen = new JTextField();
		txtIdOrigen.setColumns(10);
		txtIdOrigen.setBounds(362, 36, 86, 20);
		contentPane.add(txtIdOrigen);
		
		txtObservacion = new JTextField();
		txtObservacion.setColumns(10);
		txtObservacion.setBounds(358, 211, 86, 20);
		contentPane.add(txtObservacion);
		
		txtIdVehiculo = new JTextField();
		txtIdVehiculo.setColumns(10);
		txtIdVehiculo.setBounds(101, 201, 115, 20);
		contentPane.add(txtIdVehiculo);
		
		txtIdPromotor = new JTextField();
		txtIdPromotor.setColumns(10);
		txtIdPromotor.setBounds(354, 176, 89, 20);
		contentPane.add(txtIdPromotor);
		
		txtIdMedios = new JTextField();
		txtIdMedios.setColumns(10);
		txtIdMedios.setBounds(356, 145, 89, 20);
		contentPane.add(txtIdMedios);
		
		JLabel lblNewLabel = new JLabel("ID DESTINO:");
		lblNewLabel.setBounds(41, 36, 62, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblFechaVenta = new JLabel("FECHA VENTA:");
		lblFechaVenta.setBounds(10, 67, 86, 14);
		contentPane.add(lblFechaVenta);
		
		JLabel lblHoraSalida = new JLabel("HORA SALIDA:");
		lblHoraSalida.setBounds(10, 98, 84, 14);
		contentPane.add(lblHoraSalida);
		
		JLabel lblPrecioPaquete = new JLabel("PRECIO PAQUETE:");
		lblPrecioPaquete.setBounds(10, 133, 110, 14);
		contentPane.add(lblPrecioPaquete);
		
		JLabel lblIdAgencia = new JLabel("ID AGENCIA:");
		lblIdAgencia.setBounds(10, 173, 81, 14);
		contentPane.add(lblIdAgencia);
		
		JLabel lblIdVehiculo = new JLabel("ID VEHICULO:");
		lblIdVehiculo.setBounds(10, 204, 81, 14);
		contentPane.add(lblIdVehiculo);
		
		JLabel lblIdOrigen = new JLabel("ID ORIGEN");
		lblIdOrigen.setBounds(257, 48, 72, 14);
		contentPane.add(lblIdOrigen);
		
		JLabel lblHoraVenta = new JLabel("HORA VENTA:");
		lblHoraVenta.setBounds(267, 70, 85, 14);
		contentPane.add(lblHoraVenta);
		
		JLabel lblFechaEjecucion = new JLabel("FECHA EJECUCION:");
		lblFechaEjecucion.setBounds(238, 98, 110, 14);
		contentPane.add(lblFechaEjecucion);
		
		JLabel lblIdCliente = new JLabel("ID CLIENTE:");
		lblIdCliente.setBounds(248, 124, 101, 14);
		contentPane.add(lblIdCliente);
		
		JLabel lblIdMedio = new JLabel("ID MEDIO :");
		lblIdMedio.setBounds(257, 148, 89, 14);
		contentPane.add(lblIdMedio);
		
		JLabel lblIdPromotor = new JLabel("ID PROMOTOR:");
		lblIdPromotor.setBounds(267, 179, 85, 14);
		contentPane.add(lblIdPromotor);
		
		JLabel lblObservaciones = new JLabel("OBSERVACIONES:");
		lblObservaciones.setBounds(257, 214, 95, 14);
		contentPane.add(lblObservaciones);
		
		JLabel lblPaquetesTuristico = new JLabel("PAQUETES TURISTICO");
		lblPaquetesTuristico.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblPaquetesTuristico.setBounds(171, 11, 144, 14);
		contentPane.add(lblPaquetesTuristico);
		
		JLabel lblIdDeLa_1 = new JLabel("REGISTRO BD");
		lblIdDeLa_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblIdDeLa_1.setBounds(523, 73, 148, 14);
		contentPane.add(lblIdDeLa_1);
		
		JButton btnEliminar = new JButton("ELIMINAR ");
		btnEliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				paq.eliminar(Integer.parseInt(txtCamEli.getText()));
				
			}
		});
		btnEliminar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\ADSO CAICEDO\\icons8-eliminar-24.png"));
		btnEliminar.setBounds(570, 115, 113, 23);
		contentPane.add(btnEliminar);
		
		txtCamEli = new JTextField();
		txtCamEli.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		txtCamEli.setColumns(10);
		txtCamEli.setBounds(512, 138, 141, 32);
		contentPane.add(txtCamEli);
		
		JLabel lblCodigoPaquete = new JLabel("CODIGO PAQUETE:");
		lblCodigoPaquete.setBounds(519, 173, 110, 14);
		contentPane.add(lblCodigoPaquete);
		JButton btnNewButtonConsultar = new JButton("");
		btnNewButtonConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButtonConsultar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			paq.consultar(Integer.parseInt(txtCamEli.getText()), txtIdDestino, txtIdOrigen, txtFechaVenta, txtHoraVenta, txtHoraSalida, txtFechaEjecucion, txtObservacion, txtPrecio, txtIdAgencia, txtCliente, txtIdMedios, txtIdPromotor, txtIdVehiculo);
				
				 
				
			}
		});
		btnNewButtonConsultar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\icons8-magnifying-glass-tilted-right-48.png"));
		btnNewButtonConsultar.setBounds(469, 100, 89, 41);
		contentPane.add(btnNewButtonConsultar);
	

		JButton btnModificar = new JButton("MODIFICAR");
		btnModificar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\intercambiar-documentos (1).png"));
		btnModificar.setBounds(570, 89, 130, 23);
		contentPane.add(btnModificar);

		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				paq.modificar(Integer.parseInt(txtCamEli.getText()),Integer.parseInt(txtIdDestino.getText()),Integer.parseInt(txtIdOrigen.getText()),txtFechaVenta.getText(),txtHoraVenta.getText(),txtHoraSalida.getText(),
                        txtFechaEjecucion.getText(),txtObservacion.getText(),txtPrecio.getText(),Integer.parseInt(txtIdAgencia.getText()),Integer.parseInt(txtCliente.getText()),Integer.parseInt(txtIdMedios.getText()) ,
                        Integer.parseInt(txtIdPromotor.getText()),Integer.parseInt(txtIdVehiculo.getText()));
				
					
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "ID inválido.");
				}
			}
		});
		
	
	}
}
