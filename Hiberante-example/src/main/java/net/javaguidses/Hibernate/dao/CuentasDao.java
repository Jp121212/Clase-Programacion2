package net.javaguidses.Hibernate.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import net.javaguidses.Hibernate.model.Cuentas;
import net.javaguidses.Hibernate.util.HibernateUtil;
public class CuentasDao {
		public static void saveCuentas(Cuentas cuenta) {
			Transaction transaction = null;
			
			//auto cerrar session 
			try ( Session session = HibernateUtil.getSessionFactory().openSession()){
				//Empezar transaction
			transaction =session.beginTransaction();
				//Guardar cuenta
				session.save(cuenta);
				
				//Subir cuenta
				transaction.commit();
				
					
			}catch(Exception e) {
				if (transaction != null) {
					transaction.rollback();
				}
		}
	}

}
