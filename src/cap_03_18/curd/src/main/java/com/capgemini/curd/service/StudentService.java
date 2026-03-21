package com.capgemini.curd.service;


import com.capgemini.curd.dto.StudentDTO;
import com.capgemini.curd.entity.Student;

public interface StudentService {
    String signup(StudentDTO studentDTO);

    Student getByID(int id);
    String signin(String email, String password);
    String update(StudentDTO studentDTO, int id);
}
