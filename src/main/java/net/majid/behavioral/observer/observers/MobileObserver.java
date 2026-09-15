package net.majid.behavioral.observer.observers;

public class MobileObserver implements Observer {

    @Override
    public void update(String news) {
        System.out.println(
                "Send mobile notification: " + news
        );
    }
}
