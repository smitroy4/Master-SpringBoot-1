package com.smit.Master_SpringBoot_1.controller;

import com.smit.Master_SpringBoot_1.dto.StudentDto;
import com.smit.Master_SpringBoot_1.entity.Student;
import com.smit.Master_SpringBoot_1.repository.StudentRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController  //Inclusive of @Controller (Handler Mapping) and @ResponseBody (Response return in JSON)
public class StudentController {

    private final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/student")
    public List<Student> getStudent(){
        return studentRepository.findAll();
    }

    @GetMapping("/student/{id}")
    public StudentDto getStudentById(){
        return new StudentDto(4L, "Smit", "smit@gmail.com");
    }
}
