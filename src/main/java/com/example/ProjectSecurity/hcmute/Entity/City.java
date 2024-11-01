package com.example.ProjectSecurity.hcmute.Entity;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "city")
public class City implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    // Getters và setters
}
