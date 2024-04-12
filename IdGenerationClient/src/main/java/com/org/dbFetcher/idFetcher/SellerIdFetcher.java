package com.org.dbFetcher.idFetcher;

import com.org.entity.SellerRegistrationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SellerIdFetcher extends JpaRepository<SellerRegistrationEntity, Integer> {
    List<SellerRegistrationEntity> findAll();
}
