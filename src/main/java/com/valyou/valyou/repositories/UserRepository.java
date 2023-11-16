package com.valyou.valyou.repositories;

import com.valyou.valyou.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users,Long> {
    Users findByUsername(String username);
    Users findByEmailOrUsername(String username, String email);
}
