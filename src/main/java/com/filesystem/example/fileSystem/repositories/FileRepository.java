package com.filesystem.example.fileSystem.repositories;

import com.filesystem.example.fileSystem.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}