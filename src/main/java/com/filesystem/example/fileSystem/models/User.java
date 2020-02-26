package com.filesystem.example.fileSystem.models;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    public User(String name) {
        this.name = name;
    }

    public User() {
    }
}
