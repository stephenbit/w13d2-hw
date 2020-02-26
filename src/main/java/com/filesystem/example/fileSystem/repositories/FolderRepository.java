package com.filesystem.example.fileSystem.repositories;

import com.filesystem.example.fileSystem.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder,  Long> {
}
