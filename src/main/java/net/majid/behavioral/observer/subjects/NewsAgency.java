package net.majid.behavioral.observer.subjects;

import net.majid.behavioral.observer.observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements Subject {

    private final List<Observer> observers = new ArrayList<>();

    private String news;

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void setNews(String news) {
        this.news = news;
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(news);
        }
    }
}
