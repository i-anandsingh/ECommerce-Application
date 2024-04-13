package com.org.dbFetcher.idFetcher;

import com.org.entity.CustomerRegistrationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerIdFetcher extends JpaRepository<CustomerRegistrationEntity, String> {
}
