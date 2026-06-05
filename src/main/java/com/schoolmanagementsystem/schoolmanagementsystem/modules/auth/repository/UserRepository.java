package com.schoolmanagementsystem.schoolmanagementsystem.modules.auth.repository;

import com.schoolmanagementsystem.schoolmanagementsystem.modules.auth.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(String email);
}
