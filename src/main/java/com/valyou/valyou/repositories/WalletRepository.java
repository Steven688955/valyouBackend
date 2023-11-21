package com.valyou.valyou.repositories;

import com.valyou.valyou.models.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletRepository extends JpaRepository<Wallet, Long> {
}
