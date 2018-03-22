package com.unibuc.mds.repository;

import com.unibuc.mds.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

    }

