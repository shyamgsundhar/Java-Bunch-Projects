package com.kovanlabs.studentmanagementsystemhibernate.service;

//import com.kovanlabs.studentmanagementsystemhibernate.dao.StudentDAO;
import com.kovanlabs.studentmanagementsystemhibernate.dao.StudentRepository;
import com.kovanlabs.studentmanagementsystemhibernate.model.StudentModel;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;
   // private StudentDAO studentDAO;

    public List<StudentModel> allStudents() {
        return studentRepository.findAll();
    }
}