package com.filesystem.example.fileSystem.components;

import com.filesystem.example.fileSystem.models.File;
import com.filesystem.example.fileSystem.models.Folder;
import com.filesystem.example.fileSystem.models.User;
import com.filesystem.example.fileSystem.repositories.FileRepository;
import com.filesystem.example.fileSystem.repositories.FolderRepository;
import com.filesystem.example.fileSystem.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;


    public DataLoader() {

    }

    public void run(ApplicationArguments args) {

        Folder baz = new Folder("The Mind Of Baz");
        folderRepository.save(baz);

        File beer = new File("beer", ".jpg", 25);
        fileRepository.save(beer);

        User stephen = new User("Stephen");
        userRepository.save(stephen);
    }
}
