package com.org.dbFetcher.impl;

import com.org.dbFetcher.idFetcher.CustomerIdFetcher;
import com.org.dbFetcher.idFetcher.SellerIdFetcher;
import com.org.entity.CustomerRegistrationEntity;
import com.org.entity.SellerRegistrationEntity;
import com.org.dbFetcher.RegistrationIdFetcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RegistrationIdFetcherImpl implements RegistrationIdFetcher {
    private final SellerIdFetcher sellerIdFetcher;
    private final CustomerIdFetcher customerIdFetcher;

    @Autowired
    public RegistrationIdFetcherImpl(SellerIdFetcher sellerIdFetcher, CustomerIdFetcher customerIdFetcher) {
        this.sellerIdFetcher = sellerIdFetcher;
        this.customerIdFetcher = customerIdFetcher;
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

    @Override
    public Boolean matchCustomerId(String customerId) {
        List<CustomerRegistrationEntity> entityList = customerIdFetcher.findAll();
        if(entityList.isEmpty()){
            return false;
        }
        for(CustomerRegistrationEntity entity : entityList){
            if(customerId.equals(entity.getCustomerId())){
                return true;
            }
        }
        return false;
    }
}
