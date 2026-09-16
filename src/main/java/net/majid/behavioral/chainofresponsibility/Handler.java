package net.majid.behavioral.chainofresponsibility;

interface Handler {

    void setNext(Handler next);

    void handle(Request request);
}
