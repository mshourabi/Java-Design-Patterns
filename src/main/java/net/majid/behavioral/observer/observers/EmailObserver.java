package net.majid.behavioral.observer.observers;

public class EmailObserver implements Observer {

    private final String email;

    public EmailObserver(String email) {
        this.email = email;
    }

    @Override
    public void update(String news) {
        System.out.println(
                "Send email to " + email + ": " + news
        );
    }
}
