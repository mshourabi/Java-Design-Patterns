package net.majid.structural.bridge;

public class Test {
    public static void main(String[] args) {
         Color red = new Red();
         Color green = new Green();

         Circle redCircle = new Circle(red);
         Circle greenCircle = new Circle(green);
         Square redSquare = new Square(red);

         redCircle.draw();
         greenCircle.draw();
         redSquare.draw();
    }
}
