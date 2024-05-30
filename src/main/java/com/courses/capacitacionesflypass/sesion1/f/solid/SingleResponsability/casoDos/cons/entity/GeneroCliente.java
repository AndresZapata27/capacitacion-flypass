package com.courses.capacitacionesflypass.sesion1.f.solid.SingleResponsability.casoDos.cons.entity;

import lombok.Getter;

@Getter
public class GeneroCliente {

    private final String valor;

    public GeneroCliente(String valor) {
        if (valor == null) {
            throw new IllegalArgumentException("Genero no puede ser vacio");
        }
        this.valor = valor;
    }

}
