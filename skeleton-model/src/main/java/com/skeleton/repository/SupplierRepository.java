package com.skeleton.repository;

import com.skeleton.model.Product;
import com.skeleton.model.Supplier;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Product, Long> {
    Optional<Supplier> findAllByName(final String name);
}
