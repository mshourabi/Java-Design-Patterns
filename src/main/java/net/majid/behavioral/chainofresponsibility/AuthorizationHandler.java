package net.majid.behavioral.chainofresponsibility;

class AuthorizationHandler implements Handler {

    private Handler next;

    @Override
    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public void handle(Request request) {

        if (!request.username.equals("admin")) {
            System.out.println("Authorization failed");
            return;
        }

        System.out.println("Authorization passed");

        if (next != null) {
            next.handle(request);
        }
    }
}
