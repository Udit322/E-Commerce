package com.E_Commerce.com.project.Ecommerce.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository <ReviewRepository, Integer> {
    List<ReviewRepository> findByProductProductId(Integer productId);
}
