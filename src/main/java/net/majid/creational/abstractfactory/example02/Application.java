package net.majid.creational.abstractfactory.example02;

import net.majid.creational.abstractfactory.example02.factory.GUIFactory;
import net.majid.creational.abstractfactory.example02.item.Button;
import net.majid.creational.abstractfactory.example02.item.Checkbox;

public class Application {

    private final GUIFactory factory;

    public Application(GUIFactory factory) {
        this.factory = factory;
    }

    public void render() {

        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        button.display();
        checkbox.display();
    }
}
