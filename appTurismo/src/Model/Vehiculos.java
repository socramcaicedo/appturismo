package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import conroller.Conexion;

public class Vehiculos {
int idVehiculo;
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
public String getMatricula() {
	return matricula;
}
public void setMatricula(String matricula) {
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
public Vehiculos(int idVehiculo, int idTipoVehiculo, String matricula, String marca, String capacidad, String modelo,
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
int idTipoVehiculo;
String matricula;
String marca;
String capacidad;
String modelo;
String categoria;

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
