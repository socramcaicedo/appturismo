package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import conroller.Conexion;

public class Paquetes {
	int código;
	public Paquetes(int código, int idDestino, int idOrigen, String fechaVenta, String horaVenta, String horaSalida,
			String fechaEjecucion, String observación, String precio, int idAgencia, int idClientes, int idMedios,
			int idPromotor, int idVehiculo) {
		super();
		this.código = código;
		this.idDestino = idDestino;
		this.idOrigen = idOrigen;
		this.fechaVenta = fechaVenta;
		this.horaVenta = horaVenta;
		this.horaSalida = horaSalida;
		this.fechaEjecucion = fechaEjecucion;
		this.observación = observación;
		this.precio = precio;
		this.idAgencia = idAgencia;
		this.idClientes = idClientes;
		this.idMedios = idMedios;
		this.idPromotor = idPromotor;
		this.idVehiculo = idVehiculo;
	}
	int idDestino;
	public int getCódigo() {
		return código;
	}
	public void setCódigo(int código) {
		this.código = código;
	}
	public int getIdDestino() {
		return idDestino;
	}
	public void setIdDestino(int idDestino) {
		this.idDestino = idDestino;
	}
	public int getIdOrigen() {
		return idOrigen;
	}
	public void setIdOrigen(int idOrigen) {
		this.idOrigen = idOrigen;
	}
	public String getFechaVenta() {
		return fechaVenta;
	}
	public void setFechaVenta(String fechaVenta) {
		this.fechaVenta = fechaVenta;
	}
	public String getHoraVenta() {
		return horaVenta;
	}
	public void setHoraVenta(String horaVenta) {
		this.horaVenta = horaVenta;
	}
	public String getHoraSalida() {
		return horaSalida;
	}
	public void setHoraSalida(String horaSalida) {
		this.horaSalida = horaSalida;
	}
	public String getFechaEjecucion() {
		return fechaEjecucion;
	}
	public void setFechaEjecucion(String fechaEjecucion) {
		this.fechaEjecucion = fechaEjecucion;
	}
	public String getObservación() {
		return observación;
	}
	public void setObservación(String observación) {
		this.observación = observación;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	public int getIdAgencia() {
		return idAgencia;
	}
	public void setIdAgencia(int idAgencia) {
		this.idAgencia = idAgencia;
	}
	public int getIdClientes() {
		return idClientes;
	}
	public void setIdClientes(int idClientes) {
		this.idClientes = idClientes;
	}
	public int getIdMedios() {
		return idMedios;
	}
	public void setIdMedios(int idMedios) {
		this.idMedios = idMedios;
	}
	public int getIdPromotor() {
		return idPromotor;
	}
	public void setIdPromotor(int idPromotor) {
		this.idPromotor = idPromotor;
	}
	public int getIdVehiculo() {
		return idVehiculo;
	}
	public void setIdVehiculo(int idVehiculo) {
		this.idVehiculo = idVehiculo;
	}
	int idOrigen;
	String fechaVenta;
	String horaVenta;
	String horaSalida;
	String fechaEjecucion;
	String observación;
	String precio;
	int idAgencia;
	int idClientes;
	int idMedios;
	int idPromotor;
	int idVehiculo;
	
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
