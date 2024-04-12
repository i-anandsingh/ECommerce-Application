package com.funApp.dbFetcher.impl;

import com.funApp.dbFetcher.idFetcher.SellerIdFetcher;
import com.funApp.entity.SellerRegistrationEntity;
import com.funApp.dbFetcher.RegistrationIdFetcher;
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
