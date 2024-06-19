package com.courses.capacitacionesflypass.sesion2.f.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class aListCollection {

    public static void main(String[] args) {


        List arrayList = new ArrayList();
        List stack = new Stack();
        List linkedList = new LinkedList();

        // Adding elements to List implementations
        arrayList.add("Element 1");
        arrayList.add("Element 2");
        arrayList.add("Element 3");
        arrayList.add("Element 4");


        ((Stack) stack).push("Stack Element"); // Stack uses push method no Add
        linkedList.add("LinkedList Element");

        //For Enhancement
        for(Object o : arrayList) {
            System.out.println(o);
        }

        // Iterating over List elements
        System.out.println("ArrayList: " + arrayList);
        System.out.println("Stack: " + stack);
        System.out.println("LinkedList: " + linkedList);


        //limpiando lista
        arrayList.clear();
        stack.clear();
        linkedList.clear();

        // Removiendo elementos de las listas
        arrayList.remove(1); // Remueve por índice
        ((Stack) stack).pop(); // Remueve el elemento superior de la pila
        linkedList.remove("LinkedList Element 1"); // Remueve por valor

        // Accediendo a elementos por índice en ArrayList
        System.out.println("\nElement at index 1 in ArrayList: " + arrayList.get(1));

        // Verificando si un elemento existe en la lista
        System.out.println("ArrayList contains 'Element 3': " + arrayList.contains("Element 3"));


        // Verificando si las listas están vacías
        System.out.println("\nIs ArrayList empty? " + arrayList.isEmpty());
        System.out.println("Is Stack empty? " + stack.isEmpty());
        System.out.println("Is LinkedList empty? " + linkedList.isEmpty());

    }
}
