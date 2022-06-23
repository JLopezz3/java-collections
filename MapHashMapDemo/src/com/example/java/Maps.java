package com.example.java;

import java.util.HashMap;

public class Maps {

    public static void main(String[] args) {

        // Map is just a set of KEY,VALUE pairs
        // Map is an INTERFACE
        // HASHMAP is an example of Map
        // Map doesn't guarantee order

        // <KEY, VALUE> must be Java classes, CANNOT BE PRIMITIVE TYPES
        // do not use int, long, float, double.
        HashMap<String, Integer> empIds = new HashMap<>();

        empIds.put("John", 12345);
        empIds.put("Carl", 54321);
        empIds.put("Jerry", 8675309);

        System.out.println(empIds);

        System.out.println(empIds.get("Carl")); // 54321

        System.out.println(empIds.containsKey("Jerry")); // true

        System.out.println(empIds.containsKey("George")); // false

        System.out.println(empIds.containsValue(8675309)); // true

        empIds.put("John", 98765); // this will override current value for John, since John key already exists.
        System.out.println(empIds);

        empIds.replace("John", 777); // replace only works if Key currently exists
        System.out.println(empIds);

        empIds.putIfAbsent("John", 222); // puts the KEY,VALUE pair that you specify if that key doesn't already exist in MAP
        System.out.println(empIds); // would not change John, because it already exists

        empIds.putIfAbsent("Steve", 222); // it would do a put for Steve
        System.out.println(empIds);

        empIds.remove("Steve");
        System.out.println(empIds);



    }
}
