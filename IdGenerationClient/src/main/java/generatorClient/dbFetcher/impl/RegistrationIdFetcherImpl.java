package generatorClient.dbFetcher.impl;

import generatorClient.dbFetcher.RegistrationIdFetcher;
import generatorClient.dbFetcher.idFetcher.SellerIdFetcher;
import generatorClient.entity.SellerRegistrationEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RegistrationIdFetcherImpl implements RegistrationIdFetcher {
    private final SellerIdFetcher sellerIdFetcher;

    public RegistrationIdFetcherImpl(SellerIdFetcher sellerIdFetcher) {
        this.sellerIdFetcher = sellerIdFetcher;
    }

    @Override
    public Boolean getAllSellerIds(String sellerId) {
        List<SellerRegistrationEntity> entityList = sellerIdFetcher.findAll();
        for(SellerRegistrationEntity sellerRegistrationEntity : entityList){
            if(sellerId.equals(sellerRegistrationEntity.getSellerId())){
                return true;
            }
        }
        return false;
    }
}
