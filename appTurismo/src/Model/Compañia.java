package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

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
	int id;
	public Compañia(int id) {
		super();
		this.id = id;
	}
	public Compañia() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	
	
	
	
	public void eliminar (int id) {
		String query = "DELETE FROM tblcompanias WHERE idcompnias = ?";

        try {
            Connection conexBd = Conexion.conectarBD();
            PreparedStatement ps = conexBd.prepareCall(query);
           
            ps.setInt(1,id);
           
         
            int filasAfectadas = ps.executeUpdate();
            if (filasAfectadas > 0) {
            	JOptionPane.showMessageDialog(null,"Datos eliminados exitosamente.");
            } else {
            	JOptionPane.showMessageDialog(null,"No se pudo elimiar registro .");
            }

        } catch (SQLException e) {
        	JOptionPane.showMessageDialog(null,"Error al eliminar datos de la fila" + e.getMessage());
		
		
		
        }
	}
	
	
	 public void consultar (int id,JTextField razonSocial ,  JTextField  direccion,JTextField  telefono,JTextField  fechaCreacion,JTextField correo,JTextField web) {
			String query = "SELECT * FROM  tblcompanias where idcompnias = ?" ;
			  // Conectar a la base de datos
      Connection conexBd =  Conexion.conectarBD();
      try {
				PreparedStatement ps = conexBd.prepareCall(query);
				ps.setInt(1, id);
				ResultSet result = ps.executeQuery();
				while (result.next()) {
					
					razonSocial.setText(result.getString(2));
					direccion.setText(result.getString(3));
					correo.setText(result.getString(4));
					 telefono.setText(result.getString(5));
					 fechaCreacion.setText(result.getString(6));
					 web.setText(result.getString(7));
					
				
		            }
      
      
      } catch (SQLException e) {
				// TODO Auto-generated catch block
      	System.out.println("error al consultar"+e.getMessage());
			}
	 
	 }
	 
		public void modificar (int id ,String razonSocial,String direccion,String correo,String telefono,String fechaCreacion,String web) {
			String query = " update tblcompanias set razonsocial = ?, direccion = ?,correo = ?, telefono = ?, fechacreacion = ?, web = ? where idcompnias = ? ";

	        try {
	            Connection conexBd = Conexion.conectarBD();
	            PreparedStatement ps = conexBd.prepareCall(query);
	           
	            ps.setString(1,razonSocial);
	            ps.setString(2,direccion );
	            ps.setString(3,correo );
	            ps.setString(4, telefono);
	            ps.setString(5,fechaCreacion );
	            ps.setString(6, web);
	            ps.setInt(7, id);
	         
	            int filasAfectadas = ps.executeUpdate();
	            if (filasAfectadas > 0) {
	            	JOptionPane.showMessageDialog(null,"Datos actualizados exitosamente.");
	            } else {
	            	JOptionPane.showMessageDialog(null,"No se pudo actualizar el registro.");
	            }

	        } catch (SQLException e) {
	        	JOptionPane.showMessageDialog(null,"Error al actualizar datos " + e.getMessage());
			
			
			
	        }
		} 
	 
	
}
