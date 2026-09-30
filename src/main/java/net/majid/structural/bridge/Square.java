package net.majid.structural.bridge;

public class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        System.out.println(getColor().applyColor());
    }

    @Override
    public void draw() {
        System.out.println("Drawing Square "+ getColor().applyColor());
    }
}
