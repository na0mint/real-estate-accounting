package com.example.realestateaccounting.repository;

import com.example.realestateaccounting.model.Estate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstateRepository extends JpaRepository<Estate, Integer> {
}
