package net.javaguidses.Hibernate.model;

import java.util.ArrayList;
import java.util.Scanner;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GenerateType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "cuentas")

public class Cuentas{
	
	@Id
	@GeneratedValue(strategy =  GenerateType.AUTO)
	private int id;
	@Column(name = "titular")
	protected String titular;
	@Column(name = "balance")
	protected int balance;
	@Column(name = "activa")
	 private String activa;
	@Column(name = "TipodeCuenta")
	 private String TipodeCuenta;
	
	 
	 
	 
	public Cuentas() {
		super();
	}
	
	public Cuentas(String titular, int balance, String activa, String tipodeCuenta) {
		super();
	;
		this.titular = titular;
		this.balance = balance;
		this.activa = activa;
		TipodeCuenta = tipodeCuenta;
	}
	public int getNocuenta() {
		return id;
	}
	public void setNocuenta(int nocuenta) {
		id = nocuenta;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getActiva() {
		return activa;
	}
	public void setActiva(String activa) {
		this.activa = activa;
	}
	public String getTipodeCuenta() {
		return TipodeCuenta;
	}
	public void setTipodeCuenta(String tipodeCuenta) {
		TipodeCuenta = tipodeCuenta;
	}
	 protected int Nocuenta;
	    
	    private int moneda;
	    protected int Transacciones1 = 0;
	    protected int Monto;
	    protected int balancemaximo = 1000;
	    protected int retiro;
	    protected int Depositar1;
	    protected int balance1;
	    public ArrayList<String> Nombretransaccion = new ArrayList<String>();
	    ArrayList<Integer> transacciones = new ArrayList<Integer>();
	    ArrayList<Integer> montos = new ArrayList<Integer>();
	    ArrayList<String> detalle = new ArrayList<String>();
	    ArrayList<String> Cuentas = new ArrayList<String>();
	    ArrayList<String> tipodetransaccionesArrayList = new ArrayList<String>();
	    
	    static class Transacciones{
	        protected int ID;
	        protected int Monto;
	        protected int Cuenta;
	        void Transacciones1 (int id, int monto, int cuenta, String detalle){
	            ID = id;
	            Monto = monto;
	            Cuenta = cuenta;

	        }
	        Transacciones (int monto, String detalle, String Detalle){
	        Monto = monto;
	        Detalle = detalle;
	        }
	    }

	    public void obtenerinformacion(){

	        String activa = "si";
	        System.out.println("==============================");
	        System.out.println("Numero de cuenta: " + Nocuenta+"  Titular: "+ titular+ "  Balance: "+ balance );
	        System.out.println("Esta activa: " + activa);
	        System.out.println("Moneda: "+ "$");
	        System.out.println("==============================");

	    }
	    public void DepositarDineros(int id, int monto){
	        Monto = monto;
	        balance = balance + Monto;
	        Transacciones1 = +1;
	        new Transacciones (Monto,"Deposito", activa);
	        detalle.add("deposito");



	    }
	    public void Retirardinero(int ID, int monto){
	        Monto = monto;
	        balance = balance - Monto;
	        Transacciones1 = +1;
	        new Transacciones(Monto,"Retiro", activa);
	       // Transacciones.add(depositoTransacciones.obtenerinformacion());//
	        detalle.add("retiro");

	    }
	    public void EnviarTransferencia(int ID, int Monto, int cuenta, String detalles,String Tipodetransaccion){
	        balance = balance - Monto;
	        Nombretransaccion.add("Envio de Transferencia de:" + Monto);
	        detalle.add(detalles);
	        transacciones.add(+1);
	        montos.add(Monto);
	        Transacciones1 = +1;
	    }
	    public void RecibirTransferencia1(int id, int Monto, int cuenta, String detalles, String Tipodetransaccion){
	        balance = balance + Monto;
	        Nombretransaccion.add("Transferencia recibida de:" + Monto);
	        detalle.add(detalles);
	        transacciones.add(+1);
	        montos.add(Monto);
	        Transacciones1 = +1;
	    }
	    public void Encontrarcuentas(int cuentas, int Nocuenta ){
	        System.out.println("Que cuenta deseas realizar la tranferencia?");
	        if (Nocuenta <= 5){
	         //   EnviarTransferencia(id, Monto, Cuenta, detalle, Tipodetransaccion.getNumerodecuenta());
	          //  RecibirTransferencia1(id, Monto, Cuenta, detalle, Tipodetransaccion.getNumerodecuenta());//
	        }
	        else{
	            System.out.println("No hay cuentas existentes");
	        }
	    }


	    public int getNumerodecuenta(){
	        return Nocuenta;
	    }
	    public String getActiva1() {
	        return activa;
	    }
	    public void setActiva1(String activa) {
	        this.activa = activa;
	    }
	    public int getMoneda() {
	        return moneda;
	    }
	    public void setMoneda(int moneda) {
	        this.moneda = moneda;
	    }
	    public void Depositardinero(int balance1){
	        balance = balance + balance1;
	        Nombretransaccion.add("Deposito de:" + balance1);
	        transacciones.add(+1);
	        montos.add(balance1);
	        Transacciones1 = +1;
	    }
	    public void Retirardinero(int retiro){
	        balance = balance - retiro;
	        Nombretransaccion.add("Retiro de: "+ retiro);
	        transacciones.add(+1);
	        montos.add(retiro);
	        Transacciones1 = +1;


	    }
	    public void EnviarTransferencia(int nocuentadestinatario_v,int monto2, String detalles){
	        if (monto2 < balance){
	            balance = balance - monto2;
	            Nombretransaccion.add("Envio transferencia de: "+ monto2);
	            transacciones.add(+1);
	            montos.add(monto2);
	            detalle.add(detalles);
	            Transacciones1 = +1;} else{
	            System.out.println("NO SE PUEDE TRANSFERIR MAS DE LO PERMITIDO");
	            Nombretransaccion.add(" Transferencia negada el monto:  " + monto2 +  "  sobrepasa el balance: " + balance +" de la cuenta");
	        }

	    }
	    public void verHistorialTransacciones(){
	        if (Transacciones1 > 0){
	            System.out.println("---------------------------------------");
	            System.out.println("Transacciones realizadas:"+ Nombretransaccion);
	            System.out.println("Numero de transacciones:"+ transacciones);
	            System.out.println("Numero de Cuenta: "+ Nocuenta);
	            System.out.println ("Nombre:"+ titular);
	            System.out.println("Balance: " + balance);
	            System.out.println("---------------------------------------");
	            System.out.println("Detalles de Transacciones: "+ detalle);
	            System.out.println("---------------------------------------");

	        } else{
	            System.out.println("No hay transacciones realizadas!!");
	        }

	    }
	    public void Vistadecuentas(){
	        System.out.println("Nombre:"+ titular);
	        System.out.println("Numero de Cuenta: "+ id);



	    }
	    public void RecibirTransferencia(int nocuentaremitente, int monto2, String detalles){
	        balance = balance + monto2;
	        Nombretransaccion.add("Transferencia Recibida de: "+ monto2);
	        transacciones.add(+1);
	        montos.add(monto2);
	        detalle.add(detalles);
	        Transacciones1 = +1;
	    }
	    public void Submenu(){
	        try{
	        try (Scanner sn = new Scanner(System.in)) {
				System.out.println("=====Haciendo Retiro=======");
				int retiro;
				System.out.println("Introduce el monto a retirar: ");
				retiro = sn.nextInt();
				Retirardinero(retiro);
			}}
	        catch(java.lang.NumberFormatException a){
	            a.printStackTrace();
	            System.err.println("El valor no puede ser una letra");
	        }
	    }
	    public void Submenu2(){
	        try (Scanner sn = new Scanner(System.in)) {
				System.out.println("=====Haciendo Deposito=======");
				int Depositar1;
				System.out.println("Introduce el monto a depositar: ");
				Depositar1 = sn.nextInt();
				Depositardinero(Depositar1);
			}
	    }



	}
	class Cuentacorriente extends Cuentas{
	    public int Balancemaximo;
	    public String Tieneseguro;
	    Cuentacorriente(int Nocuenta, String titular, int balance) {
	        super();
	        this.Nocuenta = Nocuenta;
	        this.titular = titular;
	        this.balance= balance;




	    }
	    public void Depositardinero(int Depositar1){
	        if (Depositar1 < 1000){
	            balance = balance + Depositar1;
	            Nombretransaccion.add("Deposito cuenta Corriente de: "+ Depositar1);
	            transacciones.add(+1);
	            montos.add(Depositar1);
	            Transacciones1 = +1;

	        } else {
	            System.out.println("NO SE PUEDE DEPOSITAR MAS DEL BALANCE");
	            Nombretransaccion.add("Deposito no efectuado el monto: " + Depositar1+ "  sobrepasa el monto permitido: "+ balancemaximo);

	        }
	    }
	    public void RecibirTransferencia(int recibe){
	        if (recibe < 1000){
	            recibe = balance+ recibe ;
	            Nombretransaccion.add("Recibir Transferencia de cuenta Corriente");
	            transacciones.add(+1);
	            montos.add(recibe);
	            Transacciones1 = +1;

	        } else {
	            System.out.println("NO SE PUEDE RETIRAR MAS DEL BALANCE");
	            Nombretransaccion.add("No se pudo recibir la transferencia.. el monto: " + recibe +  "   sobrepasa el monto permitido: "+ balancemaximo );

	        }}}

	class CuentaAhorro extends Cuentas{
	    public double intereses = 0.5;
	    public int balancemaximo;
	    CuentaAhorro(int Nocuenta, String titular,int balance) {
	        super();

	    }
	    public void Retirardinero(int retiro){
	        System.out.println("NO SE PUEDE RETIRAR DINERO DE UNA CUENTA DE AHORROS");
	        Nombretransaccion.add("Retiro Cuenta Ahorro no permitido de: "+ retiro);
	        transacciones.add(+1);
	        Transacciones1 = +1;
	    }


	    public void Actualizarintereses(){
	        //Cambiar intereses mas adelante con un input//
	        intereses = 0;


	    }}
	
