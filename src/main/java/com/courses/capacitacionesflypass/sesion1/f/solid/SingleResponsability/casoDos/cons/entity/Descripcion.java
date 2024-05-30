package com.courses.capacitacionesflypass.sesion1.f.solid.SingleResponsability.casoDos.cons.entity;

import lombok.Getter;

@Getter
public class Descripcion {

    private final String valor;

    public Descripcion(String valor) {
        if (valor == null || valor.isEmpty()) {
            throw new IllegalArgumentException("Descripcion no puede ser vacio");
        }
        this.valor = valor;
    }

}
