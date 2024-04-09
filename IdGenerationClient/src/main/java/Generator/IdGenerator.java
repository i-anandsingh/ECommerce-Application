package Generator;


import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class IdGenerator {
    private Random random = new Random();
    public String sellerIdGenerator(){
        Integer id = 10000 + random.nextInt(99999);
        String sellerId = 's' + id.toString();
        return sellerId;
    }

    public String customerIdGenerator(){
        Integer id = 10000 + random.nextInt(99999);
        String customerId = 'c' + id.toString();
        return customerId;
    }

    public String productIdGenerator(){
        Long id = 1000000 + random.nextLong(9999999);
        String productId = 'p' + id.toString();
        return productId;
    }
}
