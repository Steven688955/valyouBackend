package com.valyou.valyou.user;

import com.valyou.valyou.user.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users,Long> {
    Users findByUsername(String username);
    Users findByEmailOrUsername(String username, String email);
}
