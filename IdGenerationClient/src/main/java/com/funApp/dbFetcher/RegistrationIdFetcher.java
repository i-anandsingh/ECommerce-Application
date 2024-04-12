package com.funApp.dbFetcher;

import org.springframework.stereotype.Component;


@Component
public interface RegistrationIdFetcher {
    Boolean matchSellerId (String sellerId);
}
