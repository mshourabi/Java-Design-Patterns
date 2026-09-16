package net.majid.creational.abstractfactory.example02.item;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void display() {
        System.out.println("[[ WindowsCheckBox ]]");
    }
}
