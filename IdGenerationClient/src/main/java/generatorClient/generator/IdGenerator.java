package generatorClient.generator;


import generatorClient.dbFetcher.RegistrationIdFetcher;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Random;

@Slf4j
@Component
public class IdGenerator {
    private final RegistrationIdFetcher registrationIdFetcher;

    private IdGenerator (RegistrationIdFetcher registrationIdFetcher) {
        this.registrationIdFetcher = registrationIdFetcher;
    }

    private Random random = new Random();
    public String sellerIdGenerator(){
        int id = 10000 + random.nextInt(99999);
        String sellerId = 's' + Integer.toString(id);
        if(registrationIdFetcher.getAllSellerIds(sellerId)){
            sellerIdGenerator();
        }
        return sellerId;
    }

    public String customerIdGenerator(){
        int id = 10000 + random.nextInt(99999);
        return 'c' + Integer.toString(id);
    }

    public String productIdGenerator(){
        Long id = 1000000 + random.nextLong(9999999);
        return 'p' + id.toString();
    }
}
