package com.markblue.javaspeedrun.collectionframework;

import java.util.*;

public class CF {
    public static void main(String[] args) {
        // List -> ArrayList & LinkedList
        // Set -> HashSet & LinkedHashSet
        // Map -> HashMap & LinkedHashMap

        // ArrayList
        System.out.println("Array List : ");
        System.out.println("------------------");

        //ArrayList<Integer> arrayList1 = new ArrayList();  // Superclass -> List
        List<Integer> arrayList1 = new ArrayList<>(); // Default size -> 10 -> 1.5X size increase after full
        arrayList1.add(1);
        arrayList1.add(2);
        arrayList1.add(3);
        arrayList1.add(4);
        arrayList1.add(5);

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(1);
        arrayList2.add(2);
        arrayList2.add(3);
        arrayList2.add(4);
        arrayList2.add(5);

        arrayList1.addAll(arrayList2);  // Concatenates two lists
        System.out.println("Element at index 1: " + arrayList1.get(1));   // Value at index
        System.out.println("Contains 6: " + arrayList1.contains(6));  // Checks if it exists
        System.out.println("Contents of array List: " + arrayList1);  // Print the arrayList1
        System.out.println();

        //--------------------------------------------------------------------------------------------------------------

        // Linked List
        System.out.println("Linked List : ");
        System.out.println("-----------------");

        List<Integer> linkedList1 = new LinkedList<>();
        linkedList1.add(1);
        linkedList1.add(2);
        linkedList1.add(3);
        linkedList1.add(4);
        linkedList1.add(5);

        System.out.println("Element at index 1: " + linkedList1.get(1));
        System.out.println("Contains 6: " + linkedList1.contains(6));
        System.out.println("Contents of linked list: " + linkedList1);
        System.out.println();

        //--------------------------------------------------------------------------------------------------------------

        // Set -> Hash Set
        System.out.println("HashSet : ");
        System.out.println("-----------------");
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        System.out.println("Element at index 1: " + set1.contains(1));
        System.out.println("Contains 6: " + set1.contains(6));
        System.out.println("Contents of set: " + set1);
        System.out.println();

        //--------------------------------------------------------------------------------------------------------------

        // Map -> Hash Map
        System.out.println("HashMap : ");
        System.out.println("-----------------");

        Map<Integer, Integer> map1 = new HashMap<>();
        map1.put(1, 2);
        map1.put(3, 4);
        map1.put(5, 5);
        System.out.println("Element at key 1: " + map1.get(1));
        System.out.println("Contains key 6: " + map1.containsKey(6));
        System.out.println("Contents of map: " + map1);
        System.out.println();
    }
}
