package com.courses.capacitacionesflypass.sesion2.j.designpattern.comportamiento.templatemethod;

abstract class Game {
    // Template method
    public final void play() {

        initialize();
        startPlay();
        endPlay();
    }

    private void initialize(){
        System.out.println("esta es una accion de template que siempre se va realizar de la misma manera");
    }
    abstract void startPlay();
    abstract void endPlay();
}
