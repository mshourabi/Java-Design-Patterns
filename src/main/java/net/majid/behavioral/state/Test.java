package net.majid.behavioral.state;

public class Test {
    public static void main(String[] args) {

        Order order = new Order();

        order.ship();

        order.pay();

        order.ship();
    }
}
