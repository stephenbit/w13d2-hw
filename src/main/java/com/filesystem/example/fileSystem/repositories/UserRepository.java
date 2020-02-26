package com.filesystem.example.fileSystem.repositories;


import com.filesystem.example.fileSystem.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
