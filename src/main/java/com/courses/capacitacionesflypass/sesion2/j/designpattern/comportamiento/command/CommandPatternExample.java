package com.courses.capacitacionesflypass.sesion2.j.designpattern.comportamiento.command;

public class CommandPatternExample {
    public static void main(String[] args) {
        Light livingRoomLight = new Light();
        
        Command turnOn = new TurnOnLightCommand(livingRoomLight);
        Command turnOff = new TurnOffLightCommand(livingRoomLight);
        
        RemoteControl remote = new RemoteControl();
        
        // Encender la luz
        remote.setCommand(turnOn);
        remote.pressButton();
        
        // Apagar la luz
        remote.setCommand(turnOff);
        remote.pressButton();
    }
}
