package com.schoolmanagementsystem.schoolmanagementsystem.modules.student.repository;

import com.schoolmanagementsystem.schoolmanagementsystem.modules.student.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
