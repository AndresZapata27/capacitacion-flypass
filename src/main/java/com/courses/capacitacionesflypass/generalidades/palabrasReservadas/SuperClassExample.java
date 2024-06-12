package com.courses.capacitacionesflypass.generalidades.palabrasReservadas;

import java.util.Objects;

class SuperClassExample extends Object {

    private int id;
    private String name;

    public SuperClassExample() {
        super();
    }

    @Override
    public String toString() {
        return "SuperClassExample{id=" + id + ", name='" + name + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SuperClassExample that = (SuperClassExample) o;
        return id == that.id && name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }



    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
