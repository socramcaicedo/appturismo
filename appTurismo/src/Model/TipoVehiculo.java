package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import conroller.Conexion;

public class TipoVehiculo {
	
	
	
	
	
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

	public TipoVehiculo(String nombre, String descripcion) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	int id;
	public TipoVehiculo(int id) {
		super();
		this.id = id;
	}

	public TipoVehiculo() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	String nombre;
	String descripcion;
	
	public void insertar (String nombre,String descripcion) {
		String query = "insert into tipovehiculo (nombre,descripcion) VALUES (?,?)";

        try {
            Connection conexBd = Conexion.conectarBD();
            PreparedStatement ps = conexBd.prepareCall(query);
            ps.setString(1,  nombre);
            ps.setString(2, descripcion);
           
         
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
		String query = "delete from tipovehiculo where idtipovehiculo  =?";

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
        	JOptionPane.showMessageDialog(null,"Error al eliminar datos de la fila  " + e.getMessage());
		
		
		
        }
	}

	
	 public void consultar (int id, JTextField  nombre ,  JTextField observación) {
			String query = "SELECT * FROM  tipovehiculo where idtipovehiculo = ?" ;
			  // Conectar a la base de datos
			try {  Connection conexBd =  Conexion.conectarBD();

				PreparedStatement ps = conexBd.prepareCall(query);
				ps.setInt(1,id);
				ResultSet result = ps.executeQuery();
				while (result.next()) {
					
					
					nombre.setText(result.getString(2));
					observación.setText(result.getString(3));
					
				
		            }


} catch (SQLException e) {
				// TODO Auto-generated catch block
	System.out.println("error al consultar"+e.getMessage());
			}
	 
	 }
}
