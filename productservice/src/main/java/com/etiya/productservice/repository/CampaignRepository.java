package com.etiya.productservice.repository;

import com.etiya.productservice.entity.Offer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CampaignRepository extends JpaRepository<Offer,Long> {

}
