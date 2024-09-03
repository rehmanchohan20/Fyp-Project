package com.spring.finalProject.model;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Teacher")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column()
    private String fullname;

    @Column()
    private String profession;

    @Column(length = 500)
    private String description;

    @Column(name = "SocialAccount")
    private String socialAccount;

    @OneToMany(mappedBy = "teacher")
    private Set<UserTeacher> userTeachers;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSocialAccount() {
        return socialAccount;
    }

    public void setSocialAccount(String socialAccount) {
        this.socialAccount = socialAccount;
    }

    public Set<UserTeacher> getUserTeachers() {
        return userTeachers;
    }

    public void setUserTeachers(Set<UserTeacher> userTeachers) {
        this.userTeachers = userTeachers;
    }
}
