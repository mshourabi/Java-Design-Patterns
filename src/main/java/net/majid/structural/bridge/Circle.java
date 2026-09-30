package net.majid.structural.bridge;

public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        System.out.println(getColor().applyColor());
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle "+ getColor().applyColor());
    }
}
