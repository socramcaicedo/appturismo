package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import conroller.Conexion;

public class Compañia {
	 
	
	
	
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
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
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public String getWeb() {
		return web;
	}
	public void setWeb(String web) {
		this.web = web;
	}
	
	public Compañia( String razonSocial, String direccion, String correo, String telefono,
			String fechaCreacion, String web) {
		super();
	
		this.razonSocial = razonSocial;
		this.direccion = direccion;
		this.correo = correo;
		this.telefono = telefono;
		this.fechaCreacion = fechaCreacion;
		this.web = web;
	}
	String razonSocial ;
	String direccion ;
	String correo;
	String telefono ;
	String fechaCreacion ;
	String web ;

	public void insertar (String razonSocial,String direccion,String correo,String telefono,String fechaCreacion,String web) {
		String query = "insert into tblcompanias (razonsocial,direccion,correo,telefono,fechacreacion,web) VALUES (?,?,?,?,?,?)";

        try {
            Connection conexBd = Conexion.conectarBD();
            PreparedStatement ps = conexBd.prepareCall(query);
           
            ps.setString(1,razonSocial);
            ps.setString(2,direccion );
            ps.setString(3,correo );
            ps.setString(4, telefono);
            ps.setString(5,fechaCreacion );
            ps.setString(6, web);
         
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
