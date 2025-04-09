package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Compañia;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 559, 437);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TURISMO");
		lblNewLabel.setFont(new Font("Wide Latin", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel.setBounds(224, 11, 176, 28);
		contentPane.add(lblNewLabel);
		
		JButton btnCompañia = new JButton("");
		btnCompañia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCompañia.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frmCompañia  com =new frmCompañia();
				com.setVisible(true);
				dispose();
			//AQUII	
				
			}
		});
		btnCompañia.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\compania-de-seguros (1).png"));
		btnCompañia.setBounds(31, 69, 99, 46);
		contentPane.add(btnCompañia);
		
		JButton btnAgencia = new JButton("");
		btnAgencia.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmAgencias  com =new frmAgencias();
				com.setVisible(true);
				dispose();
			}
		});
		btnAgencia.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\ubicacion.png"));
		btnAgencia.setBounds(31, 138, 99, 46);
		contentPane.add(btnAgencia);
		
		JButton btnPromotores = new JButton("");
		btnPromotores.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmPromotores  com =new frmPromotores();
				com.setVisible(true);
				dispose();
			}
		});
		btnPromotores.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\agencia-de-viajes.png"));
		btnPromotores.setBounds(31, 218, 99, 46);
		contentPane.add(btnPromotores);
		
		JButton btnClientes = new JButton("");
		btnClientes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmClientes  com =new frmClientes();
				com.setVisible(true);
				dispose();
			}
		});
		btnClientes.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\clientes-potenciales.png"));
		btnClientes.setBounds(31, 291, 99, 46);
		contentPane.add(btnClientes);
		
		JButton btnOperadores = new JButton("");
		btnOperadores.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmOperadores  com =new frmOperadores();
				com.setVisible(true);
				dispose();
			}
		});
		btnOperadores.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\envio.png"));
		btnOperadores.setBounds(393, 69, 99, 46);
		contentPane.add(btnOperadores);
		
		JButton btnPaquetes = new JButton("");
		btnPaquetes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmPaquetes  com =new frmPaquetes();
				com.setVisible(true);
				dispose();
			}
		});
		btnPaquetes.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\agencia-de-viajes (1).png"));
		btnPaquetes.setBounds(393, 138, 99, 46);
		contentPane.add(btnPaquetes);
		
		JButton btnVehiculos = new JButton("");
		btnVehiculos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmVehiculos  com =new frmVehiculos();
				com.setVisible(true);
				dispose();
			}
		});
		btnVehiculos.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\seguro-de-auto.png"));
		btnVehiculos.setBounds(393, 218, 99, 46);
		contentPane.add(btnVehiculos);
		
		JButton btnTipoVehiculo = new JButton("");
		btnTipoVehiculo.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\polucion.png"));
		btnTipoVehiculo.setBounds(393, 291, 99, 46);
		contentPane.add(btnTipoVehiculo);
		
		JButton btnNewButton_8 = new JButton("MEDIO");
		btnNewButton_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmMedios  com =new frmMedios();
				com.setVisible(true);
				dispose();
			}
		});
		btnNewButton_8.setBounds(210, 69, 99, 46);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("TIPO DE  MEDIO");
		btnNewButton_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmTipoMedios  com =new frmTipoMedios();
				com.setVisible(true);
				dispose();
			
			}
		});
		
		btnNewButton_9.setBounds(224, 291, 117, 46);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton = new JButton("SALIR");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LoginApp sale = new LoginApp ();
				sale.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(423, 364, 89, 23);
		contentPane.add(btnNewButton);
	}

}
