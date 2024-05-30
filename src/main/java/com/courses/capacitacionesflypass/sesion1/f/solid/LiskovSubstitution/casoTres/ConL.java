package com.courses.capacitacionesflypass.sesion1.f.solid.LiskovSubstitution.casoTres;



// Clase base: Mascota
class MascotaTomas extends Mascota {
    String animar() {
        return "Haciendo feliz a los clientes con mi presencia";
    }
}


// Clase principal para ejecutar el código
public class ConL {
    public static void main(String[] args) {
        // Creando instancias de diferentes empleados
        EmpleadoActivo cocinero = new Cocinero();
        EmpleadoActivo cajero = new Cajero();
        EmpleadoActivo repartidor = new Repartidor();
        Mascota mascota = new Mascota();

        // Poniendo a trabajar a los empleados
        ponerATrabajar(cocinero);  // Salida: Cocinando deliciosas hamburguesas
        ponerATrabajar(cajero);    // Salida: Atendiendo a los clientes y manejando la caja registradora
        ponerATrabajar(repartidor);  // Salida: Repartiendo pedidos a domicilio
        ponerATrabajar(mascota);    // Salida: Haciendo feliz a los clientes con mi presencia
    }

    static void ponerATrabajar(Empleado empleado) {
        System.out.println(empleado.trabajar());
    }

    static void ponerATrabajar(Mascota mascota) {
        System.out.println(mascota.animar());
    }
}

