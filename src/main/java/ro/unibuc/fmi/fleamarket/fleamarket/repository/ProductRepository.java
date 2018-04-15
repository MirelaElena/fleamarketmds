package ro.unibuc.fmi.fleamarket.fleamarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.unibuc.fmi.fleamarket.fleamarket.domain.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {

    }

