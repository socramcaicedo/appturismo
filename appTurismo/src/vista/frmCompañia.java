package vista;

import java.awt.EventQueue;
import Model.Compañia;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class frmCompañia extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nomComp;
	private JTextField idCom;
	private JTextField direcCom;
	private JTextField correo;
	private JTextField telefono;
	private JTextField fechCreacion;
	private JTextField direcWeb;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmCompañia frame = new frmCompañia();
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
	public frmCompañia() {
		setTitle("REGISTRA NUEVA COMPAÑIA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 703, 421);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		nomComp = new JTextField();
		nomComp.setBounds(20, 29, 389, 20);
		contentPane.add(nomComp);
		nomComp.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("NOMBRE DE LA COMPAÑIA");
		lblNewLabel.setBounds(34, 14, 134, 14);
		contentPane.add(lblNewLabel);
		
		idCom = new JTextField();
		idCom.setColumns(10);
		idCom.setBounds(20, 72, 389, 20);
		contentPane.add(idCom);
		
		direcCom = new JTextField();
		direcCom.setColumns(10);
		direcCom.setBounds(20, 114, 389, 20);
		contentPane.add(direcCom);
		
		correo = new JTextField();
		correo.setColumns(10);
		correo.setBounds(20, 154, 389, 20);
		contentPane.add(correo);
		
		telefono = new JTextField();
		telefono.setColumns(10);
		telefono.setBounds(20, 195, 389, 20);
		contentPane.add(telefono);
		
		fechCreacion = new JTextField();
		fechCreacion.setColumns(10);
		fechCreacion.setBounds(20, 230, 389, 20);
		contentPane.add(fechCreacion);
		
		direcWeb = new JTextField();
		direcWeb.setColumns(10);
		direcWeb.setBounds(20, 276, 389, 20);
		contentPane.add(direcWeb);
		
		JLabel lblNewLabel_1_1 = new JLabel("DIRECCION");
		lblNewLabel_1_1.setBounds(20, 102, 134, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("CORREO");
		lblNewLabel_1_2.setBounds(20, 141, 134, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("TELEFONO");
		lblNewLabel_1_3.setBounds(20, 180, 134, 14);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("FECHA DE CREACION");
		lblNewLabel_1_4.setBounds(20, 218, 134, 14);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("DIRECCION WEB");
		lblNewLabel_1_5.setBounds(20, 261, 134, 14);
		contentPane.add(lblNewLabel_1_5);
		
		JButton btnGuardar = new JButton("REGISTRAR");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
		
				//AQUIII
				Compañia compa = new Compañia( nomComp.getText(),direcCom.getText(),correo.getText(),telefono.getText(),fechCreacion.getText(),direcWeb.getText());
				
				compa.insertar(nomComp.getText(),direcCom.getText(),correo.getText(),telefono.getText(),fechCreacion.getText(),direcWeb.getText());
				
								 
			}
		});
		btnGuardar.setBounds(152, 317, 89, 23);
		contentPane.add(btnGuardar);
	}
}
