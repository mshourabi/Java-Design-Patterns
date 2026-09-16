package net.majid.structural.decorator;

class SimpleCoffee implements Coffee {

    @Override
    public double cost() {
        return 2.0;
    }

    @Override
    public String description() {
        return "Coffee";
    }
}
