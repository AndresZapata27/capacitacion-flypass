package com.courses.capacitacionesflypass.sesion2.j.designpattern.comportamiento.memento;

import java.util.Stack;

class TextEditorCareTaker {
    private Stack<Memento> history = new Stack<>();

    public void save(TextEditor textEditor) {
        history.push(textEditor.save());
    }

    public void undo(TextEditor textEditor) {
        if (!history.isEmpty()) {
            textEditor.restore(history.pop());
        } else {
            System.out.println("No mementos to restore");
        }
    }
}
