package net.majid.creational.abstractfactory.example02;

import net.majid.creational.abstractfactory.example02.factory.GUIFactory;
import net.majid.creational.abstractfactory.example02.factory.MacFactory;
import net.majid.creational.abstractfactory.example02.factory.WindowsFactory;

public class Test {
    public static void main(String[] args) {

        GUIFactory factory = new WindowsFactory();
        Application application = new Application(factory);
        application.render();


        GUIFactory factory2 = new MacFactory();
        Application application2 = new Application(factory2);
        application2.render();
    }
}
