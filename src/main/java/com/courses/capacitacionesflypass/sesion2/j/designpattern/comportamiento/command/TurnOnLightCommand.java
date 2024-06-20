package com.courses.capacitacionesflypass.sesion2.j.designpattern.comportamiento.command;

class TurnOnLightCommand implements Command {
    private Light light;

    public TurnOnLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}

