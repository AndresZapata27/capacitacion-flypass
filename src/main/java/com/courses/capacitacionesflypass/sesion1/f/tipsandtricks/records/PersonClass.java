package com.courses.capacitacionesflypass.sesion1.f.tipsandtricks.records;

import java.util.Objects;

public class PersonClass {
    private final String name;
    private final int age;

    public PersonClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "PersonClass{name='" + name + "', age=" + age + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonClass personClass = (PersonClass) o;
        return age == personClass.age && name.equals(personClass.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
