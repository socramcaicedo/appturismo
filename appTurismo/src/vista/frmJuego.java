package vista;

import javax.swing.*;
import Model.ModeloJuego;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class frmJuego extends JFrame {
    private JButton botonJugar;
    private JLabel resultado;
    private ModeloJuego modelo;

    public frmJuego() {
    	getContentPane().addMouseListener(new MouseAdapter() {
    		@Override
    		public void mouseClicked(MouseEvent e) {
    			Menu sale = new Menu ();
				sale.setVisible(true);
				dispose();
			
    		}
    	});
        // CORREGIDO: Usamos la variable de instancia
        modelo = new ModeloJuego();

        setTitle("Mini Juego");
        setSize(740, 144);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        botonJugar = new JButton("PRUEBA");
        botonJugar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\taza-de-cafe.png"));
        botonJugar.setBounds(83, 56, 180, 40);
        getContentPane().add(botonJugar);

        resultado = new JLabel("");
        resultado.setFont(new Font("Arial", Font.BOLD, 16));
        resultado.setBounds(300, 56, 400, 40); // Dale un tamaño visible
        getContentPane().add(resultado);

        JLabel lblTitulo = new JLabel("DETECTOR DE FALTA DE CAFÉ");
        lblTitulo.setVerticalAlignment(SwingConstants.TOP);
        lblTitulo.setFont(new Font("Yu Gothic", Font.BOLD | Font.ITALIC, 16));
        lblTitulo.setBounds(10, 16, 400, 20);
        getContentPane().add(lblTitulo);

        // Acción del botón
        botonJugar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String mensaje = modelo.jugar();
                resultado.setText(mensaje);
            }
        });

        setLocationRelativeTo(null); // Centrar ventana
        setVisible(true);
    }

    public static void main(String[] args) {
        new frmJuego();
    }
}