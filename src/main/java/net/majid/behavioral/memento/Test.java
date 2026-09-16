package net.majid.behavioral.memento;

public class Test {
    public static void main(String[] args) {

        TextEditor editor = new TextEditor();
        History history = new History();

        editor.write("Hello");

        history.save(editor.save());

        editor.write(" World");

        history.save(editor.save());

        editor.write("!");

        System.out.println(editor.getContent());

        System.out.println("--------------------------");

        editor.restore(history.undo());

        System.out.println(editor.getContent());

    }
}
