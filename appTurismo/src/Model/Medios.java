package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import conroller.Conexion;

public class Medios {
	
	
	
	int idTipoMedio;
	public int getIdTipoMedio() {
		return idTipoMedio;
	}




	public void setIdTipoMedio(int idTipoMedio) {
		this.idTipoMedio = idTipoMedio;
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




	public Medios(int idTipoMedio, String nombre, String observación) {
		super();
		this.idTipoMedio = idTipoMedio;
		this.nombre = nombre;
		this.observación = observación;
	}




	String nombre;
	String observación;
	


	
	public void insertar (int idTipoMedios, String nombre, String observacion) {
		String query = "insert into tblmedios (idtipomedio,nombre,observacion) VALUES (?,?,?)";

        try {
            Connection conexBd = Conexion.conectarBD();
            PreparedStatement ps = conexBd.prepareCall(query);
            ps.setFloat(1, idTipoMedios);
            ps.setString(2, nombre);
            ps.setString(3, observacion);
         
            int filasAfectadas = ps.executeUpdate();
            if (filasAfectadas > 0) {
            	JOptionPane.showMessageDialog(null,"Datos insertados exitosamente.");
            } else {
            	JOptionPane.showMessageDialog(null,"No se pudo insertar el registro.");
            }

        } catch (SQLException e) {
        	JOptionPane.showMessageDialog(null,"Error al insertar dato" + e.getMessage());
		
		
		
        }
	}
}
