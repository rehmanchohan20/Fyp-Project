package com.spring.finalProject.repositories;

import com.spring.finalProject.model.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermissionRepository extends JpaRepository<Permission, Long> {
}
