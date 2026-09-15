package net.majid.behavioral.template;

public class Test {
    public static void main(String[] args) {
        SoftwareEngineering software = new SoftwareEngineering();
        software.study();

        System.out.println("--------------------");

        HardwareEngineering hardware = new HardwareEngineering();
        hardware.study();
    }
}
