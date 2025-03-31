package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import conroller.Conexion;

public class Operadores {
	
	
	



	int numeroDocumento;
	public int getNumeroDocumento() {
		return numeroDocumento;
	}



	public void setNumeroDocumento(int numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}



	public String getTipoDocumento() {
		return tipoDocumento;
	}



	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellidos() {
		return apellidos;
	}



	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	public String getCorreo() {
		return correo;
	}



	public void setCorreo(String correo) {
		this.correo = correo;
	}



	public int getTeléfono() {
		return teléfono;
	}



	public void setTeléfono(int teléfono) {
		this.teléfono = teléfono;
	}



	public int getIdvehiculo() {
		return idvehiculo;
	}



	public void setIdvehiculo(int idvehiculo) {
		this.idvehiculo = idvehiculo;
	}



	public Operadores(int numeroDocumento, String tipoDocumento, String nombre, String apellidos, String direccion,
			String correo, int teléfono, int idvehiculo) {
		super();
		this.numeroDocumento = numeroDocumento;
		this.tipoDocumento = tipoDocumento;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.correo = correo;
		this.teléfono = teléfono;
		this.idvehiculo = idvehiculo;
	}



	String tipoDocumento;
	String nombre;
	String apellidos;
	String direccion;
	String correo;
	int teléfono;
	int idvehiculo;
	
	
	
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
