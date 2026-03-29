package com.kovanlabs.studentmanagementsystemhibernate.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.kovanlabs.studentmanagementsystemhibernate.model.StudentModel;

public interface StudentRepository extends JpaRepository<StudentModel,Integer> {
}
