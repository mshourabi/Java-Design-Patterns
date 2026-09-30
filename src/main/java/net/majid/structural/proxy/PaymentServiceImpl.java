package net.majid.structural.proxy;

class PaymentServiceImpl implements PaymentService {

    @Override
    public void pay() {
        System.out.println("Payment processing...");
    }
}
