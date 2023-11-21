package com.valyou.valyou.repositories;

import com.valyou.valyou.models.Token;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenRepository extends JpaRepository<Token, Long> {
}
