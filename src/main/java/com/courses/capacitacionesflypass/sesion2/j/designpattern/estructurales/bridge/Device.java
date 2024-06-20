package com.courses.capacitacionesflypass.sesion2.j.designpattern.estructurales.bridge;

interface Device {
    void powerOn();
    void powerOff();
    void setVolume(int volume);
    int getVolume();
}
