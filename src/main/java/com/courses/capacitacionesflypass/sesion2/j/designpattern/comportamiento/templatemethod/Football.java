package com.courses.capacitacionesflypass.sesion2.j.designpattern.comportamiento.templatemethod;

class Football extends Game {

    @Override
    void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }

    @Override
    void endPlay() {
        System.out.println("Football Game Finished!");
    }
}