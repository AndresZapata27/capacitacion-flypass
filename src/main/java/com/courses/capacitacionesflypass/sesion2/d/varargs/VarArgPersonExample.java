package com.courses.capacitacionesflypass.sesion2.d.varargs;

public class VarArgPersonExample {

    // Clase Person
    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Name: " + name + ", Age: " + age;
        }
    }

    // Método que imprime detalles de una cantidad variable de personas
    public static void printPersonDetails(Person... people) {
        for (Person person : people) {
            System.out.println(person);
        }
    }

    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Bob", 25);
        Person person3 = new Person("Charlie", 35);

        printPersonDetails(person1, person2); 
        // Output:
        // Name: Alice, Age: 30
        // Name: Bob, Age: 25

        printPersonDetails(person1, person2, person3);
        // Output:
        // Name: Alice, Age: 30
        // Name: Bob, Age: 25
        // Name: Charlie, Age: 35
    }
}
