package net.majid.creational.abstractfactory.example02.factory;

import net.majid.creational.abstractfactory.example02.item.Button;
import net.majid.creational.abstractfactory.example02.item.Checkbox;

public interface GUIFactory {

    Button createButton();

    Checkbox createCheckbox();
}
