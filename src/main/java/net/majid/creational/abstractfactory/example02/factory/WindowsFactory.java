package net.majid.creational.abstractfactory.example02.factory;

import net.majid.creational.abstractfactory.example02.item.Button;
import net.majid.creational.abstractfactory.example02.item.Checkbox;
import net.majid.creational.abstractfactory.example02.item.WindowsButton;
import net.majid.creational.abstractfactory.example02.item.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}