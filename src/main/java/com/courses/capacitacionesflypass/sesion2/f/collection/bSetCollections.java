package com.courses.capacitacionesflypass.sesion2.f.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class bSetCollections {

    public static void main(String[] args) {

        Set hashSet = new HashSet();
        Set linkedHashSet = new LinkedHashSet();
        Set treeSet = new TreeSet();

        // Adding elements to Set implementations
        hashSet.add("HashSet Element");
        linkedHashSet.add("LinkedHashSet Element");
        treeSet.add("TreeSet Element");

        // Iterating over Set elements
        System.out.println("HashSet: " + hashSet);
        System.out.println("LinkedHashSet: " + linkedHashSet);
        System.out.println("TreeSet: " + treeSet);
    }
}
