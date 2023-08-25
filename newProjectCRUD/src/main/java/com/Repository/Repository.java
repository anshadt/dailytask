package com.Repository;

import com.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Product, Long> {
}