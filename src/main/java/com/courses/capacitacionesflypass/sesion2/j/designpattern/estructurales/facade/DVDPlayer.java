package com.courses.capacitacionesflypass.sesion2.j.designpattern.estructurales.facade;

class DVDPlayer {
    public void on() {
        System.out.println("DVD Player is ON");
    }

    public void off() {
        System.out.println("DVD Player is OFF");
    }

    public void play(String movie) {
        System.out.println("Playing movie: " + movie);
    }

    public void stop() {
        System.out.println("Stopping movie");
    }
}

class Projector {
    public void on() {
        System.out.println("Projector is ON");
    }

    public void off() {
        System.out.println("Projector is OFF");
    }

    public void setInput(String input) {
        System.out.println("Projector input set to: " + input);
    }
}

class Screen {
    public void down() {
        System.out.println("Screen going down");
    }

    public void up() {
        System.out.println("Screen going up");
    }
}

class Lights {
    public void dim(int level) {
        System.out.println("Dimming lights to level: " + level);
    }

    public void on() {
        System.out.println("Lights are ON");
    }
}
