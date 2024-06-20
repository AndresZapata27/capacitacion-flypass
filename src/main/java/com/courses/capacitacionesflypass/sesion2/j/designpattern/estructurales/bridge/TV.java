package com.courses.capacitacionesflypass.sesion2.j.designpattern.estructurales.bridge;

class TV implements Device {
    private int volume = 0;

    @Override
    public void powerOn() {
        System.out.println("TV is now ON");
    }

    @Override
    public void powerOff() {
        System.out.println("TV is now OFF");
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("TV volume set to " + this.volume);
    }

    @Override
    public int getVolume() {
        return volume;
    }
}