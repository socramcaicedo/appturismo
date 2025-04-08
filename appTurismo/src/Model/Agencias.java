 
package Model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import conroller.Conexion;

public class Agencias {
	 public Agencias(int idagencia,int idCompañia, String razonSocial, String direccion, String correo, String telefono, String web) {
		super();
		this.idagencia = idagencia;
		this.idagencia = idCompañia;
		this.razonSocial = razonSocial;
		this.direccion = direccion;
		this.correo = correo;
		this.telefono = telefono;
		this.web = web;
	}
	
	 public int getIdagencia() {
		return idagencia;
	}
	public void setIdagencia(int idagencia) {
		this.idagencia = idagencia;
	}
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
	public String getWeb() {
		return web;
	}
	public void setWeb(String web) {
		this.web = web;
	}
	
	public int getIdCompañia() {
		return idCompañia;
	}

	public void setIdCompañia(int idCompañia) {
		this.idCompañia = idCompañia;
	}

	public Agencias() {
		super();
		this.idCompañia = idCompañia;
	}
	int idagencia ;
	int idCompañia;
	String razonSocial ;
	 String direccion ;
	 String correo ;
	 String telefono ;
	 String web ;
	 
	 
	 public void insertar (int idagencia,int idCompañia,String razonSocial ,String direccion ,String correo, String telefono, String web) {
			String query = "insert into tblagencias (idagencia,idcompania,razonsocial,direccion,correo,telefono,web) VALUES (?,?,?,?,?,?,?)";

	        try {
	            Connection conexBd = Conexion.conectarBD();
	            PreparedStatement ps = conexBd.prepareCall(query);
	            ps.setFloat(1, idagencia);
	            ps.setFloat(2, idCompañia);
	            ps.setString(3,razonSocial);
	            ps.setString(4,direccion );
	            ps.setString(5,correo );
	            ps.setString(6, telefono);
	            ps.setString(7, web);
	         
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

	 
	 public void eliminar (int idagencia) {
			String query = "DELETE FROM  tblagencias " ;

	        try {
	            Connection conexBd = Conexion.conectarBD();
	            PreparedStatement ps = conexBd.prepareCall(query);
	            ps.setInt(1, idagencia);
	           
	         
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
	 
	 public void consultar (int idagencia,JTextField razonsocial,  JTextField idcompania,JTextField direccion,JTextField correo,JTextField telefono,JTextField web) {
			String query = "SELECT * FROM  tblagencias where idagencia = ?" ;
			  // Conectar a la base de datos
            Connection conexBd =  Conexion.conectarBD();
            try {
				PreparedStatement ps = conexBd.prepareCall(query);
				ps.setInt(1, idagencia);
				ResultSet result = ps.executeQuery();
				while (result.next()) {
					
					idcompania.setText(result.getString(2));
					razonsocial.setText(result.getString(3)); 
					direccion.setText(result.getString(4));
					correo.setText(result.getString(5));
					telefono.setText(result.getString(6));
					web.setText(result.getString(7));
				 
		            }
            
            
            } catch (SQLException e) {
				// TODO Auto-generated catch block
            	System.out.println("error al consultar"+e.getMessage());
			}
	 
	 }
	 
	 public void modificar(int idagencia, int idCompañia, String razonSocial, String direccion, String correo, String telefono, String web) {
			String query = "UPDATE tblagencias SET idcompania = ?, razonsocial = ?, direccion = ?, correo = ?, telefono = ?, web = ? WHERE idagencia = ?";

			try {
				Connection conexBd = Conexion.conectarBD();
				PreparedStatement ps = conexBd.prepareCall(query);
				
				ps.setInt(1, idCompañia);
				ps.setString(2, razonSocial);
				ps.setString(3, direccion);
				ps.setString(4, correo);
				ps.setString(5, telefono);
				ps.setString(6, web);
				ps.setInt(7, idagencia); // ID para el WHERE

				int filasAfectadas = ps.executeUpdate();
				if (filasAfectadas > 0) {
					JOptionPane.showMessageDialog(null, "Datos modificados exitosamente.");
				} else {
					JOptionPane.showMessageDialog(null, "No se encontró el registro para modificar.");
				}
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(null, "Error al modificar datos: " + e.getMessage());
			}
		} 
	 
}
