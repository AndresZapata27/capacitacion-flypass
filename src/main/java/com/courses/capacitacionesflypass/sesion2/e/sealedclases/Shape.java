package com.courses.capacitacionesflypass.sesion2.e.sealedclases;

public sealed interface Shape permits Circle, Square {
}

final class Circle implements Shape {
    // Implementación específica de Circle
}

final class Square implements Shape {
    // Implementación específica de Square
}
