package com.courses.capacitacionesflypass.sesion2.g.generic;

public class Person implements Comparable<Person> {
    private int age;
    private String name;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return "PersonLombok{name='" + name + "', age=" + age + '}';
    }

    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Bob", 25);

        System.out.println("Comparing person1 and person2: " + person1.compareTo(person2)); // Output: 1 (30 > 25)

        Person person3 = new Person("Charlie", 25);
        Person person4 = new Person("David", 25);

        System.out.println("Comparing person3 and person4: " + person3.compareTo(person4)); // Output: 0 (25 == 25)

        Person person5 = new Person("Eve", 20);
        Person person6 = new Person("Frank", 30);

        System.out.println("Comparing person5 and person6: " + person5.compareTo(person6)); // Output: -1 (20 < 30)
    }
}
