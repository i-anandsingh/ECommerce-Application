package generatorClient.dbFetcher;

import org.springframework.stereotype.Component;


@Component
public interface RegistrationIdFetcher {
    Boolean getAllSellerIds (String sellerId);
}
