package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import conroller.Conexion;
import vista.Menu;

public class Promotores {
	
	public Promotores() {
	}
	
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
	public String contrasena;
	

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public Promotores(String contrasena) {
		super();
		this.contrasena = contrasena;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
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
	
	
	//___________________________________________________________________________________________________________________________________________________________________________________________________________________
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
	//___________________________________________________________________________________________________________________________________________________________________________________________________________________
	public void eliminar (int id) {
		String query = "delete from promotores where id=?";

        try {
            Connection conexBd = Conexion.conectarBD();
            PreparedStatement ps = conexBd.prepareCall(query);
            ps.setInt(1, id);
           
         
         
            int filasAfectadas = ps.executeUpdate();
            if (filasAfectadas > 0) {
            	JOptionPane.showMessageDialog(null,"Datos eliminados exitosamente.");
            } else {
            	JOptionPane.showMessageDialog(null,"No se pudo eliminar el registro.");
            }

        } catch (SQLException e) {
        	JOptionPane.showMessageDialog(null,"Error al eliminar datos de la fila " + e.getMessage());
		
		
		
        }
	}
	//___________________________________________________________________________________________________________________________________________________________________________________________________________________

	 public void consultar (int id,    JTextField  tipodocumento,JTextField numeroDocumento  ,JTextField nombre, JTextField  apellidos, JTextField direccion, JTextField  correoper, JTextField  correocorp,JTextField teléfono ) {
			String query = "SELECT * FROM  promotores where id = ?" ;
			  // Conectar a la base de datos
Connection conexBd =  Conexion.conectarBD();
try {
				PreparedStatement ps = conexBd.prepareCall(query);
				ps.setInt(1,id);
				ResultSet result = ps.executeQuery();
				while (result.next()) {
					
					tipodocumento.setText(result.getString(2));
					numeroDocumento.setText(result.getString(3));
					nombre.setText(result.getString(4));
					apellidos.setText(result.getString(5));
					 direccion.setText(result.getString(6));
					 correoper.setText(result.getString(7));
					 correocorp.setText(result.getString(8));
					 teléfono.setText(result.getString(9));
					
					
				
		            }


} catch (SQLException e) {
				// TODO Auto-generated catch block
	System.out.println("error al consultar"+e.getMessage());
			}
	 
	 }
	//___________________________________________________________________________________________________________________________________________________________________________________________________________________
	 
	 public void  modificar (int id,String tipodocumento,int documento, String nombres,String apellidos,String direccion,String correopersonal,String correocop,String telefono) {
			String query = "update promotores set tipodocumento = ?, documento = ?, nombres = ?, apellidos = ?, direccion = ?, correopersonal = ?, correocorp = ?, telefono = ? where id = ?";

	        try {
	            Connection conexBd = Conexion.conectarBD();
	            PreparedStatement ps = conexBd.prepareCall(query);
	          
	            ps.setString(1, tipodocumento);
	            ps.setInt(2, documento);
	            ps.setString(3, nombres);
	            ps.setString(4,  apellidos);
	            ps.setString(5,direccion);
	            ps.setString(6, correopersonal);
	            ps.setString(7, correocop);
	            ps.setString(8,telefono);
	            ps.setInt(9, id);
	           
	         
	         
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
	//___________________________________________________________________________________________________________________________________________________________________________________________________________________
	 public static boolean Usuario( int documento, String contraseña) {
	        boolean resultado = false;

	        Connection conn = Conexion.conectarBD();

	        String query = "SELECT * FROM promotores WHERE documento = ? AND contraseña = ?";

	        try {
	            PreparedStatement ps = conn.prepareStatement(query);
	            ps.setInt(1,documento);
	            ps.setString(2, contraseña);

	            ResultSet rs = ps.executeQuery();

	            if (rs.next()) {
	                resultado = true;

	                
	                
	                Menu sale = new Menu ();
					sale.setVisible(true);
					dispose();
	            }else {
	            	JOptionPane.showMessageDialog(null,"usuario o contraseña incorrectas.");
	            	
	            }
	            rs.close();
	            ps.close();
	            conn.close();

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }

	        return resultado;
	    }

	private static void dispose() {
		// TODO Auto-generated method stub
		
	}
	 
}
