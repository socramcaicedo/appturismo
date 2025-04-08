package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

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

	int id;

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public Operadores(int id) {
		super();
		this.id = id;
	}

	public Operadores() {
		// TODO Auto-generated constructor stub
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

	
	
	
	public void eliminar (int id) {
		String query = "delete from tbloperadores where id =?";

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

	 public void consultar (int id,    JTextField tipoDocumento,JTextField numeroDocumento  ,JTextField nombre, JTextField  apellidos, JTextField direccion, JTextField  correo, JTextField teléfono, JTextField  idvehiculo ) {
			String query = "SELECT * FROM  tbloperadores where id = ?" ;
			  // Conectar a la base de datos
Connection conexBd =  Conexion.conectarBD();
try {
				PreparedStatement ps = conexBd.prepareCall(query);
				ps.setInt(1,id);
				ResultSet result = ps.executeQuery();
				while (result.next()) {
					
					tipoDocumento.setText(result.getString(2));
					numeroDocumento.setText(result.getString(3));
					nombre.setText(result.getString(4));
					apellidos.setText(result.getString(5));
					 direccion.setText(result.getString(6));
					 correo.setText(result.getString(7));
					 teléfono.setText(result.getString(8));
					 idvehiculo.setText(result.getString(9));
					
					
				
		            }


} catch (SQLException e) {
				// TODO Auto-generated catch block
	System.out.println("error al consultar"+e.getMessage());
			}
	 
	 }
	 
	 
	 public void modoficar(int id ,String tipoDocumento, int numeroDocumento,String nombre,String apellidos,String direccion,String correo,int teléfono,int idvehiculo) {
			String query = "update tbloperadores set tipodocumento = ?, numerodocumento = ?, nombre = ?, apellidos = ?, direccion = ?, correo = ?,telefono = ?,idvehiculo =?  where id = ? ";

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
	            ps.setInt(9,id);
	         
	         
	            int filasAfectadas = ps.executeUpdate();
	            if (filasAfectadas > 0) {
	            	JOptionPane.showMessageDialog(null,"Datos actualizados exitosamente.");
	            } else {
	            	JOptionPane.showMessageDialog(null,"No se pudo actualizar el registro.");
	            }

	        } catch (SQLException e) {
	        	JOptionPane.showMessageDialog(null,"Error al actualizar datos" + e.getMessage());
			
			
			
	        }
		}
	
	
}
