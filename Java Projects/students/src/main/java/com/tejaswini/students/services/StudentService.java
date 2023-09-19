package com.tejaswini.students.services;

import com.tejaswini.students.controllers.StudentController;
import com.tejaswini.students.dtos.StudentDto;
import com.tejaswini.students.models.Student;
import com.tejaswini.students.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private StudentRepository studentRepository;
    @Autowired
    public StudentService(StudentRepository studentRepository){
        this.studentRepository=studentRepository;
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public void createStudent(StudentDto studentDto) {
        Student student = new Student();
        student.setAddress(studentDto.getAddress());
        student.setRank(studentDto.getRank());
        student.setName(studentDto.getName());
        student.setPhoneNo(studentDto.getPhoneNo());
        student.setMailId(studentDto.getMailId());
        student.setRollNo(studentDto.getRollNo());
        studentRepository.save(student);
    }

    public void updateStudent(StudentDto studentDto, String studentId) {
        Optional<Student> optionalStudent = studentRepository.findById(Integer.valueOf(studentId));
        if (optionalStudent.isPresent()) {
            Student student = optionalStudent.get();
            student.setAddress(studentDto.getAddress());
            student.setRank(studentDto.getRank());
            student.setName(studentDto.getName());
            student.setPhoneNo(studentDto.getPhoneNo());
            student.setMailId(studentDto.getMailId());
            student.setRollNo(studentDto.getRollNo());
            studentRepository.save(student);


        }
    }

    public void deleteStudent(String studentId) {
        Optional<Student> optionalStudent = studentRepository.findById(Integer.valueOf(studentId));
        if (optionalStudent.isPresent()) {
            Student student = optionalStudent.get();
            studentRepository.delete(student);
        }
    }
}
