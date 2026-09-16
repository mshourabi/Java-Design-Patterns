package net.majid.creational.abstractfactory.example02.item;

public class WindowsButton implements Button {
    @Override
    public void display() {
        System.out.println("[[ WindowsButton ]]");
    }
}
