package com.tejaswini.students.controllers;

import com.tejaswini.students.dtos.StudentDto;
import com.tejaswini.students.models.Student;
import com.tejaswini.students.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    private StudentService studentService;

    @Autowired
     public StudentController(StudentService studentService){
         this.studentService=studentService;
     }

    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @PostMapping
    public void createStudent(@RequestBody StudentDto studentDto) {

        studentService.createStudent(studentDto);
    }
    @PutMapping("/{studentId}")
    public void updateStudent(@RequestBody StudentDto studentDto,@PathVariable String studentId){
        studentService.updateStudent(studentDto,studentId);
    }

    @DeleteMapping("/{studentId}")
    public void deleteStudent(@PathVariable String studentId) {
        studentService.deleteStudent(studentId);
    }
}
