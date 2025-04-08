package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import conroller.Conexion;

public class Clientes {
	
	
	int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public int getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(int numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
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

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public Clientes(int id, String tipoDocumento, int numeroDocumento, String nombre, String apellidos, String correo, 
			int telefono) {
		super();
		this.id = id;
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.correo = correo;
		this.telefono = telefono;
	}

	public Clientes() {
		// TODO Auto-generated constructor stub
	}

	String tipoDocumento;
	int numeroDocumento;
	String nombre;
	String apellidos;
	String correo;
	int telefono;
	public void insertar (int id,String tipoDocumento,int numeroDocumento,String nombre,String apellidos,String correo,int telefono) {
		String query = "insert into tblclientes (id,tipodocumento,numerodocumento,nombre,apellidos,correo,telefono) VALUES (?,?,?,?,?,?,?)";

        try {
            Connection conexBd = Conexion.conectarBD();
            PreparedStatement ps = conexBd.prepareCall(query);
            ps.setFloat(1, id);
            ps.setString(2, tipoDocumento);
            ps.setFloat(3,  numeroDocumento);
            ps.setString(4,  nombre);
            ps.setString(5,  apellidos);
            ps.setString(6, correo);
            ps.setFloat(7, telefono);
         
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
	
	

	public void eliminar (int id) {
		String query = "DELETE FROM  tblclientes where id = ?";

        try {
            Connection conexBd = Conexion.conectarBD();
            PreparedStatement ps = conexBd.prepareCall(query);
            ps.setInt(1, id);
           
         
            int filasAfectadas = ps.executeUpdate();
            if (filasAfectadas > 0) {
            	JOptionPane.showMessageDialog(null,"Datos ELIMINADOS exitosamente.");
            } else {
            	JOptionPane.showMessageDialog(null,"No se pudo ELIMINAR el registro DE LA FILA.");
            }

        } catch (SQLException e) {
        	JOptionPane.showMessageDialog(null,"Error al ELIMINAR FILA dato" + e.getMessage());		
		
		
        }
	}

	 public void consultar (int id,JTextField tipoDocumento ,  JTextField  numeroDocumento,JTextField nombre,JTextField  apellidos,JTextField correo,JTextField telefono) {
			String query = "SELECT * FROM  tblclientes where id = ?" ;
			  // Conectar a la base de datos
         Connection conexBd =  Conexion.conectarBD();
         try {
				PreparedStatement ps = conexBd.prepareCall(query);
				ps.setInt(1, id);
				ResultSet result = ps.executeQuery();
				while (result.next()) {
					
				   tipoDocumento.setText(result.getString(2));
				   numeroDocumento.setText(result.getString(3));
				   nombre.setText(result.getString(4));
				   apellidos.setText(result.getString(5));
				   correo.setText(result.getString(6));
				   telefono.setText(result.getString(7));
					
				
		            }
         
         
         } catch (SQLException e) {
				// TODO Auto-generated catch block
         	System.out.println("error al consultar"+e.getMessage());
			}
	 
	 }
	 
		public void modificar (int id,String tipoDocumento,int numeroDocumento,String nombre,String apellidos,String correo,int telefono) {
			String query = "UPDATE tblclientes SET tipodocumento = ?, numerodocumento = ?, nombre = ?, apellidos = ?, correo = ?, telefono = ? WHERE id = ?";

	        try {
	            Connection conexBd = Conexion.conectarBD();
	            PreparedStatement ps = conexBd.prepareCall(query);
	            ps.setString(1, tipoDocumento);
	            ps.setInt(2, numeroDocumento);
	            ps.setString(3, nombre);
	            ps.setString(4, apellidos);
	            ps.setString(5, correo);
	            ps.setInt(6, telefono);
	            ps.setInt(7, id);
	         
	            int filasAfectadas = ps.executeUpdate();
	            if (filasAfectadas > 0) {
	            	JOptionPane.showMessageDialog(null,"Datos actualizados exitosamente.");
	            } else {
	            	JOptionPane.showMessageDialog(null,"No se pudo actualizar el registro.");
	            }

	        } catch (SQLException e) {
	        	JOptionPane.showMessageDialog(null,"Error al actualizar  datos " + e.getMessage());
			
			
			
	        }
		}

}
