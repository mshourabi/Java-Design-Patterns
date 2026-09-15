package net.majid.behavioral.strategy;

import java.math.BigDecimal;

public class ExpressShippingStrategy implements ShippingStrategy {
    @Override
    public BigDecimal calculateCost(String orderName) {
        return BigDecimal.valueOf(6_000);
    }
}
