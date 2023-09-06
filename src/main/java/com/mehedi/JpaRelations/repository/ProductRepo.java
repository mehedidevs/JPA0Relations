package com.mehedi.JpaRelations.repository;

import com.mehedi.JpaRelations.entity.Customer;
import com.mehedi.JpaRelations.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Integer> {
}
