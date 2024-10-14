package com.etiya.customerservice.repository;

import com.etiya.customerservice.entity.District;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NeighborhoodRepository extends JpaRepository<District, Long> {
}
