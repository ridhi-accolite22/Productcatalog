package com.example.productcatalog.Productcatalog.repository;

import com.example.productcatalog.Productcatalog.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
