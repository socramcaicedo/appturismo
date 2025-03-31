package conroller;


	import java.sql.Connection;

	import java.sql.DriverManager;

	import java.sql.SQLException;

import javax.swing.JOptionPane;

	public class Conexion {
		
		


	public static Connection conectarBD() {

	//Crar e inicializar un objeto de la clase connection

	Connection connection = null;

	try {

	connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/bd_turismo", "root", "2556229");

	JOptionPane.showMessageDialog(null,"Connected With the database successfully");

	}catch (SQLException e) {

	JOptionPane.showConfirmDialog(null,"Error  "+e.getMessage());

	}

	return connection; //retorna la conexión abierta con la BD

	}

	}


