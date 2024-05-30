package com.courses.capacitacionesflypass.sesion1.f.solid.LiskovSubstitution.casoTres;

// Clase base: Empleado
abstract class Empleado {
    abstract String trabajar();
}

// Subclase: EmpleadoActivo (aquellos que realizan tareas operativas)
abstract class EmpleadoActivo extends Empleado {
    @Override
    abstract String trabajar();
}

// Subclase: Cocinero
class Cocinero extends EmpleadoActivo {
    @Override
    String trabajar() {
        return "Cocinando deliciosas hamburguesas";
    }
}

// Subclase: Cajero
class Cajero extends EmpleadoActivo {
    @Override
    String trabajar() {
        return "Atendiendo a los clientes y manejando la caja registradora";
    }
}

// Subclase: Repartidor
class Repartidor extends EmpleadoActivo {
    @Override
    String trabajar() {
        return "Repartiendo pedidos a domicilio";
    }
}

// Clase base: Empleado
abstract class Mascota {
    abstract String animar();
}

