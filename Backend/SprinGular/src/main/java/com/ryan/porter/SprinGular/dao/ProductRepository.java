package com.ryan.porter.SprinGular.dao;

import com.ryan.porter.SprinGular.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {
}
