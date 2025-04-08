package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import conroller.Conexion;

public class Paquetes {
	
	
	public Paquetes(int idDestino, int idOrigen, String fechaVenta, String horaVenta, String horaSalida,
			String fechaEjecucion, String observación, String precio, int idAgencia, int idClientes, int idMedios,
			int idPromotor, int idVehiculo) {
		super();
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
	
	public Paquetes() {
		super();
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
	int codigo;
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Paquetes(int codigo) {
		super();
		this.codigo = codigo;
	}
	int idDestino;
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
	
	public void insertar (int idDestino,	int idOrigen,String fechaVenta,	String horaVenta,String horaSalida,String fechaEjecucion,String observación,String precio,int idAgencia,int idClientes,int idMedios,int idPromotor,int idVehiculo) {
		String query = "insert into tblpaquetes (id_destino,id_origen,fecha_venta,hora_venta,horasalida,fecha_ejecucion,observacion,precio,idagencia,idclientes,idmedios,idpromotor,idvehiculo) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            Connection conexBd = Conexion.conectarBD();
            PreparedStatement ps = conexBd.prepareCall(query);
            ps.setInt(1, idDestino);
            ps.setInt(2,idOrigen);
            ps.setString(3,fechaVenta);
            ps.setString(4, horaVenta);
            ps.setString(5,  horaSalida);
            ps.setString(6,fechaEjecucion);
            ps.setString(7,observación);
            ps.setString(8,precio);
            ps.setInt(9, idAgencia);
            ps.setInt(10,idClientes);
            ps.setInt(11,idMedios);
            ps.setInt(12,idPromotor);
            ps.setInt(13,idVehiculo);
           
           
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

	
	
	
	
	public void eliminar (int codigo) {
		String query = "delete from tblpaquetes where codigo =?";

        try {
            Connection conexBd = Conexion.conectarBD();
            PreparedStatement ps = conexBd.prepareCall(query);
            ps.setInt(1, codigo);
            
           
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

	 public void consultar (int codigo,    JTextField  idDestino,JTextField idOrigen ,JTextField fechaVenta ,  JTextField horaVenta, JTextField horaSalida, JTextField fechaEjecucion, JTextField observación, JTextField precio, JTextField idAgencia, JTextField idClientes, JTextField idMedios, JTextField idPromotor, JTextField idVehicul  ) {
			String query = "SELECT * FROM  tblpaquetes where codigo = ?" ;
			  // Conectar a la base de datos
Connection conexBd =  Conexion.conectarBD();
try {
				PreparedStatement ps = conexBd.prepareCall(query);
				ps.setInt(1,codigo);
				ResultSet result = ps.executeQuery();
				while (result.next()) {
					
					idDestino.setText(result.getString(2));
					idOrigen.setText(result.getString(3));
					 fechaVenta.setText(result.getString(4));
					 horaVenta.setText(result.getString(5));
					 horaSalida.setText(result.getString(6));
					fechaEjecucion.setText(result.getString(7));
					observación.setText(result.getString(8));
					precio.setText(result.getString(9));
					idAgencia.setText(result.getString(10));
					idClientes.setText(result.getString(11));
					idMedios.setText(result.getString(12));
					idPromotor.setText(result.getString(13));
					idVehicul.setText(result.getString(14));
					
					
				
		            }


} catch (SQLException e) {
				// TODO Auto-generated catch block
	System.out.println("error al consultar"+e.getMessage());
			}
	 
	 }
	
		public void modificar (int codigo, int idDestino,	int idOrigen,String fechaVenta,	String horaVenta,String horaSalida,String fechaEjecucion,String observación,String precio,int idAgencia,int idClientes,int idMedios,int idPromotor,int idVehiculo) {
			String query = "update tblpaquetes set id_destino = ?, id_origen = ?, fecha_venta = ?, hora_venta = ?,horasalida = ?, fecha_ejecucion = ?,observacion = ?, precio = ?, idagencia = ?, idclientes = ?, idmedios = ?, idpromotor = ?, idvehiculo = ?  where codigo = ?";

	        try {
	            Connection conexBd = Conexion.conectarBD();
	            PreparedStatement ps = conexBd.prepareCall(query);
	            ps.setInt(1, idDestino);
	            ps.setInt(2,idOrigen);
	            ps.setString(3,fechaVenta);
	            ps.setString(4, horaVenta);
	            ps.setString(5,  horaSalida);
	            ps.setString(6,fechaEjecucion);
	            ps.setString(7,observación);
	            ps.setString(8,precio);
	            ps.setInt(9, idAgencia);
	            ps.setInt(10,idClientes);
	            ps.setInt(11,idMedios);
	            ps.setInt(12,idPromotor);
	            ps.setInt(13,idVehiculo);
	            ps.setInt(14,codigo);
	           
	           
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
