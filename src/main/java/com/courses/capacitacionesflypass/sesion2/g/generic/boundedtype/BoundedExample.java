package com.courses.capacitacionesflypass.sesion2.g.generic.boundedtype;

interface Shape {
    double area();
}

interface Colored {
    String getColor();
}

public class BoundedExample<T extends Shape & Colored> {
    private T item;

    public BoundedExample(T item) {
        this.item = item;
    }

    public void printDetails() {
        System.out.println("Area: " + item.area());
        System.out.println("Color: " + item.getColor());
    }

    public static void main(String[] args) {
        class ColoredCircle implements Shape, Colored {
            private double radius;
            private String color;

            public ColoredCircle(double radius, String color) {
                this.radius = radius;
                this.color = color;
            }

            @Override
            public double area() {
                return Math.PI * radius * radius;
            }

            @Override
            public String getColor() {
                return color;
            }
        }

        ColoredCircle circle = new ColoredCircle(5, "Red");
        BoundedExample<ColoredCircle> example = new BoundedExample<>(circle);
        example.printDetails();
    }
}
