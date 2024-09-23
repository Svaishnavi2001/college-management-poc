package com.college.service;

import com.college.model.Student;
import com.college.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public List<Student> getAllStudents(){
        return studentRepo.findAll();
    }

    public Optional<Student> getStudentById(Integer id){
        return studentRepo.findById(id);
    }

    public Student getStudentByName(String name){
        return studentRepo.findByName(name);
    }

    public Student addStudent(Student student){
        return studentRepo.save(student);
    }

    public Student updateStudent(Integer id, Student updatedStudent){
        Student existingStu= studentRepo.findById(id).orElseThrow();

        existingStu.setId(updatedStudent.getId());
        existingStu.setName(updatedStudent.getName());
        existingStu.setEmail(updatedStudent.getEmail());
        existingStu.setMarks(updatedStudent.getMarks());
        return studentRepo.save(existingStu);
    }

    public  void deleteStudentById(Integer id){
        studentRepo.deleteById(id);
    }

    public void  deleteStudentByName(String name){
         studentRepo.deleteByName(name);
    }

    public List<Student> addManyStudent(List<Student> students) {
        return studentRepo.saveAll(students);
//        List<Student> response = new ArrayList<>();
//        for (Student student : students ){
//            Student student1 = studentRepo.save(student);
//        }
    }
}
