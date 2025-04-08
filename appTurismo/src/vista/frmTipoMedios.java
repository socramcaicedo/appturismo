package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.TipoMedios;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.Container;

import javax.swing.SwingConstants;
import java.awt.Window.Type;
import javax.swing.ImageIcon;

public class frmTipoMedios extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel idTipo;
	private JTextField idTip;
	private JTextField nombre;
	private JTextField descripcion;
	private JTextField txtCamEli;
	
	TipoMedios medio = new 	TipoMedios();
	private Container contentPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmTipoMedios frame = new frmTipoMedios();
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
	public frmTipoMedios() {
		setTitle("TIPOS DE MEDIOS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 880, 352);
		idTipo = new JPanel();
		idTipo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		idTipo.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(idTipo);
		idTipo.setLayout(null);
		
		JButton btnGuardar = new JButton("REGISTRAR");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				
				//AQUI VA TODO
			TipoMedios medio = new 	TipoMedios( Integer.parseInt(idTip.getText()),nombre.getText(),descripcion.getText());
				//JOptionPane.showMessageDialog(null," "+medio.getIdTipoMedios()+" "+medio.getNombre()+"   "+medio.getObservación());
			
			
			medio.insertar( Integer.parseInt(idTip.getText()),nombre.getText(),descripcion.getText());
			
			
			
				idTip.setText(" ");
				nombre.setText(" ");
				descripcion.setText(" ");
				
				
			}
		});
	
		btnGuardar.setActionCommand("REGISTRAR");
		btnGuardar.setBounds(260, 227, 89, 23);
		idTipo.add(btnGuardar);
		
		JLabel lblIdTipoDe = new JLabel("ID TIPO DE MEDIOS:");
		lblIdTipoDe.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIdTipoDe.setBounds(22, 47, 145, 24);
		idTipo.add(lblIdTipoDe);
		
		JLabel lblNombreDelTipo = new JLabel("NOMBRE DEL TIPO DE MEDIO");
		lblNombreDelTipo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNombreDelTipo.setBounds(22, 101, 207, 24);
		idTipo.add(lblNombreDelTipo);
		
		JLabel lblDescripcion = new JLabel("DESCRIPCION");
		lblDescripcion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDescripcion.setBounds(30, 164, 89, 24);
		idTipo.add(lblDescripcion);
		
		idTip = new JTextField();
		idTip.setBounds(163, 51, 186, 20);
		idTipo.add(idTip);
		idTip.setColumns(10);
		
		nombre = new JTextField();
		nombre.setColumns(10);
		nombre.setBounds(98, 121, 245, 20);
		idTipo.add(nombre);
		
		descripcion = new JTextField();
		descripcion.setToolTipText("");
		descripcion.setFont(new Font("Tahoma", Font.PLAIN, 12));
		descripcion.setColumns(10);
		descripcion.setBounds(124, 168, 405, 23);
		idTipo.add(descripcion);
		
		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.setActionCommand("REGISTRAR");
		btnCancelar.setBounds(124, 227, 89, 23);
		idTipo.add(btnCancelar);
		
		JLabel lblFormularioTipoDe = new JLabel("FORMULARIO TIPO DE MEDIOS");
		lblFormularioTipoDe.setHorizontalAlignment(SwingConstants.CENTER);
		lblFormularioTipoDe.setForeground(new Color(255, 128, 255));
		lblFormularioTipoDe.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFormularioTipoDe.setBounds(98, 11, 230, 24);
		idTipo.add(lblFormularioTipoDe);
		
		JLabel lblIdDeLa_1 = new JLabel("REGISTRO BD");
		lblIdDeLa_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblIdDeLa_1.setBounds(636, 170, 113, 14);
		idTipo.add(lblIdDeLa_1);
		
		JButton btnEliminar = new JButton("ELIMINAR ");
		btnEliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TipoMedios medio = new 	TipoMedios();
				medio.eliminar(Integer.parseInt(txtCamEli.getText()));
				
				
			}
		});
		btnEliminar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\ADSO CAICEDO\\icons8-eliminar-24.png"));
		btnEliminar.setBounds(566, 279, 113, 23);
		idTipo.add(btnEliminar);
		
		txtCamEli = new JTextField();
		txtCamEli.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				txtCamEli.setText(idTip.getText());
				
			}
		});
		txtCamEli.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		txtCamEli.setColumns(10);
		txtCamEli.setBounds(595, 202, 141, 32);
		idTipo.add(txtCamEli);
		idTipo.add(txtCamEli);
		JButton btnNewButtonConsultar_1 = new JButton("");
		btnNewButtonConsultar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnNewButtonConsultar_1.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\icons8-magnifying-glass-tilted-right-48.png"));
		btnNewButtonConsultar_1.setBounds(645, 238, 89, 41);
		idTipo.add(btnNewButtonConsultar_1);
		
	
		btnNewButtonConsultar_1.addMouseListener(new MouseAdapter() {
			
			
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
				medio.consultar(Integer.parseInt(txtCamEli.getText()), nombre, descripcion);
				idTip.setText(txtCamEli.getText());
				
				
				
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "ID inválido.");
				}
				
			}
		});
		btnNewButtonConsultar_1.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\icons8-magnifying-glass-tilted-right-48.png"));
		btnNewButtonConsultar_1.setBounds(681, 238, 89, 41);
		idTipo.add(btnNewButtonConsultar_1);
		
		
		JButton btnModificar = new JButton("MODIFICAR");
		btnModificar.setBounds(559, 245, 120, 23);
		idTipo.add(btnModificar);

		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
				

					medio.modificar(Integer.parseInt(idTip.getText()), nombre.getText(), descripcion.getText());

					idTip.setText("");
					nombre.setText("");
					descripcion.setText("");
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "ID inválido.");
				}
			}
		});
		
		
		
		
	}
}
