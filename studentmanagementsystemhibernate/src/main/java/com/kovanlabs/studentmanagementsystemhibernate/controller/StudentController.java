package com.kovanlabs.studentmanagementsystemhibernate.controller;

import com.kovanlabs.studentmanagementsystemhibernate.model.StudentModel;
import com.kovanlabs.studentmanagementsystemhibernate.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/view")
    public List<StudentModel> studentModelListController() {
        return studentService.allStudents();
    }
}