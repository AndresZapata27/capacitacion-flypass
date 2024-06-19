package com.courses.capacitacionesflypass.sesion2.f.collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class dMapCollections {

    public static void main(String[] args) {

        // Map implementations
        Map hashTable = new Hashtable();
        Map treeMap = new TreeMap();
        Map hashMap = new HashMap();

        // Adding elements to Map implementations
        treeMap.put("key2", "TreeMap Value");
        hashMap.put("key3", "HashMap Value");

        // Iterating over Map elements
        System.out.println("Hashtable: " + hashTable);
        System.out.println("TreeMap: " + treeMap);
        System.out.println("HashMap: " + hashMap);
    }
}
