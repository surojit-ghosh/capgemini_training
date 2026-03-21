package com.capgemini.curd.service;

import com.capgemini.curd.dto.StudentDTO;
import com.capgemini.curd.entity.Student;
import com.capgemini.curd.repository.StudentRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public String signup(StudentDTO studentDTO) {
        Student student = new Student();

        BeanUtils.copyProperties(studentDTO, student);
        studentRepository.save(student);

        return "Student signed up successfully";
    }

    @Override
    public Student getByID(@RequestParam int id) {
        Optional<Student> student = studentRepository.findById(id);

        if (student.isPresent()) {
            return student.get();
        }

        return null;
    }

    @Override
    public String signin(String email, String password) {
        System.out.println(email);
        System.out.println(password);
        Optional<Student> studentOptional = studentRepository.findByEmail(email);
        if (studentOptional.isPresent()) {
            Student student = studentOptional.get();
            System.out.println(student);
            if (student.getPassword().equals(password)) {
                return "Sign-in successful";
            }
        }
        return "Wrong email or password.";
    }

    @Override
    public String update(StudentDTO studentDTO, int id) {
        Optional<Student> optionalStudent = studentRepository.findById(id);
        if (optionalStudent.isPresent()) {
            Student student = optionalStudent.get();

            if (studentDTO.getStudentName() != null) student.setStudentName(studentDTO.getStudentName());
            if (studentDTO.getEmail() != null) student.setEmail(studentDTO.getEmail());
            if (studentDTO.getAge() != 0) student.setAge(studentDTO.getAge());
            if (studentDTO.getGender() != null) student.setGender(studentDTO.getGender());
            if (studentDTO.getMarks() != 0) student.setMarks(studentDTO.getMarks());
            if (studentDTO.getPassword() != null) student.setPassword(studentDTO.getPassword());
            if (studentDTO.getStream() != null) student.setStream(studentDTO.getStream());

            studentRepository.save(student);
            return "Student updated successfully";
        }
        return "No Student found with the given ID.";
    }
}
