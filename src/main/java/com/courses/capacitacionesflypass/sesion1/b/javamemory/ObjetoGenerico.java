package com.courses.capacitacionesflypass.sesion1.b.javamemory;

import java.util.Objects;

public class ObjetoGenerico {

    public Integer numero;


    @Override
    public boolean equals(Object o) {

        ObjetoGenerico other = (ObjetoGenerico) o;

        return this.numero.equals(other.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(numero);
    }
}
