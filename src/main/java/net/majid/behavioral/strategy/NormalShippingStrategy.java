package net.majid.behavioral.strategy;

import java.math.BigDecimal;

public class NormalShippingStrategy implements ShippingStrategy {
    @Override
    public BigDecimal calculateCost(String orderName) {
        return BigDecimal.valueOf(5_000);
    }
}
