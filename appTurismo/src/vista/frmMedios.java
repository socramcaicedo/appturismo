package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Medios;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class frmMedios extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txttipoMedio;
	private JTextField txtNombre;
	private JTextField txtObservacion;
	private JTextField txtCamEli;
	Medios medio = new Medios();
	

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
		setBounds(100, 100, 716, 333);
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
		
		JLabel lblIdTipoDe = new JLabel("TIPO DE MEDIOS:");
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
		txtObservacion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtObservacion.setColumns(10);
		txtObservacion.setBounds(200, 168, 219, 32);
		contentPane.add(txtObservacion);
		
		JLabel lblDescripcion = new JLabel("DESCRIPCION");
		lblDescripcion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDescripcion.setBounds(106, 164, 89, 24);
		contentPane.add(lblDescripcion);
		
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
		btnGuardar_1.setBounds(186, 223, 89, 23);
		contentPane.add(btnGuardar_1);
		
		JLabel lblNombre = new JLabel("NOMBRE:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNombre.setBounds(95, 117, 69, 24);
		contentPane.add(lblNombre);
		
		JLabel lblIdDeLa_1 = new JLabel("REGISTRO BD");
		lblIdDeLa_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblIdDeLa_1.setBounds(526, 106, 148, 14);
		contentPane.add(lblIdDeLa_1);
		
		JButton btnEliminar = new JButton("ELIMINAR ");
		btnEliminar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\ADSO CAICEDO\\icons8-eliminar-24.png"));
		btnEliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Medios medio = new Medios(Integer.parseInt(txtCamEli.getText()));
				medio.eliminar(Integer.parseInt(txtCamEli.getText()));
				
			}
		});
		btnEliminar.setBounds(451, 180, 113, 23);
		contentPane.add(btnEliminar);
		
		txtCamEli = new JTextField();
		txtCamEli.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		txtCamEli.setColumns(10); 
		txtCamEli.setBounds(501, 202, 141, 32);
		contentPane.add(txtCamEli);
		
		JButton btnNewButtonConsultar = new JButton("");
		btnNewButtonConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButtonConsultar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				medio.consultar(Integer.parseInt(txtCamEli.getText()),txttipoMedio, txtNombre, txtObservacion);
				
				
				
				
			
				
				 
				
			}
		});
		btnNewButtonConsultar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\icons8-magnifying-glass-tilted-right-48.png"));
		btnNewButtonConsultar.setBounds(511, 242, 89, 41);
		contentPane.add(btnNewButtonConsultar);
		
		

		JButton btnModificar = new JButton("MODIFICAR");
		btnModificar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\intercambiar-documentos (1).png"));
		btnModificar.setBounds(570, 180, 130, 23);
		contentPane.add(btnModificar);
		
		JLabel lblIdDeLa_1_1 = new JLabel("ID MEDIO");
		lblIdDeLa_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblIdDeLa_1_1.setBounds(429, 211, 83, 14);
		contentPane.add(lblIdDeLa_1_1);

		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
				medio.modificar(Integer.parseInt(txtCamEli.getText()),txtNombre.getText(),txtObservacion.getText());

					
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "ID inválido.");
				}
			}
		});
		
		
		
	}
}
