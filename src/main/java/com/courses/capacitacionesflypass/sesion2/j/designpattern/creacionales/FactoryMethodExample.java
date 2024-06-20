package com.courses.capacitacionesflypass.sesion2.j.designpattern.creacionales;

// Producto
interface Animal {
    void speak();
}

// Producto concreto
class Dog implements Animal {
    @Override
    public void speak() {
        System.out.println("Woof!");
    }
}

class Cat implements Animal {
    @Override
    public void speak() {
        System.out.println("Meow!");
    }
}

// Factory Method
abstract class AnimalFactory {
    abstract Animal createAnimal();

    // Método que usa el objeto creado
    void doSomething() {
        Animal animal = createAnimal();
        animal.speak();
    }
}

// Subclases de la fábrica
class DogFactory extends AnimalFactory {
    @Override
    Animal createAnimal() {
        return new Dog();
    }
}

class CatFactory extends AnimalFactory {
    @Override
    Animal createAnimal() {
        return new Cat();
    }
}

// Cliente
public class FactoryMethodExample {
    public static void main(String[] args) {
        AnimalFactory dogFactory = new DogFactory();
        dogFactory.doSomething(); // Output: Woof!

        AnimalFactory catFactory = new CatFactory();
        catFactory.doSomething(); // Output: Meow!
    }
}
