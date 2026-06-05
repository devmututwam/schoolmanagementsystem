package com.schoolmanagementsystem.schoolmanagementsystem.modules.student.controller;

import com.schoolmanagementsystem.schoolmanagementsystem.modules.student.model.Student;
import com.schoolmanagementsystem.schoolmanagementsystem.modules.student.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentRepository repository;

    @GetMapping
    @PreAuthorize("hasAnyRole('ADMIN', 'TEACHER')")
    public ResponseEntity<List<Student>> findAll() {
        return ResponseEntity.ok(repository.findAll());
    }

    @PostMapping
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Student> save(@RequestBody Student student) {
        return ResponseEntity.ok(repository.save(student));
    }
}
