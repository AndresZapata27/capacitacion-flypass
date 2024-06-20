package com.courses.capacitacionesflypass.sesion2.j.designpattern.estructurales.bridge;

class BasicRemoteControl extends RemoteControl {

    public BasicRemoteControl(Device device) {
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
        device.setVolume(volume + 1);
    }

    @Override
    public void volumeDown() {
        int volume = device.getVolume();
        device.setVolume(volume - 1);
    }
}