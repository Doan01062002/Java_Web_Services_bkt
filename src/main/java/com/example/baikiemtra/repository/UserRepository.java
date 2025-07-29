package com.example.baikiemtra.repository;

import com.example.baikiemtra.model.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<Customer,Integer> {
    Optional<Customer> findByUsername(String username);
}
