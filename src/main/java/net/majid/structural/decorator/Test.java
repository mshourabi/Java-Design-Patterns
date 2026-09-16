package net.majid.structural.decorator;

public class Test {
    public static void main(String[] args) {

        Coffee coffee =
                new MilkDecorator(
                        new SugarDecorator(
                                new SimpleCoffee()
                        )
                );


        System.out.println("Coffee: " + coffee.description());
    }
}
