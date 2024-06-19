package com.courses.capacitacionesflypass.sesion2.g.generic.boundedtype;

public class BoundedBox<T extends Number> {
    private T content;

    public void setContent(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public double doubleValue() {
        return content.doubleValue();
    }

    public static void main(String[] args) {
        BoundedBox<Integer> intBox = new BoundedBox<>();
        intBox.setContent(10);
        System.out.println("Double Value: " + intBox.doubleValue());
    }
}
