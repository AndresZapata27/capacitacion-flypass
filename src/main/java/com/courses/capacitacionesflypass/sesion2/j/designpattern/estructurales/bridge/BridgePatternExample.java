package com.courses.capacitacionesflypass.sesion2.j.designpattern.estructurales.bridge;

public class BridgePatternExample {
    public static void main(String[] args) {
        Device tv = new TV();
        Device radio = new Radio();

        RemoteControl basicRemoteForTV = new BasicRemoteControl(tv);
        RemoteControl advancedRemoteForRadio = new AdvancedRemoteControl(radio);

        System.out.println("Using basic remote for TV:");
        basicRemoteForTV.turnOn();
        basicRemoteForTV.volumeUp();
        basicRemoteForTV.volumeUp();
        basicRemoteForTV.turnOff();

        System.out.println("\nUsing advanced remote for Radio:");
        advancedRemoteForRadio.turnOn();
        advancedRemoteForRadio.volumeUp();

        // Para usar la función mute, necesitas una referencia a AdvancedRemoteControl
        if (advancedRemoteForRadio instanceof AdvancedRemoteControl advancedRemote) {
            advancedRemote.mute();
        }

        advancedRemoteForRadio.turnOff();
    }
}
