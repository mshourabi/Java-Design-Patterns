package net.majid.behavioral.memento;

import java.util.Stack;

/**
 * CareTacker
 */
public class History {

    private final Stack<EditorMemento> history = new Stack<>();

    public void save(EditorMemento memento) {
        history.push(memento);
    }

    public EditorMemento undo() {
        return history.pop();
    }
}
