package net.majid.behavioral.chainofresponsibility;

public class Test {
    public static void main(String[] args) {
        Handler authentication = new AuthenticationHandler();
        Handler authorization = new AuthorizationHandler();
        Handler validation = new ValidationHandler();

        authentication.setNext(authorization);
        authorization.setNext(validation);


        Request request = new Request("admin", "Token","data");

        authentication.handle(request);
    }
}
