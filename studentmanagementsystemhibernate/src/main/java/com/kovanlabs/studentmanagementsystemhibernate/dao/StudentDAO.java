//package com.kovanlabs.studentmanagementsystemhibernate.dao;
//
//import com.kovanlabs.studentmanagementsystemhibernate.model.StudentModel;
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.PersistenceContext;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public class StudentDAO {
//
//    @PersistenceContext
//    private EntityManager entityManager;
//
//    public List<StudentModel> allStudent() {
//        return entityManager
//                .createQuery("from StudentModel", StudentModel.class)
//                .getResultList();
//    }
//}
//
////
////@Repository
////public class StudentDAO {
////    public List<StudentModel> allStudent() {
////        List<StudentModel> students = null;
////        try {
////            Session session = HibernateUtil.getSessionFactory().openSession();
////            Transaction transaction = session.beginTransaction();
////            students = session.createQuery("from StudentModel", StudentModel.class).list();
////            transaction.commit();
////            session.close();
////        } catch (Exception e) {
////            e.printStackTrace();
////        }
////        return students;
////    }
////}
////
