package com.courses.capacitacionesflypass.sesion2.j.designpattern.comportamiento.command;

class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}
