package net.majid.behavioral.state.state;

import net.majid.behavioral.state.Order;

public class PaidOrderState implements OrderState{

    @Override
    public void pay(Order order) {
        System.out.println("Order is already paid");
    }

    @Override
    public void ship(Order order) {
        System.out.println("Order shipped");

        order.setState(new ShippedOrderState());
    }

    @Override
    public void cancel(Order order) {
        System.out.println("Refunding payment...");

        order.setState(new CancelledOrderState());
    }
}
