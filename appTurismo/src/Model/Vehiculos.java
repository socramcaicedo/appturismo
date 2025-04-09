package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import conroller.Conexion;

public class Vehiculos {




public int getIdVehiculo() {
		return idVehiculo;
	}

	public void setIdVehiculo(int idVehiculo) {
		this.idVehiculo = idVehiculo;
	}

	public int getIdTipoVehiculo() {
		return idTipoVehiculo;
	}

	public void setIdTipoVehiculo(int idTipoVehiculo) {
		this.idTipoVehiculo = idTipoVehiculo;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(String capacidad) {
		this.capacidad = capacidad;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

public Vehiculos(int idVehiculo, int idTipoVehiculo, int matricula, String marca, String capacidad, String modelo,
			String categoria) {
		super();
		this.idVehiculo = idVehiculo;
		this.idTipoVehiculo = idTipoVehiculo;
		this.matricula = matricula;
		this.marca = marca;
		this.capacidad = capacidad;
		this.modelo = modelo;
		this.categoria = categoria;
	}

public Vehiculos() {
	// TODO Auto-generated constructor stub
}

int idVehiculo;
int idTipoVehiculo;
int matricula;
String marca;
String capacidad;
String modelo;
String categoria;

public void insertar (int idTipoVehiculo,int idVehiculo,int matricula,String marca,String capacidad,String modelo,String categoria) {
	String query = "insert into  tblvehiculos (tipovhiculo,idvehiculo,matricula,marca,capacidad,modelo,categoria) VALUES (?,?,?,?,?,?,?)";

    try {
        Connection conexBd = Conexion.conectarBD();
        PreparedStatement ps = conexBd.prepareCall(query);
        
        ps.setInt(1, idTipoVehiculo);
        ps.setInt(2, idVehiculo);
        ps.setInt(3, matricula);
        ps.setString(4, marca);                                       
        ps.setString(5,capacidad);
        ps.setString(6, modelo);
        ps.setString(7,categoria);
       
     
     
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
public void eliminar (int idVehiculo) {
	String query = "delete from  tblvehiculos where idvehiculo = ?";

    try {
        Connection conexBd = Conexion.conectarBD();
        PreparedStatement ps = conexBd.prepareCall(query);
        
      
        ps.setInt(1, idVehiculo);
      
       
     
     
        int filasAfectadas = ps.executeUpdate();
        if (filasAfectadas > 0) {
        	JOptionPane.showMessageDialog(null,"Datos eliminados exitosamente.");
        } else {
        	JOptionPane.showMessageDialog(null,"No se pudo eliminar el registro.");
        }

    } catch (SQLException e) {
    	JOptionPane.showMessageDialog(null,"Error al eliminar datos de la fila" + e.getMessage());
	
	
	
    }
}

public void consultar (int id, JTextField idTipoVehiculo, JTextField  idVehiculo,  JTextField  matricula ,JTextField marca, JTextField capacidad, JTextField modelo, JTextField categoria ) {
	String query = "SELECT * FROM  tblvehiculos where idvehiculo = ?" ;
	  // Conectar a la base de datos
Connection conexBd =  Conexion.conectarBD();
try {
		PreparedStatement ps = conexBd.prepareCall(query);
		ps.setInt(1,id);
		ResultSet result = ps.executeQuery();
		while (result.next()) {
			
			
			
			  idTipoVehiculo.setText(result.getString(1));
		        idVehiculo.setText(result.getString(2));
		        matricula.setText(result.getString(3));
		        marca.setText(result.getString(4));                                   
		        capacidad.setText(result.getString(5));
		        modelo.setText(result.getString(6));
		       categoria.setText(result.getString(7));
		       
			
		
            }


} catch (SQLException e) {
		// TODO Auto-generated catch block
System.out.println("error al consultar"+e.getMessage());
	}

}
public void modificar (int idTipoVehiculo,int idVehiculo,int matricula,String marca,String capacidad,String modelo,String categoria) {
	String query = "update  tblvehiculos set tipovhiculo = ?, matricula = ?, marca = ?, capacidad = ?, modelo = ?, categoria = ? where  idvehiculo = ?";

    try {
        Connection conexBd = Conexion.conectarBD();
        PreparedStatement ps = conexBd.prepareCall(query);
        
        ps.setInt(1, idTipoVehiculo);
        ps.setInt(2, matricula);
        ps.setString(3, marca);                                       
        ps.setString(4,capacidad);
        ps.setString(5, modelo);
        ps.setString(6,categoria);
        ps.setInt(7, idVehiculo);
       
     
     
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
