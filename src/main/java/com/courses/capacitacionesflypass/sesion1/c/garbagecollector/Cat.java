package com.courses.capacitacionesflypass.sesion1.c.garbagecollector;

public class Cat {

    private int age;
    private String name;
    private String gender;
    private Long idVeterinaria;

    public Cat(int age, String name, String gender, Long idVeterinaria) {
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.idVeterinaria = idVeterinaria;
    }

    public Cat() {

    }

    public void meow() {
        System.out.println("haciendo Meow");
    }
}
