package net.majid.behavioral.proxy;

class PaymentServiceImpl implements PaymentService {

    @Override
    public void pay() {
        System.out.println("Payment processing...");
    }
}
