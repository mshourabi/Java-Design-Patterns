package net.majid.behavioral.strategy;

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {

        ShippingService service = new ShippingService(new NormalShippingStrategy());

        BigDecimal cost = service.calculateShippingCost("orderName");
        System.out.println(cost);

        System.out.println("--------------------------------");

        service = new ShippingService(new ExpressShippingStrategy());
        cost = service.calculateShippingCost("orderName");
        System.out.println(cost);
    }
}
