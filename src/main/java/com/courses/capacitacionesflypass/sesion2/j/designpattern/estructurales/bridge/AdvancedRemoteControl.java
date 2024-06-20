package com.courses.capacitacionesflypass.sesion2.j.designpattern.estructurales.bridge;

class AdvancedRemoteControl extends RemoteControl {

    public AdvancedRemoteControl(Device device) {
        super(device);
    }

    @Override
    public void turnOn() {
        device.powerOn();
    }

    @Override
    public void turnOff() {
        device.powerOff();
    }

    @Override
    public void volumeUp() {
        int volume = device.getVolume();
        device.setVolume(volume + 5);
    }

    @Override
    public void volumeDown() {
        int volume = device.getVolume();
        device.setVolume(volume - 5);
    }

    public void mute() {
        device.setVolume(0);
        System.out.println("Device muted");
    }
}