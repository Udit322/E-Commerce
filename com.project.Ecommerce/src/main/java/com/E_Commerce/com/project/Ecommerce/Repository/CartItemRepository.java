package com.E_Commerce.com.project.Ecommerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.E_Commerce.com.project.Ecommerce.Entity.Cartitem;

public interface CartItemRepository extends JpaRepository<Cartitem, Integer> {
}
