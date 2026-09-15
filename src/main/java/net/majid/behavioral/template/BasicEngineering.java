package net.majid.behavioral.template;

public abstract class BasicEngineering {

    public void study() {
        math();
        physics();
        additionalStudy();
    }

    protected abstract void additionalStudy();

    private void math() {
        System.out.println("Study Math.");
    }

    private void physics() {
        System.out.println("Study Physics.");
    }
}
