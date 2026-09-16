package net.majid.behavioral.proxy;

class PaymentServiceProxy implements PaymentService {

    private final PaymentService realService;

    public PaymentServiceProxy(PaymentService realService) {
        this.realService = realService;
    }

    @Override
    public void pay() {

        System.out.println("Checking security...");

        realService.pay();

        System.out.println("Logging...");
    }
}