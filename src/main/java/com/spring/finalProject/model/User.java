package com.spring.finalProject.model;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String email;

    @Column(unique = true)
    private String username;

    @Column()
    private String password;

    @Column()
    private boolean isAdmin;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

    @OneToMany(mappedBy = "user")
    private Set<UserTeacher> userTeachers;

    @OneToMany(mappedBy = "user")
    private Set<UserStudent> userStudents;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Set<UserTeacher> getUserTeachers() {
        return userTeachers;
    }

    public void setUserTeachers(Set<UserTeacher> userTeachers) {
        this.userTeachers = userTeachers;
    }

    public Set<UserStudent> getUserStudents() {
        return userStudents;
    }

    public void setUserStudents(Set<UserStudent> userStudents) {
        this.userStudents = userStudents;
    }
}
