package com.E_Commerce.com.project.Ecommerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.E_Commerce.com.project.Ecommerce.Entity.Poduct;

public interface ProductRepository extends JpaRepository<Poduct, Integer> {
}