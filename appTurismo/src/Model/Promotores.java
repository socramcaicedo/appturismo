package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import conroller.Conexion;

public class Promotores {
	int id;
	public Promotores(int id, String tipodocumento, int documento, String nombres, String apellidos, String dirección,
			String correopersonal, String correocorp, String teléfono) {
		super();
		this.id = id;
		this.tipodocumento = tipodocumento;
		this.documento = documento;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.dirección = dirección;
		this.correopersonal = correopersonal;
		this.correocorp = correocorp;
		this.teléfono = teléfono;
	}
	String tipodocumento;
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
		return dirección;
	}
	public void setDirección(String dirección) {
		this.dirección = dirección;
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
	public String getTeléfono() {
		return teléfono;
	}
	public void setTeléfono(String teléfono) {
		this.teléfono = teléfono;
	}
	int documento;
	String nombres;
	String apellidos;
	String dirección;
	String correopersonal;
	String correocorp;
	String teléfono;
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
