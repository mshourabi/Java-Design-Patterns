package net.majid.behavioral.command;

public class Test {
    public static void main(String[] args) {

        Light light = new Light();

        Command turnOn = new TurnOnCommand(light);

        RemoteControl remote = new RemoteControl();

        remote.setCommand(turnOn);

        remote.pressButton();
    }
}
