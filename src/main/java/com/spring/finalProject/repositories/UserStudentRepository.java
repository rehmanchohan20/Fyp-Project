package com.spring.finalProject.repositories;

import com.spring.finalProject.model.UserStudent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserStudentRepository extends JpaRepository<UserStudent, Long> {
}
