package net.majid.behavioral.visitor;

public class ContentVisitorImpl implements ContentVisitor {

    @Override
    public void visit(Content content) {
        System.out.println("Visit content: " + content.getData());
    }
}
