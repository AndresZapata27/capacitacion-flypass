package com.courses.capacitacionesflypass.sesion2.j.designpattern.comportamiento.templatemethod;

class Cricket extends Game {

    @Override
    void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket Game Finished!");
    }
}


