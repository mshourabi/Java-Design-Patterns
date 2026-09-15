package net.majid.behavioral.observer.subjects;

import net.majid.behavioral.observer.observers.Observer;

public interface Subject {

    void attach(Observer observer);

    void detach(Observer observer);

    void notifyObservers();
}
