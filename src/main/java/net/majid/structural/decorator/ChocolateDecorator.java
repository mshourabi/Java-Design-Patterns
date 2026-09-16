package net.majid.structural.decorator;

class ChocolateDecorator extends CoffeeDecorator {

    public ChocolateDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        return coffee.cost() + 0.8;
    }

    @Override
    public String description() {
        return coffee.description() + ", Chocolate";
    }
}
