package com.valyou.valyou.repositories;

import com.valyou.valyou.models.Transactions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transactions, Long> {
}
