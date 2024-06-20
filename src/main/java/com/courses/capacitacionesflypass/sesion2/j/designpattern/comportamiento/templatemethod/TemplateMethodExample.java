package com.courses.capacitacionesflypass.sesion2.j.designpattern.comportamiento.templatemethod;

public class TemplateMethodExample {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        
        game = new Football();
        game.play();
    }
}
