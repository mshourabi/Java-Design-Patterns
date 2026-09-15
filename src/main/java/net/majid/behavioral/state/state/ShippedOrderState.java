package net.majid.behavioral.state.state;

import net.majid.behavioral.state.Order;

public class ShippedOrderState implements OrderState {

    @Override
    public void pay(Order order) {
        System.out.println("Order is already paid");
    }

    @Override
    public void ship(Order order) {
        System.out.println("Order is already shipped");
    }

    @Override
    public void cancel(Order order) {
        System.out.println("Cannot cancel a shipped order");
    }
}
