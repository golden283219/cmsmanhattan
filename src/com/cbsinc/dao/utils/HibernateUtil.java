package com.cbsinc.dao.utils;
import javax.naming.InitialContext;

import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;

public class HibernateUtil {

	private static SessionFactory sessionFactory;
	
//    static {
//      try {
//        sessionFactory = new Configuration().configure().buildSessionFactory();
//      } catch (Throwable ex) {
//        System.err.println("Initial SessionFactory creation failed." + ex);
//        throw new ExceptionInInitializerError(ex);
//      }
//    }

    public static SessionFactory getSessionFactory() {
      return sessionFactory;
    }
    
   

}
