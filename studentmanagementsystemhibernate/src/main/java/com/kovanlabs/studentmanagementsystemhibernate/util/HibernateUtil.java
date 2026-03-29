//package com.kovanlabs.studentmanagementsystemhibernate.util;
//
//import com.kovanlabs.studentmanagementsystemhibernate.model.StudentModel;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
//
//public class HibernateUtil {
//    private static SessionFactory sessionFactory;
//    static {
//        try{
//            Configuration configuration = new Configuration();
//            configuration.configure("hibernate.cfg.xml");
//            configuration.addAnnotatedClass(StudentModel.class);
//            sessionFactory = configuration.buildSessionFactory();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }
//    public static SessionFactory getSessionFactory(){
//        return sessionFactory;
//    }
//}
