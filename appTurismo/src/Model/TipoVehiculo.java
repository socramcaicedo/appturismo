package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import conroller.Conexion;

public class TipoVehiculo {
	int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public TipoVehiculo(int id, String nombre, String descripcion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	String nombre;
	String descripcion;
	
	public void insertar (String tipoDocumento, int numeroDocumento,String nombre,String apellidos,String direccion,String correo,float teléfono,int idvehiculo) {
		String query = "insert into tbloperadores (tipodocumento,numerodocumento,nombre,apellidos,direccion,correo,telefono,idvehiculo) VALUES (?,?,?,?,?,?,?,?)";

        try {
            Connection conexBd = Conexion.conectarBD();
            PreparedStatement ps = conexBd.prepareCall(query);
            ps.setString(1,  tipoDocumento);
            ps.setFloat(2, numeroDocumento);
            ps.setString(3, nombre);
            ps.setString(4,  apellidos);
            ps.setString(5,direccion);
            ps.setString(6, correo);
            ps.setFloat(7,teléfono);
            ps.setFloat(8, idvehiculo);
         
         
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
