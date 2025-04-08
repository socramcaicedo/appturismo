package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import conroller.Conexion;

public class Medios {
	
	
	
	int idTipoMedio;
	public int getIdTipoMedio() {
		return idTipoMedio;
	}




	public void setIdTipoMedio(int idTipoMedio) {
		this.idTipoMedio = idTipoMedio;
	}




	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public String getObservación() {
		return observación;
	}




	public void setObservación(String observación) {
		this.observación = observación;
	}




	public Medios(int idTipoMedio, String nombre, String observación) {
		super();
		this.idTipoMedio = idTipoMedio;
		this.nombre = nombre;
		this.observación = observación;
	}



    public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public Medios(int id) {
		super();
		this.id = id;
	}



	public Medios() {
		// TODO Auto-generated constructor stub
	}



	int   id;
	String nombre;
	String observación;
	


	
	public void insertar (int idTipoMedios, String nombre, String observacion) {
		String query = "insert into tblmedios (idtipomedio,nombre,observacion) VALUES (?,?,?)";

        try {
            Connection conexBd = Conexion.conectarBD();
            PreparedStatement ps = conexBd.prepareCall(query);
            ps.setFloat(1, idTipoMedios);
            ps.setString(2, nombre);
            ps.setString(3, observacion);
         
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
		String query = "delete from tblmedios where id   =?";

        try {
            Connection conexBd = Conexion.conectarBD();
            PreparedStatement ps = conexBd.prepareCall(query);
            ps.setInt(1, id);
          
         
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
	
	
	
	
	 public void consultar (int id,    JTextField idTipoMedios,JTextField  nombre ,  JTextField observación) {
			String query = "SELECT * FROM  tblmedios where id = ?" ;
			  // Conectar a la base de datos
   Connection conexBd =  Conexion.conectarBD();
   try {
				PreparedStatement ps = conexBd.prepareCall(query);
				ps.setInt(1,id);
				ResultSet result = ps.executeQuery();
				while (result.next()) {
					
					idTipoMedios.setText(result.getString(2));
					nombre.setText(result.getString(3));
					observación.setText(result.getString(4));
					
				
		            }
   
   
   } catch (SQLException e) {
				// TODO Auto-generated catch block
   	System.out.println("error al consultar"+e.getMessage());
			}
	 
	 }
	
		public void modificar (int idTipoMedios, String nombre, String observacion) {
			String query = "update tblmedios set  nombre = ?, observacion = ? where idtipomedio = ?";

	        try {
	            Connection conexBd = Conexion.conectarBD();
	            PreparedStatement ps = conexBd.prepareCall(query);
	           
	            ps.setString(1, nombre);
	            ps.setString(2, observacion);
	            ps.setInt(3, idTipoMedios);
	         
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
