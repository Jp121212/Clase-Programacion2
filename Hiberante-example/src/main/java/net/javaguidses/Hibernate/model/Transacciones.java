package net.javaguidses.Hibernate.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GenerateType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Transaccion")

public class Transacciones{
	
	@Id
	@GeneratedValue(strategy =  GenerateType.AUTO)
	private int id;
	@Column(name = "monto")
	protected int Monto;
	@Column(name = "Cuenta")
	protected int Cuenta;
	@Column(name = "Detalle")
	 private String Detalle;
	@Column(name = "TipoTransaccion")
	 private String TipoTransaccion;
	
	 
	 
	 
	public Transacciones() {
		super();
	}
	
	public Transacciones(int Monto, int Cuenta, String Detalle, String Tipotransaccion) {
		super();
	;
		this.Monto = Monto;
		this.Cuenta = Cuenta;
		this.Detalle = Detalle;
		TipoTransaccion = Tipotransaccion;
	}
	public int getNocuenta() {
		return id;
	}
	public void setNocuenta(int nocuenta) {
		id = nocuenta;
	}
	public int  getMonto() {
		return Monto;
	}
	public void getMonto(int Monto) {
		this.Monto = Monto;
	}
	public int getCuenta() {
		return Cuenta;
	}
	public void setCuenta(int Cuenta) {
		this.Cuenta = Cuenta;
	}
	public String getDetalle() {
		return Detalle;
	}
	public void setDetalle(String Detalle) {
		this.Detalle = Detalle;
	}
	public String getTipoTransaccion() {
		return TipoTransaccion;
	}
	public void setTipoTransacion(String Tipotransaccion) {
		TipoTransaccion = Tipotransaccion;
	}}