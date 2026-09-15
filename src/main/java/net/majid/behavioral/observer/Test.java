package net.majid.behavioral.observer;

import net.majid.behavioral.observer.observers.EmailObserver;
import net.majid.behavioral.observer.observers.MobileObserver;
import net.majid.behavioral.observer.observers.Observer;
import net.majid.behavioral.observer.subjects.NewsAgency;

public class Test {
    public static void main(String[] args) {

        Observer email = new EmailObserver("majid@example.com");
        Observer mobile = new MobileObserver();

        NewsAgency agency = new NewsAgency();
        agency.attach(email);
        agency.attach(mobile);

        agency.setNews("Breaking News!");
    }
}
