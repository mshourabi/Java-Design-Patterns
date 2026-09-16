package net.majid.creational.abstractfactory.example02.factory;

import net.majid.creational.abstractfactory.example02.item.Button;
import net.majid.creational.abstractfactory.example02.item.Checkbox;
import net.majid.creational.abstractfactory.example02.item.MacButton;
import net.majid.creational.abstractfactory.example02.item.MacCheckbox;

public class MacFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
