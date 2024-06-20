package com.courses.capacitacionesflypass.sesion2.j.designpattern.estructurales;

// Componente base
interface Coffe {
    String getDescription();
    double cost();
}

// Componente concreto
class Espresso implements Coffe {
    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}

// Decorador abstracto
abstract class CondimentDecorator implements Coffe {
    protected Coffe coffe;

    public CondimentDecorator(Coffe coffe) {
        this.coffe = coffe;
    }

    @Override
    public String getDescription() {
        return coffe.getDescription();
    }

    @Override
    public double cost() {
        return coffe.cost();
    }
}

// Decorador concreto: Leche
class Milk extends CondimentDecorator {
    public Milk(Coffe coffe) {
        super(coffe);
    }

    @Override
    public String getDescription() {
        return coffe.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return coffe.cost() + 0.50;
    }
}

// Decorador concreto: Mocha
class Mocha extends CondimentDecorator {
    public Mocha(Coffe coffe) {
        super(coffe);
    }

    @Override
    public String getDescription() {
        return coffe.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return coffe.cost() + 0.75;
    }
}

// Cliente
public class DecoratorExample {
    public static void main(String[] args) {
        Coffe coffe = new Espresso();
        System.out.println(coffe.getDescription() + " $" + coffe.cost());

        coffe = new Milk(coffe);
        System.out.println(coffe.getDescription() + " $" + coffe.cost());

        coffe = new Mocha(coffe);
        System.out.println(coffe.getDescription() + " $" + coffe.cost());
    }
}
