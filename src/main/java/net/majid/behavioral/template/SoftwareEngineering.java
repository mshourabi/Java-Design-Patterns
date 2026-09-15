package net.majid.behavioral.template;

public class SoftwareEngineering extends BasicEngineering {

    @Override
    public void additionalStudy() {
        operatingSystem();
        dataBase();
    }

    private void operatingSystem() {
        System.out.println("Study Operating System");
    }


    private void dataBase() {
        System.out.println("Study DataBase.");
    }


}
