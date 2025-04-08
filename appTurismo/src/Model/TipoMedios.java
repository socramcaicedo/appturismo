package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import conroller.Conexion;

public class TipoMedios {
	public TipoMedios() {
	}

	public TipoMedios(int idTipoMedios, String nombre, String observación) {
		super();
		this.idTipoMedios = idTipoMedios;
		this.nombre = nombre;
		this.observación = observación;
	}

	int idTipoMedios;

	public int getIdTipoMedios() {
		return idTipoMedios;
	}

	public void setIdTipoMedios(int idTipoMedios) {
		this.idTipoMedios = idTipoMedios;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getObservación() {
		return observación;
	}

	public void setObservación(String observación) {
		this.observación = observación;
	}

	String nombre;
	String observación;
	//______________________________________________________________________________________________________________________________________________________________________________________________________________________

	public void insertar(int idTipoMedios, String nombre, String observacion) {
		String query = "insert into tbltipomedios (idTipoMedios,nombre,observacion) VALUES (?,?,?)";

		try {
			Connection conexBd = Conexion.conectarBD();
			PreparedStatement ps = conexBd.prepareCall(query);
			ps.setFloat(1, idTipoMedios);
			ps.setString(2, nombre);
			ps.setString(3, observacion);

			int filasAfectadas = ps.executeUpdate();
			if (filasAfectadas > 0) {
				JOptionPane.showMessageDialog(null, "Datos insertados exitosamente.");
			} else {
				JOptionPane.showMessageDialog(null, "No se pudo insertar el registro.");
			}

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error al insertar dato" + e.getMessage());

		}
	}
	//______________________________________________________________________________________________________________________________________________________________________________________________

	public void eliminar(int idTipoMedios) {
		String query = "delete from  tbltipomedios where idTipoMedios = ?";

		try {
			Connection conexBd = Conexion.conectarBD();
			PreparedStatement ps = conexBd.prepareCall(query);
			ps.setInt(1, idTipoMedios);

			int filasAfectadas = ps.executeUpdate();
			if (filasAfectadas > 0) {
				JOptionPane.showMessageDialog(null, "Datos eliminados exitosamente.");
			} else {
				JOptionPane.showMessageDialog(null, "No se pudo eliminar el registro.");
			}

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error al eliminar datos de la fila" + e.getMessage());

		}

	}

	//__________________________________________________________________________________________________________________________________________________________________________________________

	public void consultar(int idTipoMedios, JTextField nombre, JTextField observación) {
		String query = "SELECT * FROM  tbltipomedios where idtipomedios = ?";
		// Conectar a la base de datos
		try {	Connection conexBd = Conexion.conectarBD();
		
			PreparedStatement ps = conexBd.prepareStatement(query);
			ps.setInt(1, idTipoMedios);
			ResultSet result = ps.executeQuery();
			while (result.next()) {

				if (result.next()) {
					nombre.setText(result.getString(2));
					observación.setText(result.getString(3));
				} else {
					JOptionPane.showMessageDialog(null, "No se encontró el registro.");
				}

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("error al consultar" + e.getMessage());
		}

	}
	//___________________________________________________________________________________________________________________________________________________________________________________________________________________

	public void modificar(int idTipoMedios, String nombre, String observacion) {
		String query = "UPDATE tbltipomedios SET nombre = ?, observacion = ? WHERE idTipoMedios = ?";

		try {
			Connection conexBd = Conexion.conectarBD();
			PreparedStatement ps = conexBd.prepareCall(query);
			ps.setString(1, nombre);
			ps.setString(2, observacion);
			ps.setInt(3, idTipoMedios);

			int filasAfectadas = ps.executeUpdate();
			if (filasAfectadas > 0) {
				JOptionPane.showMessageDialog(null, "Datos modificados exitosamente.");
			} else {
				JOptionPane.showMessageDialog(null, "No se encontró el registro a modificar.");
			}

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error al modificar el dato: " + e.getMessage());
		}
	}

}
