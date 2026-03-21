package com.capgemini.curd.controller;

import com.capgemini.curd.dto.StudentDTO;
import com.capgemini.curd.entity.Student;
import com.capgemini.curd.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/signup")
    public String signup(@RequestBody @Valid StudentDTO studentDTO) {
        return studentService.signup(studentDTO);
    }


    @GetMapping("/find-by-id")
    public Student getByID(@RequestParam int id) {

        return studentService.getByID(id);
    }

    @PostMapping("/signin")
    public String signin(@RequestBody StudentDTO studentDTO) {
        return studentService.signin(studentDTO.getEmail(), studentDTO.getPassword());
    }

    @PutMapping("/update")
    public String update(@RequestBody StudentDTO studentDTO, @RequestParam int id) {
        return studentService.update(studentDTO, id);
    }
}
