package com.spring.finalProject.model;

import jakarta.persistence.*;

@Entity
@Table(name = "section")
public class Section {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String secTitle;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    private Integer videoPriority;

    // Getters & Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSecTitle() {
        return secTitle;
    }

    public void setSecTitle(String secTitle) {
        this.secTitle = secTitle;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Integer getVideoPriority() {
        return videoPriority;
    }

    public void setVideoPriority(Integer videoPriority) {
        this.videoPriority = videoPriority;
    }

    // Getters and setters
    
}

