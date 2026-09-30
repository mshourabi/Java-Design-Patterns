package net.majid.structural.bridge;

public abstract class Shape {

    private final Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract void applyColor();
    public abstract  void draw();


    public Color getColor() {
        return color;
    }
}
