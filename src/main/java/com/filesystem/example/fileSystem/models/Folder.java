package com.filesystem.example.fileSystem.models;

import javax.persistence.*;

@Entity
@Table(name = "folders")
public class Folder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String title;

    public Folder(String title) {
        this.title = title;
    }

    public Folder() {
    }
}
