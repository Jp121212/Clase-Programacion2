package net.javaguides.hibernate;
import java.util.Scanner;
//ee//
import net.javaguidses.Hibernate.dao.CuentasDao;
import net.javaguidses.Hibernate.model.Cuentas;


public class App {
   public static void main(String[]args) {
 
	   CuentasDao cuentasDao = new CuentasDao();
	   Cuentas cuentacorriente1 = new Cuentas("Kiki Perez",500 , "Si", "Cuenta corriente");
	   CuentasDao.saveCuentas(cuentacorriente1);
	   Cuentas cuentacorriente2 = new Cuentas("Alfredo Jimenez", 500, "Si", "Cuenta corriente");
	   CuentasDao.saveCuentas(cuentacorriente2);
	   Cuentas cuentacorriente3 = new Cuentas("Pablo Piedra", 500, "Si", "Cuenta corriente");
	   CuentasDao.saveCuentas(cuentacorriente3);
	   Cuentas cuentaahorro1= new Cuentas("Carol Jimenez", 2500, "Si", "Cuenta de Ahorros");
	   CuentasDao.saveCuentas(cuentaahorro1);
	   Cuentas cuentaahorro2= new Cuentas("Luis Hes", 2500, "Si", "Cuenta de Ahorros");
	   CuentasDao.saveCuentas(cuentaahorro2);
	   Cuentas cuentaahorro3= new Cuentas("Kid Pas", 2500, "Si", "Cuenta de Ahorros");
	   CuentasDao.saveCuentas(cuentaahorro3);
	   
	   String Usuario;
       String Pass;
    Pass = "123";
   Usuario = "admin";
   @SuppressWarnings("resource")
Scanner input1 = new Scanner(System.in);
    System.out.println("Introduce tu usuario : ");
    String Usuarioa = input1.next();

try (Scanner input2 = new Scanner(System.in)) {
	System.out.println("Contraseña : ");
	String Passw = input2.next();
	
	;
	
	  if (Usuario.equals(Usuarioa) && Passw.equals(Pass)) {
	     boolean salir = true;
	
	         while(salir){
	        	 @SuppressWarnings("resource")
				Scanner sn1 = new Scanner(System.in);
	        	 int opcion; 
	        	 int opcion1;
	        	 int opcion2;
	        	 int opcion3;
	
	             System.out.println("Bienvenido Al Simulador de cuentas Bancarias");
	             System.out.println("-----MENU PRINCIPAL----");
	             System.out.println("1. Ver cuentas");
	             System.out.println("2. Retirar dinero");
	             System.out.println("3. Depositar dinero");
	             System.out.println("4. Realizar transferencia");
	             System.out.println("------------------------------------");
	             System.out.println("Introduce una opcion: ");
	             opcion = sn1.nextInt();
	             switch(opcion){
	             case 1:
	            	 System.out.println("===========Cuentas Corrientes========");
	             		 cuentacorriente1.obtenerinformacion();
	                     cuentacorriente2.obtenerinformacion();
	                     cuentacorriente3.obtenerinformacion();
	                 System.out.println("===========Cuentas de Ahorro========");
	                     cuentaahorro1.obtenerinformacion();
	                     cuentaahorro2.obtenerinformacion();
	                     cuentaahorro3.obtenerinformacion();
	                     System.out.println("--------------------")
	                     ; break;
	             case 2:
	            	 System.out.println("============Digita en que cuenta deseas realizar el retiro==============");
	                 System.out.println("1- Cuenta Corriente Kiki Martinez ");
	                 System.out.println("2- Cuenta Corriente Alfredo Jimenez ");
	                 System.out.println("3- Cuenta Corriente Pablo Piedra");
	                 System.out.println("4- Cuenta Ahorro Carol Jimenez ");
	                 System.out.println("5- Cuenta Ahorro Luis Hes");
	                 System.out.println("6- Cuenta Ahorro Kid Pas");
	                 System.out.println("=======================================================================");
					 System.out.println("Introduce una opcion: ");
					 opcion1 = sn1.nextInt();
	                     switch(opcion1){
	                     case 1:
	                    	 cuentacorriente1.Submenu();
	                         System.out.println("Retiro Efectuado exitosamente");break;
	                     case 2:
	                    	 cuentacorriente2.Submenu();
                             System.out.println("Retiro Efectuado exitosamente");break;
	                     case 3:
	                    	 cuentacorriente3.Submenu();
                             System.out.println("Retiro Efectuado exitosamente");break;
	                     case 4:
	                    	 cuentaahorro1.Submenu();
                             System.out.println("Retiro No Efectuado");break;
	                     case 5:
	                    	 cuentaahorro2.Submenu();
                             System.out.println("Retiro No Efectuado");break;
	                     case 6:
	                    	 cuentaahorro3.Submenu();
	                         System.out.println("Retiro No Efectuado");break;}break;
	            	 
	             case 3:
	            	 System.out.println("============Digita en que cuenta deseas realizar el deposito==============");
                     System.out.println("1- Cuenta Corriente Kiki Martinez ");
                     System.out.println("2- Cuenta Corriente Alfredo Jimenez ");
                     System.out.println("3- Cuenta Corriente Pablo Piedra");
                     System.out.println("4- Cuenta Ahorro Carol Jimenez ");
                     System.out.println("5- Cuenta Ahorro Luis Hes");
                     System.out.println("6- Cuenta Ahorro Kid Pas");
                     System.out.println("=======================================================================");
                     System.out.println("Introduce una opcion: ");
                     opcion2 = sn1.nextInt();
                     switch(opcion2){
                         case 1:
                             cuentacorriente1.Submenu2();
                             System.out.println("Deposito efectuado");break;
                         case 2:
                             cuentacorriente2.Submenu2();
                             System.out.println("Deposito efectuado");break;
                         case 3:
                             cuentacorriente3.Submenu2();
                             System.out.println("Deposito efectuado");break;
                         case 4:
                             cuentaahorro1.Submenu2();
                             System.out.println("Deposito efectuado");break;
                         case 5:
                             cuentaahorro2.Submenu2();
                             System.out.println("Deposito efectuado");break;
                         case 6:
                             cuentaahorro3.Submenu2();
                             System.out.println("Deposito efectuado");break;

                     }break;
	             case 4:
	            	 
	            	 System.out.println("==========Realizando Transferencia==============");
                     System.out.println("----Cuentas Disponibles--------");
                     cuentacorriente1.Vistadecuentas();
                     System.out.println("------------------------------");
                     cuentacorriente2.Vistadecuentas();
                     System.out.println("------------------------------");
                     cuentacorriente3.Vistadecuentas();
                     System.out.println("------------------------------");
                     cuentaahorro1.Vistadecuentas();
                     System.out.println("------------------------------");
                     cuentaahorro2.Vistadecuentas();
                     System.out.println("------------------------------");
                     cuentaahorro3.Vistadecuentas();
                     System.out.println("------------------------------");
                     System.out.println("Pulsa 1 para continuar: ");
                     opcion3 = sn1.nextInt();
                     switch(opcion3){
                     case 1:
                         System.out.println("Bienvenido");
                          int CuentaEnvio;
                          int ID;
                          int Monto;
                          
                         String detalles;
                         System.out.println("Dinos la cuenta que deseas realizar el envio: ");
                         CuentaEnvio = sn1.nextInt();
                         System.out.println("Introduce Tu ID (*numero de tu cuenta*): ");
                         ID = sn1.nextInt();
                         System.out.println("introduce el monto que vas a enviar: ");
                         Monto = sn1.nextInt();
                         Scanner scanner = new Scanner(System.in);
                         System.out.println("Introduce los detalles: ");
                         detalles = scanner.nextLine();
                         switch(ID){
                             case 1:
                         if (Monto < 1000) {
                                  cuentacorriente1.EnviarTransferencia(ID, Monto, ID, detalles, "Envio Transferencia");
                                  System.out.println("=============================");
                                 cuentacorriente1.verHistorialTransacciones();
                                  System.out.println("=============================");}
                         else{
                             System.out.println("NO SE PUEDEN REALIZAR TRANSFERENCIAS A MAS DEL MONTO PERMITIDO");}break;

                             case 2:
                                 if (Monto < 1000) {
                                     cuentacorriente2.EnviarTransferencia(ID, Monto, ID, detalles, "Envio Transferencia");
                                     System.out.println("=============================");
                                     cuentacorriente2.verHistorialTransacciones();
                                     System.out.println("=============================");}
                                 else{
                                     System.out.println("NO SE PUEDEN REALIZAR TRANSFERENCIAS A MAS DEL MONTO PERMITIDO");}break;

                             case 3:
                                 if (Monto < 1000) {
                                     cuentacorriente3.EnviarTransferencia(ID, Monto, ID, detalles, "Envio Transferencia");
                                     System.out.println("=============================");
                                     cuentacorriente3.verHistorialTransacciones();
                                     System.out.println("=============================");}
                                 else{
                                     System.out.println("NO SE PUEDEN REALIZAR TRANSFERENCIAS A MAS DEL MONTO PERMITIDO");}break;

                             case 4:
                                 if (Monto < 2500) {
                                     cuentaahorro1.EnviarTransferencia(ID, Monto, ID, detalles, "Envio Transferencia");
                                     System.out.println("=============================");
                                     cuentaahorro1.verHistorialTransacciones();
                                     System.out.println("=============================");}
                                 else{
                                     System.out.println("NO SE PUEDEN REALIZAR TRANSFERENCIAS A MAS DEL MONTO PERMITIDO");}break;

                             case 5:
                                 if (Monto < 2500) {
                                     cuentaahorro2.EnviarTransferencia(ID, Monto, ID, detalles, "Envio Transferencia");
                                     System.out.println("=============================");
                                     cuentaahorro2.verHistorialTransacciones();
                                     System.out.println("=============================");}
                                 else{
                                     System.out.println("NO SE PUEDEN REALIZAR TRANSFERENCIAS A MAS DEL MONTO PERMITIDO");}break;

                             case 6:
                                 if (Monto < 2500) {
                                     cuentaahorro3.EnviarTransferencia(ID, Monto, ID, detalles, "Envio Transferencia");
                                     System.out.println("=============================");
                                     cuentaahorro3.verHistorialTransacciones();
                                     System.out.println("=============================");}
                                 else{
                                     System.out.println("NO SE PUEDEN REALIZAR TRANSFERENCIAS A MAS DEL MONTO PERMITIDO");}break;


                         }
                         switch(CuentaEnvio){
                             case 1:
                                 if (Monto < 1000){
                                 cuentacorriente1.RecibirTransferencia1(ID,Monto,CuentaEnvio,detalles,"Transferencia realizada");
                                 cuentacorriente1.verHistorialTransacciones();}
                                 else{
                                     System.out.println("NO SE PUEDE RECIBIR A MAS DEL MONTO PERMITIDO");}break;
                             case 2:
                                 if (Monto < 1000){
                                 cuentacorriente2.RecibirTransferencia1(ID, Monto, CuentaEnvio,detalles, "Transferencia realizada");
                                 cuentacorriente2.verHistorialTransacciones();}
                                 else{
                                     System.out.println("NO SE PUEDEN RECIBIR A MAS DEL MONTO PERMITIDO");}break;
                             case 3:
                                 if (Monto < 1000){
                                 cuentacorriente3.RecibirTransferencia1(ID, Monto, CuentaEnvio,detalles, "transferencia realizada");
                                 cuentacorriente3.verHistorialTransacciones();}
                                 else{
                                     System.out.println("NO SE PUEDEN RECIBIR A MAS DEL MONTO PERMITIDO");}break;
                             case 4:
                                 if (Monto < 2500){
                                 cuentaahorro1.RecibirTransferencia1(ID, Monto, CuentaEnvio,detalles, "Transferencia realizada");
                                 cuentaahorro1.verHistorialTransacciones();}
                                 else{
                                     System.out.println("NO SE PUEDEN RECIBIR A MAS DEL MONTO PERMITIDO");}break;
                             case 5:
                                 if (Monto < 2500){
                                 cuentaahorro2.RecibirTransferencia1(ID, Monto, CuentaEnvio,detalles, "Transferencia realizada");
                                 cuentaahorro2.verHistorialTransacciones();}
                                 else{
                                     System.out.println("NO SE PUEDEN RECIBIR A MAS DEL MONTO PERMITIDO");}break;

                             case 6:
                                 if (Monto < 2500){
                                 cuentaahorro3.RecibirTransferencia1(ID, Monto, CuentaEnvio,detalles, "Transferencia realizada");
                                 cuentaahorro3.verHistorialTransacciones();}
                                 else{
                                     System.out.println("NO SE PUEDEN RECIBIR A MAS DEL MONTO PERMITIDO");}break;
                     }
                 }
                      break;
             }
	                 
	                     
	      }} else if (Usuario.equals(Usuarioa)) {
	             		 System.out.println("Contraseña invalida!");
	   } else if (Pass.equals(Passw)) {
	      System.out.println("Usuario invalido!");
	   } else {
	         System.out.println("Usuario y contraseña invalida!");}
}

   }
   
   }	 