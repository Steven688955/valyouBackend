package com.valyou.valyou.repositories;

import com.valyou.valyou.models.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock, Long> {
}
