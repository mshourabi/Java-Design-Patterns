package net.majid.behavioral.state;

import net.majid.behavioral.state.state.NewOrderState;
import net.majid.behavioral.state.state.OrderState;

public class Order {

    private OrderState state;

    public Order() {
        this.state = new NewOrderState();
    }

    public void pay() {
        state.pay(this);
    }

    public void ship() {
        state.ship(this);
    }

    public void cancel() {
        state.cancel(this);
    }

    public void setState(OrderState state) {
        this.state = state;
    }
}
