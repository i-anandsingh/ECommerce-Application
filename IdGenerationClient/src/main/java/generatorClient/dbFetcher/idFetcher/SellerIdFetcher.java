package generatorClient.dbFetcher.idFetcher;

import generatorClient.entity.SellerRegistrationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SellerIdFetcher extends JpaRepository<SellerRegistrationEntity, Integer> {
    List<SellerRegistrationEntity> findAll();
}
