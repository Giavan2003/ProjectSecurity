//package com.example.ProjectSecurity.hcmute.Entity;
//
//
//import jakarta.persistence.*;
//
//import java.io.Serializable;
//import java.time.LocalDateTime;
//
//@Entity
//@Table(name = "employer")
//public class Employer implements Serializable {
//
//    private static final long serialVersionUID = 1L;
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer id;
//
//    @Column(nullable = false, unique = true)
//    private String email;
//
//    @Column(nullable = false)
//    private String password;
//
//    @Column(name = "access_token")
//    private String accessToken;
//
//    private String phone;
//
//    private String avatar;
//
//    @Column(columnDefinition = "TINYINT(1) DEFAULT 1")
//    private Boolean status = true;
//
//    @Column(name = "company_name", nullable = false)
//    private String companyName;
//
//    @Column(name = "company_address")
//    private String companyAddress;
//
//    @Column(name = "company_description")
//    private String companyDescription;
//
//    @Column(name = "company_phone")
//    private String companyPhone;
//
//    @Column(name = "company_logo")
//    private String companyLogo;
//
//    @Column(nullable = false, unique = true)
//    private String slug;
//
//    @Column(name = "status_online", columnDefinition = "TINYINT(1) DEFAULT 0")
//    private Boolean statusOnline = false;
//
//    @Column(name = "created_at", nullable = false, updatable = false, insertable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
//    private LocalDateTime createdAt;
//
//    @Column(name = "updated_at", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
//    private LocalDateTime updatedAt;
//
//    @ManyToOne
//    @JoinColumn(name = "city_id")
//    private City city;
//
//    @ManyToOne
//    @JoinColumn(name = "district_id")
//    private District district;
//
//    // Getters và setters
//}
//
