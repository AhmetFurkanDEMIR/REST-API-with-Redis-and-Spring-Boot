package com.demir.redis.controller;

import com.demir.redis.entity.Student;
import com.demir.redis.repository.StudentRep;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    private final StudentRep repository;

    public StudentController(StudentRep repository) {
        this.repository = repository;
    }



    @GetMapping
    public ResponseEntity<List<Student>> getAll() {

        return ResponseEntity.ok().body(repository.getAll());
    }

    @PostMapping
    public ResponseEntity<Student> addStudent(@RequestBody Student student) {

        return ResponseEntity.ok().body(repository.addStudent(student));
    }

    @PutMapping
    public ResponseEntity<Student> updateStudent(@RequestBody Student student) {

        return ResponseEntity.ok().body(repository.updateStudent(student));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentId(@PathVariable String id) {

        return ResponseEntity.ok().body(repository.getStudentId(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable String id) {

        return ResponseEntity.ok().body(repository.deleteStudent(id));
    }



}
