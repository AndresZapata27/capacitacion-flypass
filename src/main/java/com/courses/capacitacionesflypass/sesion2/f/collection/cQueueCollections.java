package com.courses.capacitacionesflypass.sesion2.f.collection;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class cQueueCollections {

    public static void main(String[] args) {

        Queue queueLinkedList = new LinkedList();
        Queue priorityQueue = new PriorityQueue();
        Queue arrayQueue = new ArrayDeque();

        // Adding elements to Queue implementations
        queueLinkedList.add("LinkedList Queue Element");
        priorityQueue.add("PriorityQueue Element");
        arrayQueue.add("ArrayDeque Element");

        // Iterating over Queue elements
        System.out.println("LinkedList as Queue: " + queueLinkedList);
        System.out.println("PriorityQueue: " + priorityQueue);
        System.out.println("ArrayDeque: " + arrayQueue);

    }
}
