package com.courses.capacitacionesflypass.generalidades.palabrasReservadas;

class ThisExample {

    private final int value;

    public ThisExample(int value) {
        this.value = value; // Diferencia entre la variable de instancia y el parámetro
    }

    public void display() {

        System.out.println("Value: " + this.value);



    }

    public void callDisplay() {
        this.display();
    }



}