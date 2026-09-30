package net.majid.structural.proxy;

public class Test {
    public static void main(String[] args) {

        PaymentService service =
                new PaymentServiceProxy(
                        new PaymentServiceImpl()
                );

        service.pay();
    }
}
