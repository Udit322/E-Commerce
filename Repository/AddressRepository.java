package com.E_Commerce.com.project.Ecommerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.E_Commerce.com.project.Ecommerce.Entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {
}
