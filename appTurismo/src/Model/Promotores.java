package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import conroller.Conexion;

public class Promotores {
	
	public Promotores(int id, String tipodocumento, int documento, String nombres, String apellidos, String dirección,
			String correopersonal, String correocorp, String telefono) {
		super();
		this.id = id;
		this.tipodocumento = tipodocumento;
		this.documento = documento;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.direccion = dirección;
		this.correopersonal = correopersonal;
		this.correocorp = correocorp;
		this.telefono = telefono;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTipodocumento() {
		return tipodocumento;
	}
	public void setTipodocumento(String tipodocumento) {
		this.tipodocumento = tipodocumento;
	}
	public int getDocumento() {
		return documento;
	}
	public void setDocumento(int documento) {
		this.documento = documento;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDirección() {
		return direccion;
	}
	public void setDirección(String dirección) {
		this.direccion = dirección;
	}
	public String getCorreopersonal() {
		return correopersonal;
	}
	public void setCorreopersonal(String correopersonal) {
		this.correopersonal = correopersonal;
	}
	public String getCorreocorp() {
		return correocorp;
	}
	public void setCorreocorp(String correocorp) {
		this.correocorp = correocorp;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	int id;
	String tipodocumento;
	int documento;
	String nombres;
	String apellidos;
	String direccion;
	String correopersonal;
	String correocorp;
	String telefono;
	public void insertar (int id,String tipodocumento,int documento, String nombres,String apellidos,String direccion,String correopersonal,String correocop,String telefono) {
		String query = "insert into promotores (id,tipodocumento,documento,nombres,apellidos,direccion,correopersonal,correocorp,telefono) VALUES (?,?,?,?,?,?,?,?,?)";

        try {
            Connection conexBd = Conexion.conectarBD();
            PreparedStatement ps = conexBd.prepareCall(query);
            ps.setFloat(1, id);
            ps.setString(2, tipodocumento);
            ps.setFloat(3, documento);
            ps.setString(4, nombres);
            ps.setString(5,  apellidos);
            ps.setString(6,direccion);
            ps.setString(7, correopersonal);
            ps.setString(8, correocorp);
            ps.setString(9,telefono);
           
         
         
            int filasAfectadas = ps.executeUpdate();
            if (filasAfectadas > 0) {
            	JOptionPane.showMessageDialog(null,"Datos insertados exitosamente.");
            } else {
            	JOptionPane.showMessageDialog(null,"No se pudo insertar el registro.");
            }

        } catch (SQLException e) {
        	JOptionPane.showMessageDialog(null,"Error al insertar dato " + e.getMessage());
		
		
		
        }
	}


}
