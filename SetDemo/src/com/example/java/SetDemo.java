package com.example.java;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetDemo {

    public static void main(String[] args) {

//        HashSet<String> set = new HashSet<String>();
        TreeSet<String> set = new TreeSet<String>(); // Data is unordered but is alphabetically sorted

        // Here data is not added as an indexing approach
        // We got hashCodes for elements which are being added
        // John should be added only ONCE, not THREE TIMES
        set.add("John");
        set.add("Jennie");
        set.add("John");
        set.add("Becca");
        set.add("Jim");
        set.add("Jack");
        set.add("Albert");
        set.add("John");
        set.add("Kevin");
        set.add("Joe");

        // 1. Data is Unique, no Redundancy
        // 2. Data is unordered in output due to hashing
        System.out.println("set is: " + set);

        // hashing doesn't allow us to print indexes, so iterate using iterator
        // data is stored using hash table
        Iterator<String> itr = set.iterator();
        while(itr.hasNext()){
            String str = itr.next();
            System.out.println(str);
        }

        set.remove("Jim");
        System.out.println("set after removing Jim is: " + set);
        if(set.contains("John")){
            System.out.println("John is in the set");
        }

        System.out.println("set size is: " + set.size());

    }
}
