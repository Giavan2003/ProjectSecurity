//package com.example.ProjectSecurity.hcmute.Entity;
//
//import jakarta.persistence.*;
//
//import java.io.Serializable;
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//
//@Entity
//@Table(name = "job")
//public class Job implements Serializable {
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
//    private String description;
//
//    @ManyToOne
//    @JoinColumn(name = "employer_id")
//    private Employer employer;
//
//    @ManyToOne
//    @JoinColumn(name = "job_category_id")
//    private JobCategory jobCategory;
//
//    private String address;
//
//    @Column(nullable = false, unique = true)
//    private String slug;
//
//    private String keyword;
//
//    @Column(columnDefinition = "TINYINT(1) DEFAULT 1")
//    private Boolean status = true;
//
//    @Column(name = "created_at", nullable = false, updatable = false, insertable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
//    private LocalDateTime createdAt;
//
//    @Column(name = "updated_at", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
//    private LocalDateTime updatedAt;
//
//    @Column(name = "salary_min", precision = 10, scale = 2)
//    private Double salaryMin;
//
//    @Column(name = "salary_max", precision = 10, scale = 2)
//    private Double salaryMax;
//
//    @Column(name = "age_min")
//    private Integer ageMin;
//
//    @Column(name = "age_max")
//    private Integer ageMax;
//
//    @Enumerated(EnumType.STRING)
//    @Column(columnDefinition = "ENUM('male', 'female', 'other') DEFAULT 'other'")
//    private Gender gender = Gender.OTHER;
//
//    @Column(name = "year_of_experience", columnDefinition = "INT DEFAULT 0")
//    private Integer yearOfExperience = 0;
//
//    @Column(columnDefinition = "TINYINT(1) DEFAULT 0")
//    private Boolean featured = false;
//
//    @Column(name = "start_date")
//    private LocalDate startDate;
//
//    @Column(name = "end_date")
//    private LocalDate endDate;
//
//    @ManyToOne
//    @JoinColumn(name = "city_id")
//    private City city;
//
//    private String cityName;
//
//    @ManyToOne
//    @JoinColumn(name = "district_id")
//    private District district;
//
//    private String districtName;
//
//    // Getters và setters
//
//    public enum Gender {
//        MALE, FEMALE, OTHER
//    }
//}