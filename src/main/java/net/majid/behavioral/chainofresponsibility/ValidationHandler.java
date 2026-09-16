package net.majid.behavioral.chainofresponsibility;

class ValidationHandler implements Handler {

    private Handler next;

    @Override
    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public void handle(Request request) {

        if (request.data == null || request.data.isBlank()) {
            System.out.println("Validation failed");
            return;
        }

        System.out.println("Validation passed");

        if (next != null) {
            next.handle(request);
        }
    }
}
