package net.majid.behavioral.state.state;

import net.majid.behavioral.state.Order;

public class NewOrderState implements OrderState {

    @Override
    public void pay(Order order) {
        System.out.println("Order paid");

        order.setState(new PaidOrderState());
    }

    @Override
    public void ship(Order order) {
        System.out.println("Cannot ship an unpaid order");
    }

    @Override
    public void cancel(Order order) {
        System.out.println("Order cancelled");
    }
}