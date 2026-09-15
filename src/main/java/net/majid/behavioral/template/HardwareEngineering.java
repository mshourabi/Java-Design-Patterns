package net.majid.behavioral.template;

public class HardwareEngineering extends BasicEngineering {
    @Override
    public void additionalStudy() {
        embeddedSystem();
        digitalSignal();
    }

    private void embeddedSystem() {
        System.out.println("Study Embedded System.");
    }

    private void digitalSignal() {
        System.out.println("Study Digital-Signal System.");
    }
}
