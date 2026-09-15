package net.majid.behavioral.visitor;

/**
 * It's Element
 */
public class Content {

    private Integer data;

    public void accept(ContentVisitor visitor) {
        visitor.visit(this);
    }


    public Content(Integer data) {
        this.data = data;
    }


    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }
}
