package com.courses.capacitacionesflypass.sesion2.j.designpattern.estructurales.facade;

class HomeTheaterFacade {
    private DVDPlayer dvdPlayer;
    private Projector projector;
    private Screen screen;
    private Lights lights;

    public HomeTheaterFacade(DVDPlayer dvdPlayer, Projector projector, Screen screen, Lights lights) {
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.screen = screen;
        this.lights = lights;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        lights.dim(10);
        screen.down();
        projector.on();
        projector.setInput("DVD");
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        dvdPlayer.stop();
        dvdPlayer.off();
        projector.off();
        screen.up();
        lights.on();
    }
}
