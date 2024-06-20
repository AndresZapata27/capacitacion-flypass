package com.courses.capacitacionesflypass.sesion2.j.designpattern.comportamiento.command;

class TurnOffLightCommand implements Command {
    private Light light;

    public TurnOffLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
