package com.courses.capacitacionesflypass.sesion1.f.solid.LiskovSubstitution.casoTres;

// Subclase que rompe el principio de Liskov
class MascotaDeLaTienda extends Empleado {
    @Override
    String trabajar() {
        return "Solo estoy aquí para hacer feliz a los clientes con mi presencia";
    }
}

// Clase principal para ejecutar el código
public class SinL {
    public static void main(String[] args) {
        Empleado cocinero = new Cocinero();
        Empleado cajero = new Cajero();
        Empleado repartidor = new Repartidor();
        Empleado mascota = new MascotaDeLaTienda();

        // Poniendo a trabajar a los empleados
        ponerATrabajar(cocinero);  // Salida: Cocinando deliciosas hamburguesas
        ponerATrabajar(cajero);    // Salida: Atendiendo a los clientes y manejando la caja registradora
        ponerATrabajar(repartidor);  // Salida: Repartiendo pedidos a domicilio
        ponerATrabajar(mascota);    // Salida: Solo estoy aquí para hacer feliz a los clientes con mi presencia
    }

    static void ponerATrabajar(Empleado empleado) {
        System.out.println(empleado.trabajar());
    }
}


