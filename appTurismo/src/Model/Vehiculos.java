package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

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
}
