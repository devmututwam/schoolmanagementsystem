package com.schoolmanagementsystem.schoolmanagementsystem.modules.student.model;

import com.schoolmanagementsystem.schoolmanagementsystem.modules.auth.model.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(unique = true, nullable = false)
    private String enrollmentNo;

    private LocalDate dateOfBirth;

    private String address;

    private String parentContact;
}
