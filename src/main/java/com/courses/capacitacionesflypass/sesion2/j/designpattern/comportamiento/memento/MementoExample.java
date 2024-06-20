package com.courses.capacitacionesflypass.sesion2.j.designpattern.comportamiento.memento;

public class MementoExample {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        TextEditorCareTaker caretaker = new TextEditorCareTaker();

        textEditor.setText("Version 1");
        System.out.println("Text: " + textEditor.getText());
        caretaker.save(textEditor);

        textEditor.setText("Version 2");
        System.out.println("Text: " + textEditor.getText());
        caretaker.save(textEditor);

        textEditor.setText("Version 3");
        System.out.println("Text: " + textEditor.getText());

        caretaker.undo(textEditor);
        System.out.println("After undo: " + textEditor.getText());

        caretaker.undo(textEditor);
        System.out.println("After second undo: " + textEditor.getText());
    }
}
