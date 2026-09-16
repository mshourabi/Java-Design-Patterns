package net.majid.behavioral.proxy;

public class Test {
    public static void main(String[] args) {

        PaymentService service =
                new PaymentServiceProxy(
                        new PaymentServiceImpl()
                );

        service.pay();
    }
}
