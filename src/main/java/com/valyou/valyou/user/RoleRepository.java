package com.valyou.valyou.user;

import com.valyou.valyou.user.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {
    Role findByRoleName (String roleName);
}
