package net.majid.behavioral.strategy;

import java.math.BigDecimal;

public class SameDayShippingStrategy implements ShippingStrategy {
    @Override
    public BigDecimal calculateCost(String orderName) {
        return BigDecimal.valueOf(4_000);
    }
}
