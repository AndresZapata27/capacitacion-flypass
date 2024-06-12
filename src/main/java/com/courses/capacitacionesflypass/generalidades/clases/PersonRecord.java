package com.courses.capacitacionesflypass.generalidades.clases;

import javax.persistence.Entity;

public record PersonRecord(String name,
                           int age) {
}

// Clase que solo sirve para trasportar datos, = DTO
// si un DTO tiene menos de 10 a 15 atributos convertirlo a RECORD
// Requisitos, que no tenga logica compleja
// Desiciones cuando, Inmutabilidad, se usan en recurciones o ciclos de muchisimos datos,
// Listas de mucha data,
// mas efeciente memoria, mejor lectura, y es inmutable, no se puede modificar externamente

//es un poco mas eficiente en memoria
// Hace Lombok , Crea automaticamente Get y Set, constructores,
