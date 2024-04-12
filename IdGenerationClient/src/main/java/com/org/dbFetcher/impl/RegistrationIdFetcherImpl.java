package com.org.dbFetcher.impl;

import com.org.dbFetcher.idFetcher.SellerIdFetcher;
import com.org.entity.SellerRegistrationEntity;
import com.org.dbFetcher.RegistrationIdFetcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RegistrationIdFetcherImpl implements RegistrationIdFetcher {
    private final SellerIdFetcher sellerIdFetcher;

    @Autowired
    public RegistrationIdFetcherImpl(SellerIdFetcher sellerIdFetcher) {
        this.sellerIdFetcher = sellerIdFetcher;
    }

    @Override
    public Boolean matchSellerId(String sellerId) {
        List<SellerRegistrationEntity> entityList = sellerIdFetcher.findAll();
        if(entityList.isEmpty()){
            return false;
        }
        for(SellerRegistrationEntity sellerRegistrationEntity : entityList){
            if(sellerId.equals(sellerRegistrationEntity.getSellerId())){
                return true;
            }
        }
        return false;
    }
}
