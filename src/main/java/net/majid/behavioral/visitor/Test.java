package net.majid.behavioral.visitor;

public class Test {
    public static void main(String[] args) {

        Content content = new Content(50);
        content.accept(new ContentVisitorImpl());

    }
}
