package com.courses.capacitacionesflypass.sesion2.j.designpattern.comportamiento.memento;

class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
