package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Medios;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class frmMedios extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txttipoMedio;
	private JTextField txtNombre;
	private JTextField txtObservacion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmMedios frame = new frmMedios();
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
	public frmMedios() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 333);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFormularioDeMedios = new JLabel("FORMULARIO  DE MEDIOS");
		lblFormularioDeMedios.setHorizontalAlignment(SwingConstants.CENTER);
		lblFormularioDeMedios.setForeground(new Color(255, 128, 255));
		lblFormularioDeMedios.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFormularioDeMedios.setBounds(174, 11, 230, 24);
		contentPane.add(lblFormularioDeMedios);
		
		JLabel lblIdTipoDe = new JLabel("ID TIPO DE MEDIOS:");
		lblIdTipoDe.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIdTipoDe.setBounds(98, 47, 145, 24);
		contentPane.add(lblIdTipoDe);
		
		txttipoMedio = new JTextField();
		txttipoMedio.setColumns(10);
		txttipoMedio.setBounds(239, 51, 186, 20);
		contentPane.add(txttipoMedio);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(174, 121, 245, 20);
		contentPane.add(txtNombre);
		
		txtObservacion = new JTextField();
		txtObservacion.setFont(new Font("Tahoma", Font.PLAIN, 8));
		txtObservacion.setColumns(10);
		txtObservacion.setBounds(200, 168, 219, 48);
		contentPane.add(txtObservacion);
		
		JLabel lblDescripcion = new JLabel("DESCRIPCION");
		lblDescripcion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDescripcion.setBounds(106, 164, 89, 24);
		contentPane.add(lblDescripcion);
		
		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.setActionCommand("REGISTRAR");
		btnCancelar.setBounds(200, 227, 89, 23);
		contentPane.add(btnCancelar);
		
		JButton btnGuardar_1 = new JButton("REGISTRAR");
		btnGuardar_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//AQUIIIIIIII
				Medios medio = new Medios(Integer.parseInt(txttipoMedio.getText()),txtNombre.getText(),txtObservacion.getText());
				medio.insertar(Integer.parseInt(txttipoMedio.getText()),txtNombre.getText(),txtObservacion.getText());
				
				txtNombre.setText("");
				txtObservacion.setText("");
				txttipoMedio.setText("");
				
			}
		});
		
		btnGuardar_1.setActionCommand("REGISTRAR");
		btnGuardar_1.setBounds(336, 227, 89, 23);
		contentPane.add(btnGuardar_1);
		
		JLabel lblNombre = new JLabel("NOMBRE:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNombre.setBounds(95, 117, 69, 24);
		contentPane.add(lblNombre);
	}
}
