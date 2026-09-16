package net.majid.behavioral.chainofresponsibility;

class AuthenticationHandler implements Handler {

    private Handler next;

    @Override
    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public void handle(Request request) {

        if (request.token == null) {
            System.out.println("Authentication failed");
            return;
        }

        System.out.println("Authentication passed");

        if (next != null) {
            next.handle(request);
        }
    }
}
