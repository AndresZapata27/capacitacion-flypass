package com.courses.capacitacionesflypass.sesion1.c.garbagecollector.memoryleaks;

import java.util.ArrayList;
import java.util.List;

public class StaticListLeaks {


        // Variable no estática, vinculada a la instancia de la clase
        private static List<MyObject> myObjects = new ArrayList<>();

        public void addObject(MyObject obj) {
            myObjects.add(obj);
        }

        public void clearObjects() {
            myObjects.clear(); // Limpia la lista, permitiendo que el GC recoja los objetos
        }
    }