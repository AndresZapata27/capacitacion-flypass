package com.courses.capacitacionesflypass.sesion2.g.generic.boundedtype;

public class BoundedBoxErasure {
    private Number content;

    public void setContent(Number content) {
        this.content = content;
    }

    public Number getContent() {
        return content;
    }

    public double doubleValue() {
        return content.doubleValue();
    }

    public static void main(String[] args) {
        BoundedBox intBox = new BoundedBox();
        intBox.setContent(10);
        System.out.println("Double Value: " + intBox.doubleValue());
    }
}
