//package com.example.ProjectSecurity.hcmute.Entity;
//
//
//import jakarta.persistence.*;
//
//import java.io.Serializable;
//import java.time.LocalDateTime;
//
//@Entity
//@Table(name = "job_categories")
//public class JobCategory implements Serializable {
//
//    private static final long serialVersionUID = 1L;
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer id;
//
//    @Column(nullable = false)
//    private String title;
//
//    @Column(name = "parent_id")
//    private Integer parentId;
//
//    @Column(columnDefinition = "INT DEFAULT 0")
//    private Integer position = 0;
//
//    private String description;
//
//    @Column(columnDefinition = "TINYINT(1) DEFAULT 1")
//    private Boolean status = true;
//
//    @Column(nullable = false, unique = true)
//    private String slug;
//
//    private String keyword;
//
//    @Column(name = "created_at", nullable = false, updatable = false, insertable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
//    private LocalDateTime createdAt;
//
//    @Column(name = "updated_at", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
//    private LocalDateTime updatedAt;
//
//    // Getters và setters
//}
