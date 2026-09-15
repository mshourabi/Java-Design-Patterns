package net.majid.behavioral.strategy;

import java.math.BigDecimal;

public class ShippingService {

    private final ShippingStrategy strategy;

    public ShippingService(ShippingStrategy strategy) {
        this.strategy = strategy;
    }

    public BigDecimal calculateShippingCost(String orderName) {

        return strategy.calculateCost(orderName);
    }


}
