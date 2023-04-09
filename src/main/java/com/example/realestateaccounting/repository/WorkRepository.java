package com.example.realestateaccounting.repository;

import com.example.realestateaccounting.model.Work;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface WorkRepository extends JpaRepository<Work, Integer> {
    @Query(value = "SELECT * FROM Work w WHERE w.expirationDate = ?1",
    nativeQuery = true)
    Iterable<Work> findWorksByExpirationDate(Date expirationDate);

    @Query(value = "SELECT * FROM Work w WHERE w.publishingDate = ?1",
            nativeQuery = true)
    Iterable<Work> findWorksByPublishingDate(Date publishingDate);

    @Query(value = "SELECT * FROM Work w WHERE estate_id = " +
            "(SELECT id FROM Estate e WHERE e.type = ?1)",
            nativeQuery = true)
    Iterable<Work> findWorksByObjectType(String type);

    Iterable<Work> findByIsDoneFalse();
}
