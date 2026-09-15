package net.majid.behavioral.strategy;

import java.math.BigDecimal;

public interface ShippingStrategy {

    BigDecimal calculateCost(String orderName);
}